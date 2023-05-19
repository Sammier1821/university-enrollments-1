package datos;

import java.io.*;
import java.util.*;
import entidades.*;

public class DALPeriodosAcademicos {
    private static final String NOMBRE_ARCHIVO = "data_periodos_academicos.txt";
    private static RandomAccessFile flujo;
    private static final int TMREG = 25;
    private static int numeroPeriodosAcademicos;
    
    private static String crearFlujo(){
        try{
            flujo = new RandomAccessFile(NOMBRE_ARCHIVO,"rw");
            numeroPeriodosAcademicos = (int) Math.ceil((double)flujo.length()/(double)TMREG);
        } catch (IOException ex){
            return "Error al crear el flujo: " + ex.getMessage();
        }
        return null;
    }

    public static String escribirPeriodoAcademico(PeriodoAcademico periodoAcademico){
        String mensaje = "";
        try {
            crearFlujo();
            flujo.close();
            mensaje = setPeriodoAcademico(numeroPeriodosAcademicos, periodoAcademico);
            if (mensaje.compareTo("ok") == 0) {
                numeroPeriodosAcademicos++;
            }
        } catch (IOException ex) {
            mensaje = "Exception: " + ex.getMessage();
        }
        return mensaje; 
    }

    public static String setPeriodoAcademico(int posicion, PeriodoAcademico periodoAcademico){
        String mensaje = "";
        try{
            if(periodoAcademico.getTamaño() + 2 > TMREG){
                mensaje = "Tamaño de Registro insuficiente";
            } else {
                crearFlujo();
                flujo.seek(posicion * TMREG);
                flujo.writeInt(periodoAcademico.getAño());
                flujo.writeUTF(periodoAcademico.getSemestre());
                mensaje = "ok";
            }
        }catch(IOException ex){
            mensaje = "Error de E/S " + ex.getMessage();
        }
        return mensaje;
    }

    public static PeriodoAcademico getPeriodoAcademico(int pos){
        int año;
        String semestre;
        PeriodoAcademico periodoAcademico = null;
        try {
            crearFlujo();
            flujo.seek(pos * TMREG);
            año = flujo.readInt();
            semestre = flujo.readUTF();
            periodoAcademico = new PeriodoAcademico(año, semestre);
        } catch (IOException ex){
            System.out.println("Problema de E/S: " + ex.getMessage());
        } finally {
            try{
                flujo.close();
            }catch (IOException ex){
                System.out.println("El flujo ya estaba cerrado: " + ex.getMessage());
            }
        }
        return periodoAcademico;
    }
    
    public static ArrayList<PeriodoAcademico> getperiodoAcademicos(){
        ArrayList<PeriodoAcademico> lista = new ArrayList<>();
        try {
            crearFlujo();
            for (int i = 0; i < numeroPeriodosAcademicos; i++)
                lista.add(getPeriodoAcademico(i));
        } finally {
            try{
                flujo.close();
            }catch (IOException ex){
                System.out.println("El flujo ya estaba cerrado: " + ex.getMessage());
            }
        }
        return lista;
    }

    public static int getnumeroPeriodosAcademicos() {
        try {
            crearFlujo();
            flujo.close();
            //Obtiene el NumRegistro actualizado
        } catch (IOException ex) {
            System.out.println("El flujo ya estaba cerrado: " + ex.getMessage());
        }
        return numeroPeriodosAcademicos;
    }
}