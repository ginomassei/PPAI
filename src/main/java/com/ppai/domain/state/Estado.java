package com.ppai.domain.state;

import com.ppai.domain.CambioEstado;
import com.ppai.domain.Turno;
import org.jboss.resteasy.reactive.common.NotImplementedYet;

import java.util.ArrayList;
import java.util.Date;

public abstract class Estado {
    private String nombre;

    public abstract void crearEstadoSiguiente(Turno turno);

    public void reservarTurno(Date fechaHoraActual, Turno turno) {
        throw new NotImplementedYet();
    }

    public void finalizarUltimoCambioDeEstado(Turno turno) {
        ArrayList<CambioEstado> cambiosEstado = turno.getCambioEstados();
        for (CambioEstado cambioEstado : cambiosEstado) {
            if (cambioEstado.esActual()) {
                cambioEstado.finalizar();
            }
        }
    }

    public void crearNuevoCambioEstado(Date fechaHoraDesde, Turno turno) {
        CambioEstado cambioEstado = new CambioEstado(fechaHoraDesde, null, turno.getEstado());
        turno.vincularNuevoCambioEstado(cambioEstado);
    }

    public String mostrar() {
        return this.nombre;
    }

    public boolean esReservado() {
        return this.nombre.equals("Reservado");
    }

    public boolean esBajaTecnica() {
        return this.nombre.equals("Baja Tecnica");
    }

    public boolean esBajaDefinitiva() {
        return this.nombre.equals("Baja Definitiva");
    }
}