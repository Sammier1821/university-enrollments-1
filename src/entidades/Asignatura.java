package entidades;

import java.io.*;

public class Asignatura implements Serializable {
    private String codigo;      // 4 caracteres     8 bytes
    private String nombre;      // 50 caracteres    100 bytes
    private String ciclo;       // 10 caracteres    20 bytes
    private int creditos;       //                  4 bytes
    public static final String ciclos[] = {
        "PRIMERO", "SEGUNDO", "TERCERO", "CUARTO", "QUINTO",
        "SEXTO", "SEPTIMO", "OCTAVO", "NOVENO", "DECIMO"};

    public Asignatura() {
        this("CO","NN","CI", 0);
    }

    public Asignatura(String codigo, String nombre, String ciclo, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciclo = ciclo;
        this.creditos = creditos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    public int getTamaño(){
        return (getCodigo().length() + getNombre().length() + getCiclo().length())*2 + 4;
    }
}
