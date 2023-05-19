package datos;

import java.io.*;
import java.time.LocalDate;
import java.util.*;
import entidades.*;

public class DALMatrículas {
   
    private static final String NOMBRE_ARCHIVO = "data_matriculas.txt";
    private static RandomAccessFile flujo;
    private static final int TAMREG = 130;
    private static int numeroRegistros;
    
    public static String crearFlujo() {
        try {
            flujo = new RandomAccessFile(NOMBRE_ARCHIVO, "rw");
            numeroRegistros = (int) Math.ceil((double) flujo.length() / (double) TAMREG);
        } catch (IOException ex) {
            return "Problema al crear el flujo: " + ex.getMessage();
        }
        return null;
    }

    public static String escribirMatricula(Matricula matricula) {
        String mensaje = "";
        try {
            crearFlujo();
            flujo.close();
            mensaje = setMatricula(numeroRegistros, matricula);
            if (mensaje.compareTo("ok") == 0) {
                numeroRegistros++;
            }
        } catch (IOException ex) {
            mensaje = "Excepción;" + ex.getMessage();
        } finally {
            return mensaje;
        }
    }

    public static String setMatricula(int posicion, Matricula matricula) {
        String mensaje = "";
        try {
            if (matricula.getTamaño() + 2 > TAMREG) {
                mensaje = "Tamaño de registro insuficiente";
            } else {
                crearFlujo();
                flujo.seek(posicion * TAMREG);
                
                //FECHA
                flujo.writeInt(matricula.getFecha().getYear());         // 4
                flujo.writeInt(matricula.getFecha().getMonthValue());   // 4
                flujo.writeInt(matricula.getFecha().getDayOfMonth());   // 4
                
                //PeriodoAcademico
                flujo.writeInt(matricula.getPeriodo().getAño());        // 4
                flujo.writeUTF(matricula.getPeriodo().getSemestre());  // 20
                
                //CODIGO estudiante
                flujo.writeUTF(matricula.getEstudiante().getCodigo());    // Code.length() * 2   == 20 max
                
                //CODIGOS asignatura
                for (Asignatura asignatura : matricula.getAsignaturasMatriculadas()) {
                  flujo.writeUTF(asignatura.getCodigo()); // 6 * (Codigo.length() * 2) == 60 max
                }
                
                mensaje = "ok";
            }
        } catch (IOException ex) {
            mensaje = "Exception: " + ex.getMessage();
        } finally {
            try {
                flujo.close();
            } catch (IOException ex) {
                mensaje = "El flujo ya estaba cerrado: " + ex.getMessage();
            }
        }
        return mensaje;
    }

    public static Matricula getMatricula(int pos) {
        LocalDate fecha;
        PeriodoAcademico periodo = new PeriodoAcademico();
        String codigoEstudiante;
        String codigoAsignatura;
        Estudiante estudiante = new Estudiante();
        ArrayList<Asignatura> asignaturasMatriculadas = new ArrayList<>();
        Matricula matricula = null;
        try {
            crearFlujo();
            flujo.seek(pos * TAMREG);
            
            fecha = LocalDate.of(flujo.readInt(), flujo.readInt(), flujo.readInt());
            
            periodo.setAño(flujo.readInt());
            periodo.setSemestre(flujo.readUTF());
            
            codigoEstudiante = flujo.readUTF();
            for (Estudiante student : DALEstudiantes.getEstudiantes()) {
              if (student.getCodigo().compareTo(codigoEstudiante) == 0) {
                estudiante = student;
                break;
              }
            }

            do {
              codigoAsignatura = flujo.readUTF();
              for (Asignatura asignatura : DALAsignaturas.getAsignaturas()) {
                if (asignatura.getCodigo().compareTo(codigoAsignatura) == 0) {
                  asignaturasMatriculadas.add(asignatura);
                  break;
                }
              }
            } while (codigoAsignatura != null);

            matricula = new Matricula(fecha, periodo, estudiante, asignaturasMatriculadas);

        } catch (IOException ex) {
            System.out.println("Problema de E/S: " + ex.getMessage());
        } finally {
            try {
                flujo.close();
            } catch (IOException ex) {
                System.out.println("El flujo ya estaba cerrado: " + ex.getMessage());
            }
        }
        return matricula;
    }

    public static List<Matricula> getMatriculas() {
        List<Matricula> lista = new ArrayList<>();
        try {
            crearFlujo();
            for (int i = 0; i < numeroRegistros; i++) {
                lista.add(getMatricula(i));
            }
        } finally {
            try {
                flujo.close();

            } catch (IOException ex) {
                System.out.println("El flujo ya estaba cerrado: " + ex.getMessage());
            }
        }
        return lista;
    }

    public static int getNumeroRegistros() {
        try {
            crearFlujo();
            flujo.close();
            // Obtiene el numeroRegistros actualizado
        } catch (IOException ex) {
            System.out.println("El flujo ya estaba cerrado: " + ex.getMessage());
        }
        return numeroRegistros;
    }
}