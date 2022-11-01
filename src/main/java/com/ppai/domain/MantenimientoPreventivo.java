package com.ppai.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.*;

@Data
@Entity
@Table(name = "TURNOS")
public class MantenimientoPreventivo extends Mantenimiento {
    private Date fechaInicioPrevista;

    MantenimientoPreventivo(Date fechaInicioPrevista, Date fechaFinPrevista) {
        super(fechaInicioPrevista, null, fechaFinPrevista);
        this.fechaInicioPrevista = fechaInicioPrevista;
    }

    public void registrarDemoras(Demora demora) {
        // TODO implement here
    }
}