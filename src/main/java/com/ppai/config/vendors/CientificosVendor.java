package com.ppai.config.vendors;

import com.ppai.domain.AsignacionCientificoCI;
import com.ppai.domain.PersonalCientifico;
import io.quarkus.runtime.Startup;

import javax.annotation.PostConstruct;
import javax.ejb.DependsOn;
import javax.ejb.EJB;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.Date;

@Singleton
@Startup
@DependsOn("UsuariosVendor")
public class CientificosVendor {
    @Inject
    UsuariosVendor usuariosVendor;

    private ArrayList<PersonalCientifico> cientificos;
    private ArrayList<AsignacionCientificoCI> asignacionesCientificoCI;

    @PostConstruct
    public void init() {
        cientificos = new ArrayList<>();
        asignacionesCientificoCI = new ArrayList<>();

        crearPersonalCientifico();
        crearAsignacionesCientificosCI();
    }

    public void crearPersonalCientifico() {
        PersonalCientifico cientifico1 = new PersonalCientifico(2901, "Pedro", "Sanchez",
            "20948277", null, null, null,usuariosVendor.getUsuarios().get(0));

        PersonalCientifico cientifico2 = new PersonalCientifico(2923, "Maria", "Tretta",
            "24248567", null, null, null,usuariosVendor.getUsuarios().get(1));

        PersonalCientifico cientifico3 = new PersonalCientifico(2832, "Gabriel", "Lazcano",
            "23229098", null, null, null,usuariosVendor.getUsuarios().get(2));

        PersonalCientifico cientifico4 = new PersonalCientifico(2143, "Carlos", "Ruiz",
            "27525878", null, null, null,usuariosVendor.getUsuarios().get(3));

        PersonalCientifico cientifico5 = new PersonalCientifico(3001, "Andrea", "Reynoso",
            "19610500", null, null, null,usuariosVendor.getUsuarios().get(4));

        PersonalCientifico cientifico6 = new PersonalCientifico(2789, "Tomas", "Diaz",
            "21404747", null, null, null,usuariosVendor.getUsuarios().get(5));

        cientificos.add(cientifico1);
        cientificos.add(cientifico2);
        cientificos.add(cientifico3);
        cientificos.add(cientifico4);
        cientificos.add(cientifico5);
        cientificos.add(cientifico6);
    }

    public void crearAsignacionesCientificosCI() {
        Date fechaDesde1 = new Date(2022,01,23);

        AsignacionCientificoCI asignacion1 = new AsignacionCientificoCI(cientificos.get(0), null, fechaDesde1,
            null, null);

        Date fechaDesde2 = new Date(2022,01,23);

        AsignacionCientificoCI asignacion2 = new AsignacionCientificoCI(cientificos.get(1), null, fechaDesde2,
            null, null);

        Date fechaDesde3 = new Date(2022,01,23);

        AsignacionCientificoCI asignacion3 = new AsignacionCientificoCI(cientificos.get(2), null, fechaDesde3,
            null, null);

        Date fechaDesde4 = new Date(2022,01,23);

        AsignacionCientificoCI asignacion4 = new AsignacionCientificoCI(cientificos.get(3), null, fechaDesde4,
            null, null);

        Date fechaDesde5 = new Date(2022,01,23);

        AsignacionCientificoCI asignacion5 = new AsignacionCientificoCI(cientificos.get(4), null, fechaDesde5,
            null, null);

        Date fechaDesde6 = new Date(2022,01,23);

        AsignacionCientificoCI asignacion6 = new AsignacionCientificoCI(cientificos.get(5), null, fechaDesde6,
            null, null);

        asignacionesCientificoCI.add(asignacion1);
        asignacionesCientificoCI.add(asignacion2);
        asignacionesCientificoCI.add(asignacion3);
        asignacionesCientificoCI.add(asignacion4);
        asignacionesCientificoCI.add(asignacion5);
        asignacionesCientificoCI.add(asignacion6);
    }

    public ArrayList<PersonalCientifico> getCientificos() {
        return cientificos;
    }

    public ArrayList<AsignacionCientificoCI> getAsignacionesCientificoCI() {
        return asignacionesCientificoCI;
    }
}
