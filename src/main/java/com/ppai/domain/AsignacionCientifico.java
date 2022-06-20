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

    public boolean esCientificoActivo() {
        if (this.fechaFin == null) {
            return false;
        } else return new Date(System.currentTimeMillis()).before(this.fechaFin);
    }

    public boolean esCientifico(PersonalCientifico cientifico) {
        return this.cientifico.equals(cientifico);
    }
}