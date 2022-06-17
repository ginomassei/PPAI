package com.ppai.domain;

import java.util.*;

public class Facultad {

    private String nombre;
    private PersonalCientifico responsableCyT;
    private CentroInvestigacion centrosDeInvestigacion;

    public Facultad(String nombre, PersonalCientifico responsableCyT, CentroInvestigacion centrosDeInvestigacion) {
        this.nombre = nombre;
        this.responsableCyT = responsableCyT;
        this.centrosDeInvestigacion = centrosDeInvestigacion;
    }
}