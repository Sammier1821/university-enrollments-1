package lógica;

import datos.DALPeriodosAcademicos;
import entidades.PeriodoAcademico;

public class BLPeriodosAcademicos {
    
    public static boolean guardarPeriodoAcademico(int año, String semestre) {
        PeriodoAcademico periodoAcademico = null;
        
        if (año > 2022) {
            periodoAcademico = new PeriodoAcademico(año,semestre);
            DALPeriodosAcademicos.escribirPeriodoAcademico(periodoAcademico);
            return true;
        }

        return false;
    }
    
    public static boolean existePeriodoAcademico() {
        PeriodoAcademico periodo;
        periodo = DALPeriodosAcademicos.getPeriodoAcademico(0);
        if (periodo != null)
            return true;
        return false;
    }
    
    public static PeriodoAcademico obtenerUltimoPeriodoAcademico() {
        PeriodoAcademico periodo;
        periodo = DALPeriodosAcademicos.getPeriodoAcademico(
                DALPeriodosAcademicos.getNumeroPeriodosAcademicos() - 1);
        return periodo;
    }
    
}
