package com.ppai.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecursoTecnologico {

    private int nroInventario;
    private Date fechaAlta;
    private TipoRecurso tipo;
    private ArrayList<CaracteristicaRecurso> caracteristicas;
    private List<String> imagenes;
    private Disponibilidad disponibilidad;
    private PersonalCientifico responsableTecnico;
    private ArrayList<CambioEstado> estado;
    private MantenimientoPreventivo mantPreventivos;
    private MantenimientoCorrectivo mantCorrectivos;
    private Modelo modelo;
    private ArrayList<Turno> turno;
    private String periodicidadMp;
    private String duraciónMp;

    public RecursoTecnologico(
        int nroInventario,
        Date fechaAlta,
        TipoRecurso tipo,
        ArrayList<CaracteristicaRecurso> caracteristicas,
        List<String> imagenes,
        Disponibilidad disponibilidad,
        PersonalCientifico responsableTecnico,
        ArrayList<CambioEstado> estado,
        MantenimientoPreventivo mantPreventivos,
        MantenimientoCorrectivo mantCorrectivos,
        Modelo modelo,
        ArrayList<Turno> turno,
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

    public boolean esDeTipo( String nombreTipo) {
        return this.tipo.mostrarCategoria() == nombreTipo;
    }

    public ArrayList<String> mostrarModeloYMarca() {
        String modelo = this.modelo.mostrarNombre();
        String marca = this.modelo.mostrarMarca();
        ArrayList<String> modeloYMarca = new ArrayList<>();
        modeloYMarca.add(modelo);
        modeloYMarca.add(marca);
        return modeloYMarca;
    }

    public String mostrarNumeroRT() {
        return Integer.toString(this.nroInventario);
    }

    public String mostrarEstado() {
        String estadoActual = null;
        for (CambioEstado e: estado){
            if(e.esActual()){
                estadoActual = e.mostrarEstado();
            }
        }
        return estadoActual;
    }

    public void mostrarTurnosFuturos() {
        // TODO implement here
    }
}