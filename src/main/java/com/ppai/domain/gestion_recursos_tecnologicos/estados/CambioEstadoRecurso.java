package com.ppai.domain.gestion_recursos_tecnologicos;

import com.ppai.domain.gestion_recursos_tecnologicos.estados.EstadoRecurso;

import java.util.*;

public class CambioEstado {
    private Date fechaHoraDesde;
    private Date fechaHoraHasta;
    private EstadoRecurso estadoRecurso;

    public CambioEstado(Date fechaHoraDesde, Date fechaHoraHasta, EstadoRecurso estadoRecurso) {
        this.fechaHoraDesde = fechaHoraDesde;
        this.fechaHoraHasta = fechaHoraHasta;
        this.estadoRecurso = estadoRecurso;
    }

    public String mostrarEstado() {
        return this.estadoRecurso.mostrarEstado();
    }

    public boolean esActual() {
        return fechaHoraHasta == null;
    }

    public boolean esBajaTecnica() {
        return this.estadoRecurso.esBajaTecnica();
    }

    public boolean esBajaDefinitiva() {
        return this.estadoRecurso.esBajaDefinitiva();
    }

    public void finalizar() {
        this.fechaHoraHasta = new Date();
    }

    public EstadoRecurso getEstado() {
        return estadoRecurso;
    }
}