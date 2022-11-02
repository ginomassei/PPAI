package com.ppai.domain.gestion_turnos.turno.estados;

import com.ppai.domain.gestion_turnos.turno.CambioEstadoTurno;
import com.ppai.domain.gestion_turnos.turno.Turno;

import java.util.ArrayList;
import java.util.Date;

public abstract class EstadoTurno {
    private String nombre;

    public void reservarTurno(Date fechaHoraActual, Turno turno) {
        throw new Error("Transicion inválida");
    }

    public void finalizarUltimoCambioDeEstado(Turno turno) {
        ArrayList<CambioEstadoTurno> cambiosEstado = turno.getCambioEstados();
        for (CambioEstadoTurno cambioEstado : cambiosEstado) {
            if (cambioEstado.esActual()) {
                cambioEstado.finalizar();
            }
        }
    }

    public void crearNuevoCambioEstado(Date fechaHoraDesde, Turno turno) {
        CambioEstadoTurno cambioEstado = new CambioEstadoTurno(fechaHoraDesde, null, turno.getEstado());
        turno.vincularNuevoCambioEstado(cambioEstado);
    }

    public boolean esReservado() {
        return this instanceof Reservado;
    }

    public boolean esDisponible() {
        return this instanceof Disponible;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String mostrarEstado() {
        return this.nombre;
    }
}
