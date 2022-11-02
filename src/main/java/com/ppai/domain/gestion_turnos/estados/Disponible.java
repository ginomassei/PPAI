package com.ppai.domain.gestion_turnos.estados;

import com.ppai.domain.gestion_turnos.Turno;

import java.util.Date;

/**
 * Clase de estado concreta disponible. Representa un turno que puede ser reservado.
 */
public class Disponible extends EstadoTurno {
    public Disponible() {
        super.setNombre("Disponible");
    }

    /**
     * Finaliza el último cambio de estado del turno. Crea el nuevo estado y lo setea al turno.
     * Delega la responsabilidad de crear y setear el nuevo cambio de estado a otro método.
     * @param fechaHoraActual Fecha hora de la reserva.
     * @param turno El turno al cual le vamos a cambiar el estado.
     */
    @Override
    public void reservarTurno(Date fechaHoraActual, Turno turno) {
        this.finalizarUltimoCambioDeEstado(turno, fechaHoraActual);
        EstadoTurno estadoTurnoReservado = new Reservado();
        turno.setEstado(estadoTurnoReservado);
        this.crearNuevoCambioEstado(fechaHoraActual, turno, estadoTurnoReservado);
    }
}
