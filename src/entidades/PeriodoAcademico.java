package entidades;

import java.io.Serializable;

public class PeriodoAcademico implements Serializable {
    
    private int año;            // 4 bytes    
    private String semestre;    // 20 bytes "I", "II", "NIVELACION"
    public static final String SEMESTRE_I = "I";
    public static final String SEMESTRE_II = "II";
    public static final String SEMESTRE_NIVELACION = "NIVELACIÓN";
    public static final String semestres[] = {"I", "II", "NIVELACIÓN"};
    
    public PeriodoAcademico(){
        this(0,"12Nivelacion");
    }
    public PeriodoAcademico(int año, String semestre) {
        this.año = año;
        this.semestre = semestre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public int getTamaño() {
        return (getSemestre().length()) * 2 + 4; // MAXIMO: 24 bytes
    }
    
    @Override
    public String toString() {
        return getAño() + "-" + getSemestre();
    }       // 4 caracteres + 1c. + 10 caracteres(max.)
}
