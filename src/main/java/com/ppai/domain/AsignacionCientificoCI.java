package com.ppai.domain;

import com.ppai.domain.AsignacionCientifico;

import java.util.*;

public class AsignacionCientificoCI extends AsignacionCientifico {

    private PersonalCientifico cientifico;
    private Turno turnos;

    public AsignacionCientificoCI(PersonalCientifico cientifico, CentroInvestigacion centroInvestigacion, RolPersonalCientifico rol, Date fechaInicio, Date fechaFin, PersonalCientifico personalCientifico, PersonalCientifico cientifico1, Turno turnos) {
        super(cientifico, centroInvestigacion, rol, fechaInicio, fechaFin, personalCientifico);
        this.cientifico = cientifico1;
        this.turnos = turnos;
    }

    public PersonalCientifico mostrarCientifico() {
        return cientifico;
    }

    public Turno mostrarTurnos() {
        return turnos;
    }

}