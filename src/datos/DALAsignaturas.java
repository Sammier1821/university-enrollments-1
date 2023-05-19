package datos;

import java.io.*;
import java.util.*;
import entidades.*;

public class DALAsignaturas {
    private static final String NOMBRE_ARCHIVO = "data_asignaturas.txt";
    private static RandomAccessFile flujo;
    private static final int TMREG = 132;
    private static int numeroRegistros;
    
    private static String crearFlujo(){
        try{
            flujo = new RandomAccessFile(NOMBRE_ARCHIVO,"rw");
            numeroRegistros = (int)Math.ceil((double)flujo.length()/(double)TMREG);
        }catch(IOException ex){
            return "Error al crear el flujo: " + ex.getMessage();
        }
        return null;
    }

    public static String escribirAsignatura(Asignatura asignatura){
        String mensaje = "";
        try {
            crearFlujo();
            flujo.close();
            mensaje = setAsignatura(numeroRegistros, asignatura);
            if (mensaje.compareTo("ok") == 0) {
                numeroRegistros++;
            }
        } catch (IOException ex) {
            mensaje = "Exception: " + ex.getMessage();
        }
        return mensaje; 
    }

    public static String setAsignatura(int posicion, Asignatura asignatura){
        String mensaje = "";
        try{
            if(asignatura.getTamaño() + 2 > TMREG){
                mensaje = "Tamaño de Registro insuficiente";
            } else {
                crearFlujo();
                flujo.seek(posicion * TMREG);
                flujo.writeUTF(asignatura.getCodigo());
                flujo.writeUTF(asignatura.getNombre());
                flujo.writeUTF(asignatura.getCiclo());
                flujo.writeInt(asignatura.getCreditos());
                mensaje = "ok";
            }
        }catch(IOException ex){
            mensaje = "Error de E/S " + ex.getMessage();
        }
        return mensaje;
    }

    public static Asignatura getAsignatura(int pos){
        String codigo;
        String nombre;
        String ciclo;
        int creditos;
        Asignatura asignatura = null;
        try {
            crearFlujo();
            flujo.seek(pos * TMREG);
            codigo = flujo.readUTF();
            nombre = flujo.readUTF();
            ciclo= flujo.readUTF();
            creditos= flujo.readInt();
            asignatura = new Asignatura(codigo, nombre, ciclo, creditos);
        } catch (IOException ex){
            System.out.println("Problema de E/S: " + ex.getMessage());
        } finally {
            try{
                flujo.close();
            }catch (IOException ex){
                System.out.println("El flujo ya estaba cerrado: " + ex.getMessage());
            }
        }
        return asignatura;
    }
    
    public static List<Asignatura> getAsignaturas(){
        List<Asignatura> lista = new ArrayList<>();
        try {
            crearFlujo();
            for (int i = 0; i < numeroRegistros; i++)
                lista.add(getAsignatura(i));
        } finally {
            try{
                flujo.close();
            }catch (IOException ex){
                System.out.println("El flujo ya estaba cerrado: " + ex.getMessage());
            }
        }
        return lista;
    }

    public static int getNumeroRegistros() {
        try {
            crearFlujo();
            flujo.close();
            //Obtiene el NumRegistro actualizado
        } catch (IOException ex) {
            System.out.println("El flujo ya estaba cerrado: " + ex.getMessage());
        }
        return numeroRegistros;
    }
}