package com.ppai.domain.gestion_cientificos.asignaciones;

import com.ppai.domain.gestion_centro_investigacion.CentroInvestigacion;
import com.ppai.domain.gestion_cientificos.cientifico.PersonalCientifico;
import com.ppai.domain.gestion_recursos_tecnologicos.RecursoTecnologico;

import java.util.*;

public class AsignacionRT extends AsignacionCientifico {

    private RecursoTecnologico recursoTecnologico;

    public AsignacionRT(PersonalCientifico cientifico, CentroInvestigacion centroInvestigacion, Date fechaInicio, Date fechaFin, PersonalCientifico personalCientifico, RecursoTecnologico recursoTecnologico) {
        super(cientifico, fechaInicio, fechaFin);
        this.recursoTecnologico = recursoTecnologico;
    }
}