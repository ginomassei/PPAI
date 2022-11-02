package com.ppai.domain.state;

import com.ppai.domain.CambioEstado;
import com.ppai.domain.Turno;
import org.jboss.resteasy.reactive.common.NotImplementedYet;

import java.util.ArrayList;
import java.util.Date;

public abstract class Estado {
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

    public boolean esReservado() {
        return false;
    }

    public boolean esBajaTecnica() {
        return false;
    }

    public boolean esBajaDefinitiva() {
        return false;
    }

    public abstract String mostrarEstado();
}