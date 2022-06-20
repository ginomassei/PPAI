package com.ppai.domain;

import java.util.*;

public class AsignacionRT extends AsignacionCientifico {

    private RecursoTecnologico recursoTecnologico;

    public AsignacionRT(PersonalCientifico cientifico, CentroInvestigacion centroInvestigacion, RolPersonalCientifico rol, Date fechaInicio, Date fechaFin, PersonalCientifico personalCientifico, RecursoTecnologico recursoTecnologico) {
        super(cientifico, rol, fechaInicio, fechaFin);
        this.recursoTecnologico = recursoTecnologico;
    }
}