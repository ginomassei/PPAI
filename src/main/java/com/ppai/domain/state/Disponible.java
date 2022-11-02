package com.ppai.domain.state;

import com.ppai.domain.Turno;

import java.util.Date;

public class Disponible extends Estado {
    @Override
    public void reservarTurno(Date fechaHoraActual, Turno turno) {
        this.finalizarUltimoCambioDeEstado(turno);
        this.crearEstadoSiguiente(turno);
        this.crearNuevoCambioEstado(fechaHoraActual, turno);
    }

    @Override
    public String mostrarEstado() {
        return "Disponible";
    }

    @Override
    public void crearEstadoSiguiente(Turno turno) {
        Estado estadoReservado = new Reservado();
        turno.setEstado(estadoReservado);
    }

    @Override
    public boolean esDisponible() {
        return true;
    }
}
