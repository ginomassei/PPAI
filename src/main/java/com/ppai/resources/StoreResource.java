package com.ppai.resources;

import com.ppai.domain.Marca;
import com.ppai.domain.Modelo;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;
import java.util.ArrayList;
import java.util.List;

@Path("/save")
public class StoreResource {
    @Inject
    EntityManager em;

    @Transactional
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response buscarTipoRecursoTecnologico() {

        List<Marca> marcasStored = em.createQuery("SELECT e FROM Marca e").getResultList();
        System.out.println(marcasStored);
//        if (marcasStored == null) {
//            System.out.println("No employee found . ");
//        } else {
//            for (Marca marca : marcasStored) {
//                System.out.println(marca);
//            }
//        }

        return Response
            .ok().build();
    }
}
