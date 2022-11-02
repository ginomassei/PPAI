package com.ppai.domain.gestion_cientificos.asignaciones;

import com.ppai.domain.gestion_centro_investigacion.CentroInvestigacion;
import com.ppai.domain.gestion_cientificos.cientifico.PersonalCientifico;

import java.util.*;

public class AsignacionDirector extends AsignacionCientifico {

    private PersonalCientifico director;

    public AsignacionDirector(PersonalCientifico cientifico, CentroInvestigacion centroInvestigacion, Date fechaInicio, Date fechaFin, PersonalCientifico personalCientifico, PersonalCientifico director) {
        super(cientifico, fechaInicio, fechaFin);
        this.director = director;
    }

    public PersonalCientifico mostrarDirector() {
        return director;
    }
}