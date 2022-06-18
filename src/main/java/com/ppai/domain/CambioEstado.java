package com.ppai.domain;

import java.util.*;

public class CambioEstado {

    private Date fechaHoraDesde;
    private Date fechaHoraHasta;
    private Estado estado;

    public CambioEstado(Date fechaHoraDesde, Date fechaHoraHasta, Estado estado) {
        this.fechaHoraDesde = fechaHoraDesde;
        this.fechaHoraHasta = fechaHoraHasta;
        this.estado = estado;
    }

    public String mostrarEstado(){
        return this.estado.mostrar();
    }

    public boolean esActual() {
        return fechaHoraHasta == null;
    }

}