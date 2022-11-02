package com.ppai.domain.gestion_recursos_tecnologicos.estados;

public abstract class EstadoRecurso {
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
