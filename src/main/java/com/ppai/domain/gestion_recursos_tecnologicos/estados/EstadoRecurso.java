package com.ppai.domain.state;

public abstract class Estado {
    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String mostrarEstado() {
        return nombre;
    }

    public boolean esActivo() {
        return this instanceof Activo;
    }

    public boolean esBajaTecnica() {
        return this instanceof BajaTecnica;
    }

    public boolean esBajaDefinitiva() {
        return this instanceof BajaDefinitiva;
    }
}
