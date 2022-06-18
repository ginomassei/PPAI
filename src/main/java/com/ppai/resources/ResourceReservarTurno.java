package com.ppai.resources;

import com.ppai.controllers.ControladorRegistrarReservaTurno;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Path("/turnos")
public class ResourceReservarTurno {
    ControladorRegistrarReservaTurno controladorReservaTurno = new ControladorRegistrarReservaTurno();

    @GET
    @Path("/buscar-tipo-recurso-tecnologico")
    @Produces(MediaType.APPLICATION_JSON)
    public Response buscarTipoRecursoTecnologico() {
        ArrayList<String> tiposRecurso = controladorReservaTurno.buscarTipoRecursoTecnologico();
        return Response
            .ok(tiposRecurso)
            .entity(tiposRecurso)
            .build();
    }

    @GET
    @Path("/buscar-recursos-por-tipo")
    @Produces(MediaType.APPLICATION_JSON)
    public Response buscarRecursosPorTipo() {
        return Response.ok("{\"message\":\"Hello World\"}").build();
    }

    @GET
    @Path("/seleccionar-recurso-tecnologico")
    @Produces(MediaType.APPLICATION_JSON)
    public Response seleccionarRecursoTecnologico() {
        controladorReservaTurno.seleccionarRecursoTecnologico();
        return Response.ok("{\"message\":\"Hello World\"}").build();
    }

    @GET
    @Path("/seleccionar-turno-recurso-tecnologico")
    @Produces(MediaType.APPLICATION_JSON)
    public Response seleccionarTurnoRecursoTecnologico() {
        return Response.ok("{\"message\":\"Hello World\"}").build();
    }

    @GET
    @Path("/seleccionar-metodo-notificacion")
    @Produces(MediaType.APPLICATION_JSON)
    public Response seleccionarMetodoNotificacion() {
        return Response.ok("{\"message\":\"Hello World\"}").build();
    }

    @GET
    @Path("/confirmar-reserva-turno")
    @Produces(MediaType.APPLICATION_JSON)
    public Response confirmarReservaTurno() {
        return Response.ok("{\"message\":\"Hello World\"}").build();
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