package com.ppai.domain.gestion_turnos.turno.estados;

import com.ppai.domain.gestion_turnos.turno.Turno;

import java.util.Date;

public class Disponible extends EstadoTurno {
    public Disponible() {
        super.setNombre("Disponible");
    }

    @Override
    public void reservarTurno(Date fechaHoraActual, Turno turno) {
        this.finalizarUltimoCambioDeEstado(turno);
        EstadoTurno estadoTurnoReservado = new Reservado();
        turno.setEstado(estadoTurnoReservado);
        this.crearNuevoCambioEstado(fechaHoraActual, turno);
    }
}
