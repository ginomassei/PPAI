package com.ppai.controllers;

import com.ppai.config.vendors.*;
import com.ppai.domain.*;

import javax.enterprise.context.RequestScoped;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

@RequestScoped
public class ControladorRegistrarReservaTurno {
    private static Turno turnoSeleccionado;
    private static final Sesion sesionActual = new Sesion(UsuariosVendor.getUsuarios().get(0));
    private static final ArrayList<CentroInvestigacion> centrosDeInvestigacion = CDIVendor.getCentrosInvestigacion();
    private static final ArrayList<String> metodosDeNotificacion = MiscVendor.getMetodosDeNotificacion();
    private static String metodoDeNotificacionSeleccionado;

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

    private ArrayList<Object> obtenerRecursosTecnologicosPorTipo(ArrayList<String> tiposRecurso) {
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

    public ArrayList<Turno> seleccionarRecursoTecnologico(String[] recursoTecnologicoSeleccionado) {
        ArrayList<Turno> turnosFuturos = null;
        //recursoTecnologicoSeleccionado = [centro, modelo, marca];
        CentroInvestigacion centroCientifico = validarCientificoPerteneceCIRecurso(recursoTecnologicoSeleccionado[0]);

        if (centroCientifico != null) {
            ArrayList<RecursoTecnologico> recursosDelCentro = centroCientifico.listarRecursosTecnológicos();
            for (RecursoTecnologico recurso : recursosDelCentro) {
                if (recurso.esMiModeloYMarca(recursoTecnologicoSeleccionado[1], recursoTecnologicoSeleccionado[2])) {
                    turnosFuturos = recurso.mostrarTurnosFuturos();
                }
            }
        } else {
            return null;
        }
        return turnosFuturos;
    }

    private CentroInvestigacion validarCientificoPerteneceCIRecurso(String centroInv) {
        PersonalCientifico cientificoLogueado = sesionActual.obtenerCientifico();

        for (CentroInvestigacion centro : centrosDeInvestigacion) {
            if (centro.esTuCientifico(cientificoLogueado)) {
                return centro;
            }
        }
        return null;
    }

    public Object seleccionarTurnoRecursoTecnologico(Turno turnoSeleccionado) {
        return solicitarConfirmacionRT(turnoSeleccionado);
    }

    private Object solicitarConfirmacionRT(Turno turnoSeleccionado) {
        // Guardamos el turno seleccionado.
        ControladorRegistrarReservaTurno.turnoSeleccionado = turnoSeleccionado;

        return new Object() {
            // Mostrar datos reserva parcial.
            public final Turno reservaParcial = turnoSeleccionado;
            public final ArrayList<String> metodosDeNotificacionDisponibles = metodosDeNotificacion;
        };
    }

    public void seleccionarMetodoNotificacion(String metodoNotificacion) {
        metodoDeNotificacionSeleccionado = metodoNotificacion;
    }

    public void confirmarReservaTurno() {
        buscarEstadoReservado();
    }

    private void buscarEstadoReservado() {
        EstadosVendor.getEstados().forEach(estado -> {
            if (estado.esAmbitoTurno() && estado.esReservado()) {
                turnoSeleccionado.reservarTurno(estado);
            }
        });
    }

    public void confirmarReservaRT() {
        // TODO implement here
    }

    public void confirmarReservaYNotificacion() {
        // TODO implement here
    }
}
