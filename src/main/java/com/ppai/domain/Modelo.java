package com.ppai.domain;


public class Modelo {
    private String nombre;
    private String descripción;

    public Modelo(String nombre, String descripción) {
        this.nombre = nombre;
        this.descripción = descripción;
    }

    public void mostrar() {
        // TODO implement here
    }

    public void modificar() {
        // TODO implement here
    }

    public String mostrarMarca() {
        // TODO Llamar al vendor, traer las marcas, mandar esTuModelo(this) y recuperar nombre.
    }

    public String mostrarNombre() {
        return this.nombre;
    }
}