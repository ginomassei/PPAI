package com.ppai.domain;

import java.util.*;

public class MantenimientoPreventivo extends Mantenimiento {
    private Date fechaInicioPrevista;

    public MantenimientoPreventivo(Date fechaInicioPrevista, Date fechaFinPrevista) {
        super(fechaInicioPrevista, null, fechaFinPrevista);
        this.fechaInicioPrevista = fechaInicioPrevista;
    }

    public void registrarDemoras(Demora demora) {
        // TODO implement here
    }
}