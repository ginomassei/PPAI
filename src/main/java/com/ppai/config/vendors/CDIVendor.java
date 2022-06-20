package com.ppai.config.vendors;

import com.ppai.domain.*;
import io.quarkus.runtime.Startup;

import javax.annotation.PostConstruct;
import javax.ejb.DependsOn;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.Date;

@Singleton
@Startup
@DependsOn(value = {"RecursosVendor", "CientificosVendor"})
public class CDIVendor {
    @Inject
    RecursosVendor recursosVendor;

    @Inject
    CientificosVendor cientificosVendor;

    private ArrayList<CentroInvestigacion> centrosInvestigacion;

    @PostConstruct
    public void init() {
        centrosInvestigacion = new ArrayList<>();

        crearCentrosInvestigacion();
    }

    public ArrayList<CentroInvestigacion> getCentrosInvestigacion() {
        return centrosInvestigacion;
    }

    public void crearCentrosInvestigacion() {
        ArrayList<RecursoTecnologico> recursosCentro1 = new ArrayList<>();
        ArrayList<RecursoTecnologico> recursosCentro2 = new ArrayList<>();
        ArrayList<RecursoTecnologico> recursosCentro3 = new ArrayList<>();
        ArrayList<RecursoTecnologico> recursosCentro4 = new ArrayList<>();

        Date fechaDesde1 = new Date(2022,01,23);

        recursosCentro1.add(recursosVendor.getRecursosTecnologicos().get(0));
        recursosCentro1.add(recursosVendor.getRecursosTecnologicos().get(3));
        recursosCentro1.add(recursosVendor.getRecursosTecnologicos().get(6));
        recursosCentro1.add(recursosVendor.getRecursosTecnologicos().get(9));
        recursosCentro1.add(recursosVendor.getRecursosTecnologicos().get(12));

        ArrayList<AsignacionCientificoCI> asignacionesCentro1 = new ArrayList<>();
        asignacionesCentro1.add(cientificosVendor.getAsignacionesCientificoCI().get(0));
        asignacionesCentro1.add(cientificosVendor.getAsignacionesCientificoCI().get(1));

        CentroInvestigacion centro1 = new CentroInvestigacion(
            "Estructura",
            "EST",
            null,
            null,
            null,
            null,
            null,
            fechaDesde1,
            null,
            null,
            null,
            recursosCentro1,
            null,
            null,
            null,
            null,
            null,
            null,
            asignacionesCentro1
        );

        Date fechaDesde2 = new Date(2022,01,23);

        recursosCentro2.add(recursosVendor.getRecursosTecnologicos().get(1));
        recursosCentro2.add(recursosVendor.getRecursosTecnologicos().get(4));
        recursosCentro2.add(recursosVendor.getRecursosTecnologicos().get(7));
        recursosCentro2.add(recursosVendor.getRecursosTecnologicos().get(10));
        recursosCentro2.add(recursosVendor.getRecursosTecnologicos().get(13));

        ArrayList<AsignacionCientificoCI> asignacionesCentro2 = new ArrayList<>();
        asignacionesCentro2.add(cientificosVendor.getAsignacionesCientificoCI().get(2));
        asignacionesCentro2.add(cientificosVendor.getAsignacionesCientificoCI().get(3));

        CentroInvestigacion centro2 = new CentroInvestigacion(
            "Quimica",
            "QUI",
            null,
            null,
            null,
            null,
            null,
            fechaDesde2,
            null,
            null,
            null,
            recursosCentro2,
            null,
            null,
            null,
            null,
            null,
            null,
            asignacionesCentro2
        );

        Date fechaDesde3 = new Date(2022,01,23);

        recursosCentro3.add(recursosVendor.getRecursosTecnologicos().get(2));
        recursosCentro3.add(recursosVendor.getRecursosTecnologicos().get(5));
        recursosCentro3.add(recursosVendor.getRecursosTecnologicos().get(8));
        recursosCentro3.add(recursosVendor.getRecursosTecnologicos().get(11));
        recursosCentro3.add(recursosVendor.getRecursosTecnologicos().get(14));

        ArrayList<AsignacionCientificoCI> asignacionesCentro3 = new ArrayList<>();
        asignacionesCentro3.add(cientificosVendor.getAsignacionesCientificoCI().get(4));
        asignacionesCentro3.add(cientificosVendor.getAsignacionesCientificoCI().get(5));

        CentroInvestigacion centro3 = new CentroInvestigacion(
            "Fisica",
            "FIS",
            null,
            null,
            null,
            null,
            null,
            fechaDesde3,
            null,
            null,
            null,
            recursosCentro3,
            null,
            null,
            null,
            null,
            null,
            null,
            asignacionesCentro3
        );

        Date fechaDesde4 = new Date(2022,01,23);
        Date fechaBaja4 = new Date(2022,02,23);

        recursosCentro4.add(recursosVendor.getRecursosTecnologicos().get(1));
        recursosCentro4.add(recursosVendor.getRecursosTecnologicos().get(3));
        recursosCentro4.add(recursosVendor.getRecursosTecnologicos().get(7));
        recursosCentro4.add(recursosVendor.getRecursosTecnologicos().get(11));
        recursosCentro4.add(recursosVendor.getRecursosTecnologicos().get(13));

        ArrayList<AsignacionCientificoCI> asignacionesCentro4 = new ArrayList<>();
        asignacionesCentro4.add(cientificosVendor.getAsignacionesCientificoCI().get(1));
        asignacionesCentro4.add(cientificosVendor.getAsignacionesCientificoCI().get(4));

        CentroInvestigacion centro4 = new CentroInvestigacion(
            "Demografia",
            "DEM",
            null,
            null,
            null,
            null,
            null,
            fechaDesde4,
            null,
            fechaBaja4,
            "Incendio",
            recursosCentro4,
            null,
            null,
            null,
            null,
            null,
            null,
            asignacionesCentro4
        );

        centrosInvestigacion.add(centro1);
        centrosInvestigacion.add(centro2);
        centrosInvestigacion.add(centro3);
        centrosInvestigacion.add(centro4);
    }
}
