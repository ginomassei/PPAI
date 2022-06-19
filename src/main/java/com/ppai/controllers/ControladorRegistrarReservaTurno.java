package com.ppai.controllers;

import com.ppai.config.GlobalVendor;
import com.ppai.domain.TipoRecurso;

import java.util.ArrayList;

public class ControladorRegistrarReservaTurno {
    public static ArrayList<TipoRecurso> tiposDeRecursos = GlobalVendor.getTiposRecurso();

    public ArrayList<String> buscarTipoRecursoTecnologico() {
        return obtenerTiposRecursoTecnologico();
    }

    private ArrayList<String> obtenerTiposRecursoTecnologico() {
        ArrayList<String> tiposRecursoTecnologico = new ArrayList<>();
        for (TipoRecurso tipoRecurso : tiposDeRecursos) {
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
