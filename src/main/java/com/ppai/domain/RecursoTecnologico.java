package com.ppai.domain;

import java.util.Date;
import java.util.List;

public class RecursoTecnologico {

    private int nroInventario;
    private Date fechaAlta;
    private TipoRecurso tipo;
    private CaracteristicaRecurso caracteristicas;
    private List<String> imagenes;
    private Disponibilidad disponibilidad;
    private PersonalCientifico responsableTecnico;
    private CambioEstado estado;
    private MantenimientoPreventivo mantPreventivos;
    private MantenimientoCorrectivo mantCorrectivos;
    private Modelo modelo;
    private Turno turno;
    private String periodicidadMp;
    private String duraciónMp;

    public RecursoTecnologico(
        int nroInventario,
        Date fechaAlta,
        TipoRecurso tipo,
        CaracteristicaRecurso caracteristicas,
        List<String> imagenes,
        Disponibilidad disponibilidad,
        PersonalCientifico responsableTecnico,
        CambioEstado estado,
        MantenimientoPreventivo mantPreventivos,
        MantenimientoCorrectivo mantCorrectivos,
        Modelo modelo,
        Turno turno,
        String periodicidadMp,
        String duraciónMp
    ) {
        this.nroInventario = nroInventario;
        this.fechaAlta = fechaAlta;
        this.tipo = tipo;
        this.caracteristicas = caracteristicas;
        this.imagenes = imagenes;
        this.disponibilidad = disponibilidad;
        this.responsableTecnico = responsableTecnico;
        this.estado = estado;
        this.mantPreventivos = mantPreventivos;
        this.mantCorrectivos = mantCorrectivos;
        this.modelo = modelo;
        this.turno = turno;
        this.periodicidadMp = periodicidadMp;
        this.duraciónMp = duraciónMp;
    }

    public void mostrarRecurso() {
        // TODO implement here
    }

    public void cancelarTurnoMantenimiento() {
        // TODO implement here
    }

    public void mostrarCaracXTipoRecurso() {
        // TODO implement here
    }

    public void actualizarDisponibilidad() {
        // TODO implement here
    }

    public void darDeBaja() {
        // TODO implement here
    }

    public void esTipo() {
        // TODO implement here
    }

    public void miModeloYMarca() {
        // TODO implement here
    }

    public void esDeTipo() {
        // TODO implement here
    }

    public void mostrarModeloYMarca() {
        // TODO implement here
    }

    public void mostrarNumeroRT() {
        // TODO implement here
    }

    public void mostrarEstado() {
        // TODO implement here
    }

    public void mostrarTurnosFuturos() {
        // TODO implement here
    }
}