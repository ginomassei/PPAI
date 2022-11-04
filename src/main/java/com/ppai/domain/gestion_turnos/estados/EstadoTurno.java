package com.ppai.domain.gestion_turnos.estados;

import com.ppai.domain.gestion_turnos.CambioEstadoTurno;
import com.ppai.domain.gestion_turnos.Turno;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;

/**
 * Esta clase pertenece a la implementación del patrón de diseño State, para gestionar los estados de la clase turno.
 * <p>
 * Esta clase implementará los metodos correspondientes a los cambio de estado de la clase turno lanzándo un error
 * de transición inválida para los métodos que no hayan sido implementados por las clases estado concretas.
 * <p>
 * Además de que contiene los métodos que responden a que instancia de EstadoTurno responde cada clase en particular.
 */
@Data
public abstract class EstadoTurno {
    private String nombre;

    /**
     * Este método debe ser sobreescrito por las clases concreta que corresponde para realizar la reserva del turno.
     * @param fechaHoraActual Fecha hora de la reserva.
     * @param turno El turno al cual le vamos a cambiar el estado.
     */
    public void reservarTurno(Date fechaHoraActual, Turno turno) {
        throw new Error("Transicion inválida");
    }

    /**
     * Este método debe ser sobreescrito por las clases concreta que corresponde para realizar la reserva del turno.
     */
    public void registrarUso() {
        throw new Error("Transicion inválida");
    }

    /**
     * Este método debe ser sobreescrito por las clases concreta que corresponde para realizar la reserva del turno.
     */
    public void registrarFinUso() {
        throw new Error("Transicion inválida");
    }

    /**
     * Este método debe ser sobreescrito por las clases concreta que corresponde para realizar la reserva del turno.
     */
    public void cancelarReserva() {
        throw new Error("Transicion inválida");
    }

    /**
     * Este método debe ser sobreescrito por las clases concreta que corresponde para realizar la reserva del turno.
     */
    public void anular() {
        throw new Error("Transicion inválida");
    }

    /**
     * Este método debe ser sobreescrito por las clases concreta que corresponde para realizar la reserva del turno.
     */
    public void cancelarPorMantenimiento() {
        throw new Error("Transicion inválida");
    }

    /**
     * Común para todos los estados del turno concretos. Este método se encarga de finalizar el último cambio de estado
     * del turno para dar paso a un nuevo cambio de estado.
     * @param turno el turno a finalizar el cambio de estado.
     */
    public void finalizarUltimoCambioDeEstado(Turno turno, Date fechaHoraActual) {
        ArrayList<CambioEstadoTurno> cambiosEstado = turno.getCambioEstados();
        for (CambioEstadoTurno cambioEstado : cambiosEstado) {
            if (cambioEstado.esActual()) {
                cambioEstado.setFechaHoraHasta(fechaHoraActual);
                break;
            }
        }
    }

    /**
     * Responsable de crear el nuevo cambio de estado y vincularlo al turno.
     * @param fechaHoraDesde Hora de inicio del cambio de estado.
     * @param turno Turno en cuestion.
     */
    public void crearNuevoCambioEstado(Date fechaHoraDesde, Turno turno, EstadoTurno nuevoEstado) {
        CambioEstadoTurno cambioEstado = new CambioEstadoTurno(fechaHoraDesde, null, nuevoEstado);
        turno.vincularNuevoCambioEstado(cambioEstado);
    }

    public boolean esReservado() {
        return this instanceof Reservado;
    }

    public boolean esDisponible() {
        return this instanceof Disponible;
    }

    public boolean esPendienteDeConfirmacion() {
        return this instanceof PendienteConfirmacion;
    }

    public boolean esAnuladoNoEjecutado() {
        return this instanceof AnuladoNoEjecutado;
    }

    public boolean esCanceladoPorMantenimiento() {
        return this instanceof CanceladoPorMantenimiento;
    }

    public boolean esEnUso() {
        return this instanceof EnUso;
    }

    public boolean esFinalizado() {
        return this instanceof Finalizado;
    }

    public boolean esAnulado() {
        return this instanceof Anulado;
    }
}
