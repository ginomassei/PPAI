package com.ppai.domain.gestion_mantenimiento;

import java.util.Date;

public class MantenimientoCorrectivo extends Mantenimiento {
    public MantenimientoCorrectivo(Date fechaInicio, Date fechaFin) {
        super(fechaInicio, null, fechaFin);
    }
}