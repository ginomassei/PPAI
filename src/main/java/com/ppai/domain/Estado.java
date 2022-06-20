package com.ppai.domain;

public class Estado {

    private String nombre;
    private String ambito;

    public Estado(String nombre, String ambito) {
        this.nombre = nombre;
        this.ambito = ambito;
    }

    public void modificar() {
        // TODO implement here
    }

    public String mostrar() {
        return this.nombre;
    }

    public void eliminar() {
        // TODO implement here
    }

    public void esReservado() {
        // TODO implement here
    }

    public boolean esBajaTecnica() {
        return this.nombre.equals("Baja Tecnica");
    }

    public boolean esBajaDefinitiva() {
        return this.nombre.equals("Baja Definitiva");
    }
}