package com.ppai.domain.gestion_centro_investigacion;

import com.ppai.domain.gestion_cientificos.cientifico.PersonalCientifico;
import com.ppai.domain.gestion_cientificos.asignaciones.AsignacionCientificoCI;
import com.ppai.domain.gestion_cientificos.asignaciones.AsignacionDirector;
import com.ppai.domain.gestion_recursos_tecnologicos.RecursoTecnologico;
import com.ppai.domain.gestion_turnos.estados.EstadoTurno;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class CentroInvestigacion {
    private String nombre;
    private String sigla;
    private Direccion direccion;
    private Telefono telefonos;
    private String correoElectronico;
    private PersonalCientifico director;
    private Integer tiempoPrevioReserva;
    private Date fechaInicio;
    private EstadoTurno estado;
    private Date fechaBaja;
    private String motivoBaja;
    private ArrayList<RecursoTecnologico> recursos;
    private Integer numeroResolucion;
    private Date fechaResolucion;
    private String reglamento;
    private Date fechaAlta;
    private String caracteristicas;
    private AsignacionDirector direc;
    private ArrayList<AsignacionCientificoCI> asignacionCientificoCIS;

    public CentroInvestigacion(
        String nombre,
        String sigla,
        Direccion direccion,
        Telefono telefonos,
        String correoElectronico,
        PersonalCientifico director,
        Integer tiempoPrevioReserva,
        Date fechaInicio,
        EstadoTurno estado,
        Date fechaBaja,
        String motivoBaja,
        ArrayList<RecursoTecnologico> recursos,
        Integer numeroResolucion,
        Date fechaResolucion,
        String reglamento,
        Date fechaAlta,
        String caracteristicas,
        AsignacionDirector direc,
        ArrayList<AsignacionCientificoCI> asignacionCientificoCIS
    ) {
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
        this.numeroResolucion = numeroResolucion;
        this.fechaResolucion = fechaResolucion;
        this.reglamento = reglamento;
        this.fechaAlta = fechaAlta;
        this.caracteristicas = caracteristicas;
        this.direc = direc;
        this.asignacionCientificoCIS = asignacionCientificoCIS;
    }

    public void darDeBaja() {
        // TODO implement here
    }

    public ArrayList<RecursoTecnologico> listarRecursosTecnológicos() {
        return this.recursos;
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
        } else return new Date().before(this.fechaBaja);
    }

    public ArrayList<ArrayList<String>> listarRecursosTecnologicosPorTipo(ArrayList<String> tiposRecursos) {
        ArrayList<ArrayList<String>> recursosEncontrados = new ArrayList<>();

        tiposRecursos.forEach(tipo -> {
            this.recursos.forEach( rt -> {
                if (rt.esDeTipo(tipo) && rt.estaAptoReserva()) {
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

    public boolean esTuCientifico(PersonalCientifico cientifico) {
        AtomicBoolean esTuCientifico = new AtomicBoolean(false);
        this.asignacionCientificoCIS.forEach(asignacionCientificoCI -> {
            if (asignacionCientificoCI.esTuCientifico(cientifico) && asignacionCientificoCI.esCientificoActivo()) {
                esTuCientifico.set(true);
            }
        });
        return esTuCientifico.get();
    }

    public String getNombre() {
        return nombre;
    }

    public boolean esTuNombre(String nombre) {
        return this.nombre.equals(nombre);
    }
}