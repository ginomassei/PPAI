package com.ppai.domain.state;

import com.ppai.domain.Turno;

public class BajaTecnica extends Estado {
    @Override
    public void crearEstadoSiguiente(Turno turno) {

    }

    @Override
    public boolean esBajaTecnica() {
        return true;
    }

    @Override
    public String mostrarEstado() {
        return "Baja Técnicaq";
    }
}
