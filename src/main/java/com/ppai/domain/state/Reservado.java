package com.ppai.domain.state;

import com.ppai.domain.Turno;

public class Reservado extends Estado {

    @Override
    public void crearEstadoSiguiente(Turno turno) {

    }

    @Override
    public boolean esReservado() {
        return true;
    }

    @Override
    public String mostrarEstado() {
        return "Reservado";
    }
}
