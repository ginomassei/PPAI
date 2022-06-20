package com.ppai.domain;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class Turno {
    private ArrayList<CambioEstado> cambioEstados;
    private PersonalCientifico cientificoReserva;
    private PersonalCientifico cientifico;
    private Date fechaHoraDesde;
    private Date fechaHoraHasta;
    private SolicitudReservaTurno solicitudesReserva;
    private Date fechaHoraInicioTurno;
    private Date fechaHoraFinTurno;

    public Turno(
        ArrayList<CambioEstado> cambioEstados,
        PersonalCientifico cientificoReserva,
        PersonalCientifico cientifico,
        Date fechaHoraDesde,
        Date fechaHoraHasta,
        SolicitudReservaTurno solicitudesReserva,
        Date fechaHoraInicioTurno,
        Date fechaHoraFinTurno
    ) {
        this.cambioEstados = cambioEstados;
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

    public void reservarTurno(Estado estado) {
        finalizarUltimoCambioEstado();
        CambioEstado nuevoCambioEstado = new CambioEstado(
            new Date(),
            null,
            estado
        );
        cambioEstados.add(nuevoCambioEstado);
    }

    public boolean esActivo() {
        AtomicBoolean activo = new AtomicBoolean(false);
        cambioEstados.forEach(cambioEstado -> {
            if (cambioEstado.esActual()) {
                activo.set(true);
            }
        });
        return activo.get();
    }

    public boolean esPosteriorA(Date today) {
        return fechaHoraDesde.after(today);
    }

    private void finalizarUltimoCambioEstado() {
        for (CambioEstado cambioEstado: cambioEstados) {
            if (cambioEstado.esActual()) {
                cambioEstado.finalizar();
            }
        }
    }
}