package com.ppai.domain;

import java.util.*;

public class Disponibilidad {

    private Date dia;
    private FranjaHoraria franjasHorarias;
    private Date fechaVigenciaDesde;
    private Date fechaVigenciaHasta;

    public Disponibilidad(Date dia, FranjaHoraria franjasHorarias, Date fechaVigenciaDesde, Date fechaVigenciaHasta) {
        this.dia = dia;
        this.franjasHorarias = franjasHorarias;
        this.fechaVigenciaDesde = fechaVigenciaDesde;
        this.fechaVigenciaHasta = fechaVigenciaHasta;
    }

    public void modificar() {
        // TODO implement here
    }

    public void mostrar() {
        // TODO implement here
    }

}