package entidades;

import java.time.*;
import java.util.ArrayList;

public class Matricula {
    private LocalDate fecha; // 3 int: año + mes + dia (4 + 4 + 4 = 12) Bytes
    private PeriodoAcademico periodo;                       // .toString (Maximo: 24 Bytes)
    private Estudiante estudiante;                          // CodigoEstudiante (20 bytes)
    private ArrayList<Asignatura> asignaturasMatriculadas;  // Maximo 6 asignaturas (48 bytes)

    public Matricula() {
        this(LocalDate.of(1900, Month.JANUARY, 1), new PeriodoAcademico(), new Estudiante(), new ArrayList<>());
    }

    public Matricula(LocalDate fecha, PeriodoAcademico periodo, Estudiante estudiante, ArrayList<Asignatura> asignaturasMatriculadas) {
        this.fecha = fecha;
        this.periodo = periodo;
        this.estudiante = estudiante;
        this.asignaturasMatriculadas = asignaturasMatriculadas;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public PeriodoAcademico getPeriodo() {
        return periodo;
    }

    public void setPeriodo(PeriodoAcademico periodo) {
        this.periodo = periodo;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public ArrayList<Asignatura> getAsignaturasMatriculadas() {
        return asignaturasMatriculadas;
    }

    public void setAsignaturasMatriculadas(ArrayList<Asignatura> asignaturasMatriculadas) {
        this.asignaturasMatriculadas = asignaturasMatriculadas;
    }

    public int getTamaño() {
        int tamaño = 0;
        tamaño += (getPeriodo().toString().length() + 
        getEstudiante().getCode().length())*2 + 4 + (4 + 4 + 4); // LocalDate: 3 int
        for (Asignatura asignatura : getAsignaturasMatriculadas()) {
            tamaño += asignatura.getCodigo().length();          
        }
        return tamaño;
    }
}
