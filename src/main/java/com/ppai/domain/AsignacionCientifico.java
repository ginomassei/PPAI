package com.ppai.domain;

import java.util.*;

public class AsignacionCientifico {

    private PersonalCientifico cientifico;
    private CentroInvestigacion centroInvestigacion;
    private RolPersonalCientifico rol;
    private Date fechaInicio;
    private Date fechaFin;
    private PersonalCientifico personalCientifico;

    public AsignacionCientifico(PersonalCientifico cientifico, CentroInvestigacion centroInvestigacion, RolPersonalCientifico rol, Date fechaInicio, Date fechaFin, PersonalCientifico personalCientifico) {
        this.cientifico = cientifico;
        this.centroInvestigacion = centroInvestigacion;
        this.rol = rol;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.personalCientifico = personalCientifico;
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