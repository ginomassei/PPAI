package com.ppai.domain;

import java.util.*;

public class CentroInvestigacion {
    private String nombre;
    private String sigla;
    private Direccion direccion;
    private Telefono telefonos;
    private String correoElectronico;
    private PersonalCientifico director;
    private Integer tiempoPrevioReserva;
    private Date fechaInicio;
    private Estado estado;
    private Date fechaBaja;
    private String motivoBaja;
    private ArrayList<RecursoTecnologico> recursos;
    private Integer númeroResolución;
    private Date fechaResolución;
    private String reglamento;
    private Date fechaAlta;
    private String caracteristicas;
    private AsignacionDirector direc;
    private ArrayList<AsignacionCientificoCI> cientificos;

    public CentroInvestigacion(String nombre, String sigla, Direccion direccion, Telefono telefonos, String correoElectronico, PersonalCientifico director, Integer tiempoPrevioReserva, Date fechaInicio, Estado estado, Date fechaBaja, String motivoBaja, ArrayList<RecursoTecnologico> recursos, Integer númeroResolución, Date fechaResolución, String reglamento, Date fechaAlta, String caracteristicas, AsignacionDirector direc, ArrayList<AsignacionCientificoCI> cientificos) {
        this.nombre = nombre;
        this.sigla = sigla;
        this.direccion = direccion;
        this.telefonos = telefonos;
        this.correoElectronico = correoElectronico;
        this.director = director;
        this.tiempoPrevioReserva = tiempoPrevioReserva;
        this.fechaInicio = fechaInicio;
        this.estado = estado;
        this.fechaBaja = fechaBaja;
        this.motivoBaja = motivoBaja;
        this.recursos = recursos;
        this.númeroResolución = númeroResolución;
        this.fechaResolución = fechaResolución;
        this.reglamento = reglamento;
        this.fechaAlta = fechaAlta;
        this.caracteristicas = caracteristicas;
        this.direc = direc;
        this.cientificos = cientificos;
    }

    public void darDeBaja() {
        // TODO implement here
    }

    public void listarRecursosTecnológicos() {
        // TODO implement here
    }

    public void listarPersonal() {
        // TODO implement here
    }

    public void agregarPersonal() {
        // TODO implement here
    }

    public void mostrarPersonal() {
        // TODO implement here
    }

    public boolean estaDeBaja() {
        if (this.fechaBaja == null) {
            return false;
        } else return new Date(System.currentTimeMillis()).before(this.fechaBaja);
    }

    public ArrayList<ArrayList<String>> listarRecursosTecnologicosPorTipo(ArrayList<String> tiposRecursos) {
        ArrayList<ArrayList<String>> recursosEncontrados = new ArrayList<>();

        tiposRecursos.forEach(tipo -> {
            this.recursos.forEach( rt -> {
                if (rt.esDeTipo(tipo) & rt.estaAptoReserva()) {
                    ArrayList<String> modeloYMarca = rt.mostrarModeloYMarca();
                    String nroInventario = rt.mostrarNumeroRT();
                    String estado = rt.mostrarEstado();

                    recursosEncontrados.add(new ArrayList<>(
                        List.of(modeloYMarca.get(0), modeloYMarca.get(1), nroInventario, estado)
                    ));
                }
            });
        });
        return recursosEncontrados;
    }

    public void esTuCientifico() {
        // TODO implement here
    }

    public String getNombre() {
        return nombre;
    }
}