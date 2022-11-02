package com.ppai.domain.state;

import com.ppai.domain.Turno;
import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@Entity
@DiscriminatorValue(value = "RESERVADO")
public class Reservado extends Estado {

    @Override
    public void crearEstadoSiguiente(Turno turno) {

    }
}
