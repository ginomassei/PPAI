package com.ppai.domain;

import java.util.ArrayList;

public class TipoRecurso {
    private String nombre;
    private String descripcion;
    private ArrayList<Caracteristica> caracteristicas;

    public TipoRecurso(String nombre, String descripcion, ArrayList<Caracteristica> caracteristicas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.caracteristicas = caracteristicas;
    }

    public String mostrarCategoria() {
        return this.nombre;
    }
}