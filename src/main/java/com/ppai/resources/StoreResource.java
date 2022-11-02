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
import java.util.ArrayList;
import java.util.List;

@Path("/save")
public class StoreResource {
    @Inject
    EntityManager em;

    private ArrayList<Modelo> modelos;
    private ArrayList<Marca> marcas;

    @Transactional
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response buscarTipoRecursoTecnologico() {
        modelos = new ArrayList<>();
        marcas = new ArrayList<>();

        crearModelos();
        crearMarcas();
        marcas.forEach(marca -> {
            em.persist(marca);
        });

        List<Marca> marcasStored = em.createQuery("SELECT e FROM Marca e").getResultList();

        if (marcasStored == null) {
            System.out.println("No employee found . ");
        } else {
            for (Marca marca : marcasStored) {
                List<Modelo> modelosMarca = new ArrayList<>();
                modelosMarca.add(modelos.get(1));
                modelosMarca.add(modelos.get(2));
                marca.setModelos(modelosMarca);
                em.persist(marca);
            }
        }

        return Response
            .ok().build();
    }

    public void crearModelos() {
        Modelo modelo1 = new Modelo();
        modelo1.setNombre("TXB312");
        Modelo modelo2 = new Modelo();
        modelo2.setNombre("TXB203");
        Modelo modelo3 = new Modelo();
        modelo3.setNombre("TXB465");
        Modelo modelo4 = new Modelo();
        modelo4.setNombre("MM001");
        Modelo modelo5 = new Modelo();
        modelo5.setNombre("MM302");
        Modelo modelo6 = new Modelo();
        modelo6.setNombre("MM789");
        Modelo modelo7 = new Modelo();
        modelo7.setNombre("PTA209");

        modelos.add(modelo1);
        modelos.add(modelo2);
        modelos.add(modelo3);
        modelos.add(modelo4);
        modelos.add(modelo5);
        modelos.add(modelo6);
        modelos.add(modelo7);
    }

    public void crearMarcas() {
//        ArrayList<Modelo> modelosMarca1 = new ArrayList<>();
//        ArrayList<Modelo> modelosMarca2 = new ArrayList<>();
//        ArrayList<Modelo> modelosMarca3 = new ArrayList<>();
//        ArrayList<Modelo> modelosMarca4 = new ArrayList<>();

//        modelosMarca1.add(modelos.get(0));
//        modelosMarca1.add(modelos.get(1));


        Marca marca1 = new Marca();
        marca1.setNombre("Mettler");
//        marca1.setModelos(modelosMarca1);

//        modelosMarca2.add(modelos.get(2));
//        modelosMarca2.add(modelos.get(3));


        Marca marca2 = new Marca();
        marca2.setNombre("Baxtran");
//        marca2.setModelos(modelosMarca2);
//
//        modelosMarca3.add(modelos.get(4));
//        modelosMarca3.add(modelos.get(5));

        Marca marca3 = new Marca();
        marca3.setNombre("Nikon");
//        marca3.setModelos(modelosMarca3);

//        modelosMarca4.add(modelos.get(6));

        Marca marca4 = new Marca();
        marca4.setNombre("Gram");
//        marca4.setModelos(modelosMarca4);

        marcas.add(marca1);
        marcas.add(marca2);
        marcas.add(marca3);
        marcas.add(marca4);
    }
}
