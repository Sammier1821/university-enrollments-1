package lógica;

import java.util.*;
import entidades.*;
import datos.*;

public class BLEstudiantes {
    
    public static String escribirEstudiante(String codigo, String dni, String nombre, String apellidos, String direccion) {
        String mensaje = null;
        Estudiante estudiante = null;
        estudiante = new Estudiante(codigo,dni,nombre,apellidos,direccion);
        mensaje = DALEstudiantes.escribirEstudiante(estudiante);
        return mensaje;
    }
    
    public static String setEstudiante(int posicion, String codigo, String dni, String nombre, String apellidos, String direccion) {
        String mensaje = null;
        Estudiante estudiante = null;
        if(posicion>=0 && posicion<=DALEstudiantes.getNumeroRegistros()) {
            estudiante = new Estudiante(codigo,dni,nombre,apellidos,direccion);
            mensaje = DALEstudiantes.setEstudiante(posicion, estudiante);
        } else
            mensaje = "Número de registro no es válido";
        return mensaje;
    }
    
    public static Estudiante getEstudiante(int pos) {
        Estudiante estudiante = null;
        if(pos>=0 && pos<DALEstudiantes.getNumeroRegistros()) {
            estudiante= DALEstudiantes.getEstudiante(pos);
        }
        return estudiante;
    }
    
    public static List<Estudiante> getEstudiantes() {
        if(DALEstudiantes.getNumeroRegistros()>0)
            return DALEstudiantes.getEstudiantes();
        return null;
    }
    
    public static int getNumeroRegistros() {
        return DALEstudiantes.getNumeroRegistros();
    }
    
}
