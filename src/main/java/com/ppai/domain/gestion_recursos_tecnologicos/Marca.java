package com.ppai.domain.gestion_recursos_tecnologicos;

import java.util.*;

public class Marca {
    private String nombre;
    private String descripción;
    private ArrayList<Modelo> modelos;

    public Marca(String nombre, String descripción, ArrayList<Modelo> modelos) {
        this.nombre = nombre;
        this.descripción = descripción;
        this.modelos = modelos;
    }

    public void mostrar() {
        // TODO implement here
    }

    public void modificar() {
        // TODO implement here
    }

    public void mostrarMarca() {
        // TODO implement here
    }

    public String mostrarNombre() {
        return this.nombre;
    }

    public boolean esTuModelo(Modelo modelo) {
        return this.modelos.contains(modelo);
    }
}