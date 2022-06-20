package com.ppai.controllers;

import com.ppai.config.vendors.RecursosVendor;
import com.ppai.domain.*;

import java.util.ArrayList;

public class ControladorRegistrarReservaTurno {

//    private static Sesion sesionActual = .getSesionActual();
//    private static PersonalCientifico cientificoLogueado = GlobalVendor.getCientificoLogueado();
//    private static Estado estadoReservado = GlobalVendor.getEstadoReservado();
//    private static ArrayList<CentroInvestigacion> centrosDeInvestigacion = GlobalVendor.getCentrosDeInvestigacion();
//    private static Turno turnoSeleccionado = GlobalVendor.getTurnoSeleccionado();

    public ArrayList<String> buscarTipoRecursoTecnologico() {
        return obtenerTiposRecursoTecnologico();
    }

    private ArrayList<String> obtenerTiposRecursoTecnologico() {
        ArrayList<String> tiposRecursoTecnologico = new ArrayList<>();
        for (TipoRecurso tipoRecurso : RecursosVendor.getTiposRecurso()) {
            tiposRecursoTecnologico.add(tipoRecurso.mostrarCategoria());
        }
        return tiposRecursoTecnologico;
    }

    public void buscarRecursosTecnologicosPorTipo() {
        // TODO implement here
    }

    public void obtenerRecursosTecnologicosPorTipo() {
        // TODO implement here
    }

    public void mostrarTurnosRecursoTecnologico() {
        // TODO implement here
    }

    public void seleccionarRecursoTecnologico() {
        validarCientificoPerteneceCIRecurso();
    }

    public void validarCientificoPerteneceCIRecurso() {

    }

    public void seleccionarTurnoRT() {
        // TODO implement here
    }

    public void solicitarConfirmacionRT() {
        // TODO implement here
    }

    public void confirmarReservaRT() {
        // TODO implement here
    }

    public void confirmarReservaYNotificacion() {
        // TODO implement here
    }

    public void seleccionarMetodoNotificacion() {
        // TODO implement here
    }

    public void confirmarReservaTurno() {
        // TODO implement here
    }

    public void buscarEstadoReservado() {
        // TODO implement here
    }

}
