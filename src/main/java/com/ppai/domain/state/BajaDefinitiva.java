package com.ppai.domain.state;

import com.ppai.domain.Turno;

public class BajaDefinitiva extends Estado {
    @Override
    public void crearEstadoSiguiente(Turno turno) {

    }

    @Override
    public boolean esBajaDefinitiva() {
        return true;
    }

    @Override
    public String mostrarEstado() {
        return "Baja Definitiva";
    }
}
