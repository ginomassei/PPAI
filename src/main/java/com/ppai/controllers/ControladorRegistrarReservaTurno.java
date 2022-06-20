package com.ppai.controllers;

import com.ppai.config.vendors.CDIVendor;
import com.ppai.config.vendors.RecursosVendor;
import com.ppai.domain.*;

import java.util.ArrayList;

public class ControladorRegistrarReservaTurno {

//    private static Sesion sesionActual = .getSesionActual();
//    private static PersonalCientifico cientificoLogueado = GlobalVendor.getCientificoLogueado();
//    private static Estado estadoReservado = GlobalVendor.getEstadoReservado();
    private static ArrayList<CentroInvestigacion> centrosDeInvestigacion = CDIVendor.getCentrosInvestigacion();
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

    public ArrayList<ArrayList<ArrayList<String>>> buscarRecursosTecnologicosPorTipo(ArrayList<String> tiposRecurso) {
        return obtenerRecursosTecnologicosPorTipo(tiposRecurso);
    }

    public ArrayList<ArrayList<ArrayList<String>>> obtenerRecursosTecnologicosPorTipo(ArrayList<String> tiposRecurso) {
        ArrayList<ArrayList<ArrayList<String>>> recursosTecnologicos = new ArrayList<>();
        centrosDeInvestigacion.forEach(centro -> {
            if (centro.estaDeBaja()) return;
            ArrayList<ArrayList<String>> recursosDelCentro = centro.listarRecursosTecnologicosPorTipo(tiposRecurso);
            if (recursosDelCentro != null) recursosTecnologicos.add(recursosDelCentro);
        });
        return recursosTecnologicos;
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
