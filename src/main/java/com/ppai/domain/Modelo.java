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
        String miMarca = "";
//        for (Marca marca: MarcasVendor.getMarcas()) {
//            if (marca.esTuModelo(this)) {
//                miMarca = marca.mostrarNombre();
//                return miMarca;
//            }
//        }
        return miMarca;
    }

    public String mostrarNombre() {
        return this.nombre;
    }
}