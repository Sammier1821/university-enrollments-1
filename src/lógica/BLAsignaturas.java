/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lógica;

import java.util.*;
import entidades.*;
import datos.*;
/**
 *
 * @author Usuario
 */
public class BLAsignaturas {
    
   public static String escribirAsignatura(String codigo,  String nombre, String ciclo, int creditos) {
        String mensaje = null;
        Asignatura asignatura = null;
        asignatura = new Asignatura(codigo,nombre,ciclo,creditos);
        mensaje = DALAsignaturas.escribirAsignatura(asignatura);
        return mensaje;
    }
    
    public static String setAsignatura(int posicion, String codigo, String nombre, String ciclo, int creditos) {
        String mensaje = null;
        Asignatura asignatura = null;
        if(posicion>=0 && posicion<=DALAsignaturas.getNumeroRegistros()) {
            asignatura = new Asignatura(codigo,nombre,ciclo,creditos);
            mensaje = DALAsignaturas.setAsignatura(posicion, asignatura);
        } else
            mensaje = "Número de registro no es válido";
        return mensaje;
    }
    
    public static Asignatura getAsignatura(int pos) {
        Asignatura asignatura = null;
        if(pos>=0 && pos<DALAsignaturas.getNumeroRegistros()) {
            asignatura= DALAsignaturas.getAsignatura(pos);
        }
        return asignatura;
    }
    
    public static List<Asignatura> getAsignaturas() {
        if(DALAsignaturas.getNumeroRegistros()>0)
            return DALAsignaturas.getAsignaturas();
        return null;
    }
    
    public static int getNumeroRegistros() {
        return DALAsignaturas.getNumeroRegistros();
    }
}
