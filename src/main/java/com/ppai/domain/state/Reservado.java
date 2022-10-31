package com.ppai.domain.state;

import com.ppai.domain.Turno;

import javax.persistence.Entity;

@Entity
public class Reservado extends Estado {

    public Reservado() {}

    @Override
    public void crearEstadoSiguiente(Turno turno) {

    }
}
