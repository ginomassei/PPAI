package com.ppai.domain;

import java.util.*;

public class MantenimientoPreventivo extends Mantenimiento {
    private Date fechaInicioPrevista;

    public MantenimientoPreventivo(Date fechaInicioPrevista) {
        this.fechaInicioPrevista = fechaInicioPrevista;
    }
}