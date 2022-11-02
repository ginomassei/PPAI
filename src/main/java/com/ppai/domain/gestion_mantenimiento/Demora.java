package com.ppai.domain;

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