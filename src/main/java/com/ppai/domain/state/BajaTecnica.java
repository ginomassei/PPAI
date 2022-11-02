package com.ppai.domain.state;

import com.ppai.domain.Turno;
import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@Entity
@DiscriminatorValue(value = "BAJA_TECNICA")
public class BajaTecnica extends Estado {
    @Override
    public void crearEstadoSiguiente(Turno turno) {

    }
}
