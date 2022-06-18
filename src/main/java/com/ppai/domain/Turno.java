package com.ppai.domain;

import java.util.*;

public class Turno {
    private ArrayList<CambioEstado> estado;
    private PersonalCientifico cientificoReserva;
    private PersonalCientifico cientifico;
    private Date fechaHoraDesde;
    private Date fechaHoraHasta;
    private SolicitudReservaTurno solicitudesReserva;
    private Date fechaHoraInicioTurno;
    private Date fechaHoraFinTurno;

    public Turno(ArrayList<CambioEstado> estado, PersonalCientifico cientificoReserva, PersonalCientifico cientifico, Date fechaHoraDesde, Date fechaHoraHasta, SolicitudReservaTurno solicitudesReserva, Date fechaHoraInicioTurno, Date fechaHoraFinTurno) {
        this.estado = estado;
        this.cientificoReserva = cientificoReserva;
        this.cientifico = cientifico;
        this.fechaHoraDesde = fechaHoraDesde;
        this.fechaHoraHasta = fechaHoraHasta;
        this.solicitudesReserva = solicitudesReserva;
        this.fechaHoraInicioTurno = fechaHoraInicioTurno;
        this.fechaHoraFinTurno = fechaHoraFinTurno;
    }

    public void notificarInasistencia() {
        // TODO implement here
    }

    public void reservarTurno() {
        // TODO implement here
    }

    public void esActivo() {
        // TODO implement here
    }

    public void esPosteriorA() {
        // TODO implement here
    }

    public void cambiarEstado() {
        // TODO implement here
    }

    public void vincularNuevoCambioEstado() {
        // TODO implement here
    }

    public void finalizarUltimoCambioEstado() {
        // TODO implement here
    }

}