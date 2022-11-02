package com.ppai.domain.gestion_turnos.turno;

import com.ppai.domain.gestion_turnos.turno.estados.EstadoTurno;

import java.util.*;

public class CambioEstadoTurno {
    private Date fechaHoraDesde;
    private Date fechaHoraHasta;
    private EstadoTurno estadoTurno;

    public CambioEstadoTurno(Date fechaHoraDesde, Date fechaHoraHasta, EstadoTurno estadoTurno) {
        this.fechaHoraDesde = fechaHoraDesde;
        this.fechaHoraHasta = fechaHoraHasta;
        this.estadoTurno = estadoTurno;
    }

    public String mostrarEstado() {
        return this.estadoTurno.mostrarEstado();
    }

    public boolean esActual() {
        return fechaHoraHasta == null;
    }

    public void finalizar() {
        this.fechaHoraHasta = new Date();
    }

    public EstadoTurno getEstado() {
        return estadoTurno;
    }
}