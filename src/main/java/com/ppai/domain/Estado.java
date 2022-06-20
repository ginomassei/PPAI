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

    public boolean esReservado() {
        return this.nombre.equals("Reservado");
    }

    public boolean esBajaTecnica() {
        return this.nombre.equals("Baja Tecnica");
    }

    public boolean esBajaDefinitiva() {
        return this.nombre.equals("Baja Definitiva");
    }

    public boolean esAmbitoTurno() {
        return this.ambito.equals("Turno");
    }
}