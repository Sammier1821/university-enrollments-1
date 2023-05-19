package datos;

import java.io.*;
import java.util.*;
import entidades.*;

public class DALEstudiantes {
    private static final String NOMBRE_ARCHIVO = "data_estudiantes.txt";
    private static RandomAccessFile flujo;
    private static final int TMREG = 236;
    private static int numeroRegistros;
    
    private static String crearFlujo(){
        try{
            flujo = new RandomAccessFile(NOMBRE_ARCHIVO,"rw");
            numeroRegistros = (int) Math.ceil((double)flujo.length()/(double)TMREG);
        }catch(IOException ex){
            return "Error al crear el flujo: " + ex.getMessage();
        }
        return null;
    }

    public static String escribirEstudiante(Estudiante estudiante){
        String mensaje = "";
        try {
            crearFlujo();
            flujo.close();
            mensaje = setEstudiante(numeroRegistros, estudiante);
            if (mensaje.compareTo("ok") == 0) {
                numeroRegistros++;
            }
        } catch (IOException ex) {
            mensaje = "Exception: " + ex.getMessage();
        }
        return mensaje;
    }

    public static String setEstudiante(int posicion, Estudiante estudiante){
        String mensaje = "";
        try{
            if(estudiante.getTamaño()+2 > TMREG){
                mensaje = "Tamaño de Registro insuficiente";
            }else{
                crearFlujo();
                flujo.seek(posicion*TMREG);
                flujo.writeUTF(estudiante.getCode());
                flujo.writeUTF(estudiante.getDNI());
                flujo.writeUTF(estudiante.getNombre());
                flujo.writeUTF(estudiante.getApellidos());
                flujo.writeUTF(estudiante.getDireccion());
                mensaje = "ok";
            }
        }catch(IOException ex){
            mensaje = "Error de E/S " + ex.getMessage();
        }
        return mensaje;
    }

    public static Estudiante getEstudiante(int pos){
        String code;
        String DNI;
        String nombre;
        String apellidos;
        String direccion;
        Estudiante estudiante = null;
        try {
            crearFlujo();
            flujo.seek(pos*TMREG);
            code = flujo.readUTF();
            DNI = flujo.readUTF();
            nombre = flujo.readUTF();
            apellidos = flujo.readUTF();
            direccion = flujo.readUTF();
            estudiante = new Estudiante(code, DNI, nombre, 
                    apellidos, direccion);
        } catch (IOException ex) {
            System.out.println("Problema de E/S: " + ex.getMessage());
        } finally {
            try {
                flujo.close();
            } catch (IOException ex) {
                System.out.println("El flujo ya estaba cerrado: " + ex.getMessage());
            }
        };
        return estudiante;
    }
    
    public static List<Estudiante> getEstudiantes(){
        List<Estudiante> list = new ArrayList<>();
        try{
            crearFlujo();
            for(int i = 0; i < numeroRegistros; i++){
                list.add(getEstudiante((i)));
            }
        } finally{
            try{
                flujo.close();
            } catch(IOException ex){
                System.out.println("El flujo ya estaba cerrado: " + 
                        ex.getMessage());
            }
        }
        return list;
    }

    public static int getNumeroRegistros() {
        try {
            crearFlujo();
            flujo.close();
            //Obtiene el numeroRegistros actualizado
        } catch (IOException ex) {
            System.out.println("El flujo ya estaba cerrado: " + 
                    ex.getMessage());
        }
        return numeroRegistros;
    }
}
