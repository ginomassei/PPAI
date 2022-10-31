package com.ppai.domain;

import java.util.*;

public class AsignacionCientifico {

    private PersonalCientifico cientifico;
    private Date fechaInicio;
    private Date fechaFin;

    public AsignacionCientifico(PersonalCientifico cientifico, Date fechaInicio, Date fechaFin) {
        this.cientifico = cientifico;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public boolean esCientificoActivo() {
        if (this.fechaFin == null) {
            return true;
        } else return new Date().before(this.fechaFin);
    }

    public boolean esTuCientifico(PersonalCientifico cientifico) {
        return this.cientifico.equals(cientifico);
    }
}