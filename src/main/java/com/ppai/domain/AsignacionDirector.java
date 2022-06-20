package com.ppai.domain;

import java.util.*;

public class AsignacionDirector extends AsignacionCientifico {

    private PersonalCientifico director;

    public AsignacionDirector(PersonalCientifico cientifico, CentroInvestigacion centroInvestigacion, RolPersonalCientifico rol, Date fechaInicio, Date fechaFin, PersonalCientifico personalCientifico, PersonalCientifico director) {
        super(cientifico, rol, fechaInicio, fechaFin);
        this.director = director;
    }

    public PersonalCientifico mostrarDirector() {
        return director;
    }
}