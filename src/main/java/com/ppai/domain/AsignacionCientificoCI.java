package com.ppai.domain;

import com.ppai.domain.AsignacionCientifico;

import java.util.*;

public class AsignacionCientificoCI extends AsignacionCientifico {

    private ArrayList<Turno> turnos;

    public AsignacionCientificoCI(PersonalCientifico cientifico, RolPersonalCientifico rol, Date fechaInicio, Date fechaFin,ArrayList<Turno> turnos) {
        super(cientifico, rol, fechaInicio, fechaFin);
        this.turnos = turnos;
    }



    public ArrayList<Turno> mostrarTurnos() {
        return turnos;
    }

}