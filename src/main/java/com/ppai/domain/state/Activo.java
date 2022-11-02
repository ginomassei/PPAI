package com.ppai.domain.state;

import com.ppai.domain.Turno;

public class Activo extends Estado {
    @Override
    public void crearEstadoSiguiente(Turno turno) {

    }

    @Override
    public String mostrarEstado() {
        return "Activo";
    }
}
