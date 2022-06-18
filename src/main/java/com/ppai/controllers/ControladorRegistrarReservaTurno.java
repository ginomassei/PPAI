package com.ppai.controllers;

import com.ppai.domain.TipoRecurso;

import java.util.ArrayList;

public class ControladorRegistrarReservaTurno {
    public ArrayList<TipoRecurso> buscarTipoRecursoTecnologico() {
        return obtenerTiposRecursoTecnologico();
    }

    private ArrayList<TipoRecurso> obtenerTiposRecursoTecnologico() {

        return TipoRecurso.getAll();
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
        // TODO implement here
    }

    public void validarCientificoPerteneceCIRecurso() {
        // TODO implement here
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
