package com.ppai.domain.gestion_mantenimiento;

import java.util.*;

public class Demora {

    private String motivo;
    private Date fechaEstimadaOriginal;
    private Date nuevaFechaEstimada;

    public Demora(String motivo, Date fechaEstimadaOriginal, Date nuevaFechaEstimada) {
        this.motivo = motivo;
        this.fechaEstimadaOriginal = fechaEstimadaOriginal;
        this.nuevaFechaEstimada = nuevaFechaEstimada;
    }

}