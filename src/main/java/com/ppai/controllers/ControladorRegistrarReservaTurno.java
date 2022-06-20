package com.ppai.controllers;

import com.ppai.config.vendors.CDIVendor;
import com.ppai.config.vendors.CientificosVendor;
import com.ppai.config.vendors.RecursosVendor;
import com.ppai.config.vendors.UsuariosVendor;
import com.ppai.domain.*;

import java.util.ArrayList;

public class ControladorRegistrarReservaTurno {

//    private static Estado estadoReservado = GlobalVendor.getEstadoReservado();
//    private static Turno turnoSeleccionado = GlobalVendor.getTurnoSeleccionado();
    private static ArrayList<PersonalCientifico> personalCientifico = CientificosVendor.getCientificos();
    private static final Sesion sesionActual = new Sesion(UsuariosVendor.getUsuarios().get(0));
    private static final ArrayList<CentroInvestigacion> centrosDeInvestigacion = CDIVendor.getCentrosInvestigacion();

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

    public Object buscarRecursosTecnologicosPorTipo(ArrayList<String> tiposRecurso) {
        return obtenerRecursosTecnologicosPorTipo(tiposRecurso);
    }

    public ArrayList<Object> obtenerRecursosTecnologicosPorTipo(ArrayList<String> tiposRecurso) {
        ArrayList<Object> recursosTecnologicos = new ArrayList<>();
        centrosDeInvestigacion.forEach(centro -> {
            var recursos = new Object() {
                public final String centroTecnologico = centro.getNombre();
                public ArrayList<ArrayList<String>> recursosTecnologicos = new ArrayList<>();
            };
            if (centro.estaDeBaja()) return;
            ArrayList<ArrayList<String>> recursosDelCentro = centro.listarRecursosTecnologicosPorTipo(tiposRecurso);
            if (recursosDelCentro != null) {
                recursos.recursosTecnologicos = recursosDelCentro;
            }
            recursosTecnologicos.add(recursos);
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
        personalCientifico.forEach(cientifico -> {
            if (cientifico.esTuUsuario(sesionActual.obtenerCientifico())) {
                centrosDeInvestigacion.forEach(centroInvestigacion -> {
                    centroInvestigacion.esTuCientifico(sesionActual.obtenerCientifico());
                });
            }
        });

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
