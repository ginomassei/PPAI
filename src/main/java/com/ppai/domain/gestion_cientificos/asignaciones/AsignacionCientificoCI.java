package com.ppai.domain.gestion_cientificos.asignaciones;

import com.ppai.domain.gestion_cientificos.cientifico.PersonalCientifico;
import com.ppai.domain.gestion_turnos.Turno;

import java.util.*;

public class AsignacionCientificoCI extends AsignacionCientifico {
    private ArrayList<Turno> turnos;

    public AsignacionCientificoCI(PersonalCientifico cientifico, Date fechaInicio, Date fechaFin, ArrayList<Turno> turnos) {
        super(cientifico, fechaInicio, fechaFin);
        this.turnos = turnos;
    }

    public ArrayList<Turno> mostrarTurnos() {
        return turnos;
    }
}