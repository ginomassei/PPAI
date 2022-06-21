package com.ppai.resources;

import com.ppai.controllers.ControladorRegistrarReservaTurno;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * La clase ResourceReservarTurno actúa como una clase del tipo Boundary, modelando la frontera de nuestro sistema,
 * interactuando con el cliente que en este caso es un servidor web, que realiza las peticiones HTTP.
 * Cada endpoint de esta clase, representa un mensaje que enviaría el actor a una clase "Pantalla"
 * convencional. Los métodos que no se utilizan en esta clase, no aplican al caso de uso desarrollado.
 */
@Path("/turnos")
public class ResourceReservarTurno {
    @Inject
    ControladorRegistrarReservaTurno controladorReservaTurno;

    /**
     * Obtiene los tipos de recurso tecnológicos disponibles en el sistema.
     * @return Response con un array de strings del tipo de recurso, para que el usuario realice la selección.
     */
    @GET
    @Path("/buscar-tipo-recurso-tecnologico")
    @Produces(MediaType.APPLICATION_JSON)
    public Response buscarTipoRecursoTecnologico() {
        ArrayList<String> tiposRecurso = controladorReservaTurno.buscarTipoRecursoTecnologico();
        return Response
            .ok()
            .entity(tiposRecurso)
            .build();
    }

    /**
     * Pasando un tipo de recurso como parámetro a la request. El sistema busca los recursos tecnológicos que coinciden
     * con el tipo pasado por parámetro.
     * @param tiposRecurso String
     * @return Los recursos tecnológicos agrupados por centro de investigación según su tipo.
     */
    @GET
    @Path("/buscar-recursos-tecnologicos-por-tipo")
    @Produces(MediaType.APPLICATION_JSON)
    public Response buscarRecursosPorTipo(@QueryParam("tiposRecurso") String tiposRecurso) {
        if (tiposRecurso == null) return Response.serverError().build();

        ArrayList<String> tiposDeRecursos = new ArrayList<>(Arrays.asList(tiposRecurso.split(",")));

        Object recursosTecnologicosPorTipo = controladorReservaTurno.buscarRecursosTecnologicosPorTipo(tiposDeRecursos);
        return Response
            .ok()
            .entity(recursosTecnologicosPorTipo)
            .build();
    }

    /**
     * Selecciona un recurso que es pasado mediante parámetro en la request.
     * @param recursoSeleccionado String
     * @return Un array con los turnos disponibles para ese recurso.
     */
    @GET
    @Path("/seleccionar-recurso-tecnologico")
    @Produces(MediaType.APPLICATION_JSON)
    public Response seleccionarRecursoTecnologico(@QueryParam("recursoSeleccionado") String recursoSeleccionado) {
        String[] res = recursoSeleccionado.split(",");
        // [nombre del centro, modelo, marca]
        ArrayList<String[]> turnosFuturos = controladorReservaTurno.seleccionarRecursoTecnologico(res);
        return Response
            .ok()
            .entity(turnosFuturos)
            .build();
    }

    /**
     * Cuando se le pasa un turno, selecciona el turno para su reserva.
     * @param turnoSeleccionado String
     * @return Retorna un objeto con el turno seleccionado, y los medios de notificación disponibles.
     */
    @GET
    @Path("/seleccionar-turno-recurso-tecnologico")
    @Produces(MediaType.APPLICATION_JSON)
    public Response seleccionarTurnoRecursoTecnologico(@QueryParam("turnoSeleccionado") String turnoSeleccionado) {
        Object responseObject = controladorReservaTurno.seleccionarTurnoRecursoTecnologico(turnoSeleccionado);
        return Response
            .ok()
            .entity(responseObject)
            .build();
    }

    /**
     * Selecciona un método de notificación de los disponibles.
     * @param metodoNotificacion el método de notificación.
     * @return Mensaje de confirmación.
     */
    @GET
    @Path("/seleccionar-metodo-notificacion")
    @Produces(MediaType.APPLICATION_JSON)
    public Response seleccionarMetodoNotificacion(@QueryParam("turnoSeleccionado") String metodoNotificacion) {
        controladorReservaTurno.seleccionarMetodoNotificacion(metodoNotificacion);
        return Response
            .ok()
            .entity(new Object() {
                public String status = "Metodo de notificacion seleccionado correctamente.";
            })
            .build();
    }

    /**
     * Confirma la reserva del turno.
     * @return mensaje de confirmación.
     */
    @GET
    @Path("/confirmar-reserva-turno")
    @Produces(MediaType.APPLICATION_JSON)
    public Response confirmarReservaTurno() {
        controladorReservaTurno.confirmarReservaTurno();
        return Response
            .ok()
            .entity(new Object() {
                public String status = "Reserva realizada con éxito.";
            })
            .build();
    }

    public void solicitarSeleccionTipoRecurso() {
        // TODO implement here
    }
    public void seleccionarTipoRecurso() {
        // TODO implement here
    }

    public void solicitarSeleccionRecTecnologico() {
        // TODO implement here
    }

    public void solicitarSeleccionTurno() {
        // TODO implement here
    }

    public void seleccionarTurnoRT() {
        // TODO implement here
    }

    public void solicitarConfirmacionReserva() {
        // TODO implement here
    }

    public void solicitarConfirmacionRT() {
        // TODO implement here
    }

    public void confirmarReservaRT() {
        // TODO implement here
    }

    public void solicitarConfirmacionYNotificacion() {
        // TODO implement here
    }

    public void mostrarDatosReservaParcial() {
        // TODO implement here
    }

    public void solicitarMetodoNotificacion() {
        // TODO implement here
    }
}