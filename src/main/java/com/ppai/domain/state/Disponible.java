package com.ppai.domain.state;

import com.ppai.domain.Turno;
import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Data
@Entity
@DiscriminatorValue(value = "DISPONIBLE")
public class Disponible extends Estado {
    @Override
    public void reservarTurno(Date fechaHoraActual, Turno turno) {
        this.finalizarUltimoCambioDeEstado(turno);
        this.crearEstadoSiguiente(turno);
        this.crearNuevoCambioEstado(fechaHoraActual, turno);
    }

    @Override
    public void crearEstadoSiguiente(Turno turno) {
        Estado estadoReservado = new Reservado();
        turno.setEstado(estadoReservado);
    }
}
