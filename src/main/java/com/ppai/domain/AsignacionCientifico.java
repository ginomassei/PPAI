package com.ppai.domain;

import java.util.*;

public class AsignacionCientifico {

    private PersonalCientifico cientifico;
    private RolPersonalCientifico rol;
    private Date fechaInicio;
    private Date fechaFin;

    public AsignacionCientifico(PersonalCientifico cientifico, RolPersonalCientifico rol, Date fechaInicio, Date fechaFin) {
        this.cientifico = cientifico;
        this.rol = rol;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public void esActual() {
        // TODO implement here
    }

    public void esCientificoActivo() {
        // TODO implement here
    }

    public void esCientifico() {
        // TODO implement here
    }

}