package com.ppai.domain;

import java.util.*;

public class CambioEstado {

    private Date fechaHoraDesde;
    private Date fechaHoraHasta;
    private Estado e;

    public CambioEstado(Date fechaHoraDesde, Date fechaHoraHasta, Estado e) {
        this.fechaHoraDesde = fechaHoraDesde;
        this.fechaHoraHasta = fechaHoraHasta;
        this.e = e;
    }

    public void esActual() {
        // TODO implement here
    }

}