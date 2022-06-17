package com.ppai.domain;

public class TipoRecurso {
    private String nombre;
    private String descripcion;
    private Caracteristica caracteristicas;

    public TipoRecurso() {
    }

    public TipoRecurso(String nombre, String descripcion, Caracteristica caracteristicas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.caracteristicas = caracteristicas;
    }

    public void mostrarCategoria() {
        // TODO implement here
    }
}