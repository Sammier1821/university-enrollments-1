package lógica;

import datos.DALPeriodosAcademicos;
import entidades.PeriodoAcademico;

public class BLPeriodoAcademico {
    
    public static boolean guardarPeriodoAcademico(int año, String semestre) {
        PeriodoAcademico periodoAcademico = null;
        
        if (año > 2022) {
            periodoAcademico = new PeriodoAcademico(año,semestre);
            DALPeriodosAcademicos.escribirPeriodoAcademico(periodoAcademico);
            return true;
        }

        return false;
    }
}
