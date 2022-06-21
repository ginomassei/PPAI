package com.ppai.controllers;

import com.ppai.config.vendors.*;
import com.ppai.domain.*;

import javax.enterprise.context.RequestScoped;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Controlador responsable de gestionar el flujo de mensajes para el caso de uso
 * Registrar Reserva turno.
 * El controlador es llamado desde la clase resource correspondiente. Y se encarga de conectar la frontera con nuestro
 * esquema de clases de entidad pertenecientes al modelo de negocio.
 */
@RequestScoped
public class ControladorRegistrarReservaTurno {
    /**
     * En este caso, utilizamos los vendors, para simular una base de datos. Los mismos nos proveen de datos
     * "hardcodeados" para que la aplicación sea funcional en esta primera instancia.
     */
    private static Turno turnoSeleccionado;
    private static final Sesion sesionActual = new Sesion(UsuariosVendor.getUsuarios().get(0));
    private static final ArrayList<CentroInvestigacion> centrosDeInvestigacion = CDIVendor.getCentrosInvestigacion();
    private static final ArrayList<String> metodosDeNotificacion = MiscVendor.getMetodosDeNotificacion();
    private static RecursoTecnologico recursoSeleccionado;
    private static String[] recursoSeleccionadoAsString;

    public ArrayList<String> buscarTipoRecursoTecnologico() {
        return obtenerTiposRecursoTecnologico();
    }

    /**
     * Obtiene los recursos tecnológicos por tipo, obteniendo los recursos del vendor correspondiente.
     * @return array de tipos de recursos tecnológicos.
     */
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

    public ArrayList<String[]> seleccionarRecursoTecnologico(String[] recursoTecnologicoSeleccionado) {
        // recursoTecnologicoSeleccionado = [centro, modelo, marca];
        recursoSeleccionadoAsString = recursoTecnologicoSeleccionado;
        CentroInvestigacion centroCientifico = validarCientificoPerteneceCIRecurso(recursoTecnologicoSeleccionado[0]);

        if (centroCientifico != null) {
            ArrayList<RecursoTecnologico> recursosDelCentro = centroCientifico.listarRecursosTecnológicos();
            for (RecursoTecnologico recurso : recursosDelCentro) {
                if (recurso.esMiModeloYMarca(recursoTecnologicoSeleccionado[1], recursoTecnologicoSeleccionado[2])) {
                    recursoSeleccionado = recurso;
                    return recurso.mostrarTurnosFuturos();
                }
            }
        }
        return null;
    }

    private CentroInvestigacion validarCientificoPerteneceCIRecurso(String centroInv) {
        PersonalCientifico cientificoLogueado = sesionActual.obtenerCientifico();

        for (CentroInvestigacion centro : centrosDeInvestigacion) {
            if (centro.esTuCientifico(cientificoLogueado) && centro.getNombre().equals(centroInv)) {
                return centro;
            }
        }
        return null;
    }

    public Object seleccionarTurnoRecursoTecnologico(String idTurnoSeleccionado) {
        return solicitarConfirmacionRT(idTurnoSeleccionado);
    }

    private Object solicitarConfirmacionRT(String idTurnoSeleccionado) {
        // Buscar turno seleccionado
        for (Turno turno : recursoSeleccionado.getTurnos()) {
            if (turno.esTuId(Integer.parseInt(idTurnoSeleccionado))) {
                turnoSeleccionado = turno;
                break;
            }
        }

        return new Object() {
            // Mostrar datos reserva parcial.
            public final String[] reservaParcial = turnoSeleccionado.mostrarTurno();
            public final ArrayList<String> metodosDeNotificacionDisponibles = metodosDeNotificacion;
            public final String[] recursoTecnologico = recursoSeleccionadoAsString;
        };
    }

    public void seleccionarMetodoNotificacion(String metodoNotificacion) {}

    public void confirmarReservaTurno() {
        Estado estadoReservado = buscarEstadoReservado();
        turnoSeleccionado.reservarTurno(estadoReservado);
    }

    private Estado buscarEstadoReservado() {
        for (Estado estado: EstadosVendor.getEstados()) {
            if (estado.esAmbitoTurno() && estado.esReservado()) {
                return estado;
            }
        }
        return null;
    }

    public void confirmarReservaRT() {
        // TODO implement here
    }

    public void confirmarReservaYNotificacion() {
        // TODO implement here
    }
}
