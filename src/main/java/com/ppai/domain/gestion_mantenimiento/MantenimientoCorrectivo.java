package com.ppai.domain;

import java.util.Date;

public class MantenimientoCorrectivo extends Mantenimiento {
    public MantenimientoCorrectivo(Date fechaInicio, Date fechaFin) {
        super(fechaInicio, null, fechaFin);
    }
}