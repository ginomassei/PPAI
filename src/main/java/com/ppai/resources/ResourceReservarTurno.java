package com.ppai.resources;

import com.ppai.controllers.ControladorRegistrarReservaTurno;
import com.ppai.domain.Turno;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Arrays;

@Path("/turnos")
public class ResourceReservarTurno {
    @Inject
    ControladorRegistrarReservaTurno controladorReservaTurno;

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

    @GET
    @Path("/seleccionar-recurso-tecnologico")
    @Produces(MediaType.APPLICATION_JSON)
    public Response seleccionarRecursoTecnologico(@QueryParam("recursoSeleccionado") String recursoSeleccionado) {
        String[] res = recursoSeleccionado.split(",");
        ArrayList<Turno> turnosFuturos = controladorReservaTurno.seleccionarRecursoTecnologico(res);
        return Response
            .ok()
            .entity(turnosFuturos)
            .build();
    }

    @POST
    @Path("/seleccionar-turno-recurso-tecnologico")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response seleccionarTurnoRecursoTecnologico(Turno turnoSeleccionado) {
        Object responseObject = controladorReservaTurno.seleccionarTurnoRecursoTecnologico(turnoSeleccionado);
        return Response
            .ok()
            .entity(responseObject)
            .build();
    }

    @GET
    @Path("/seleccionar-metodo-notificacion")
    @Produces(MediaType.APPLICATION_JSON)
    public Response seleccionarMetodoNotificacion(String metodoNotificacion) {
        controladorReservaTurno.seleccionarMetodoNotificacion(metodoNotificacion);
        return Response
            .ok()
            .build();
    }

    @GET
    @Path("/confirmar-reserva-turno")
    @Produces(MediaType.APPLICATION_JSON)
    public Response confirmarReservaTurno() {
        controladorReservaTurno.confirmarReservaTurno();
        return Response
            .ok()
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