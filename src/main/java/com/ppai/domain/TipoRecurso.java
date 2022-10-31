package com.ppai.domain;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "TIPOS_RECURSO")
public class TipoRecurso {
    @Id
    @Column(name = "ID_TIPO_RECURSO")
    private Long id;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "CARACTERISTICAS")
    @OneToMany(mappedBy = "tipoRecurso", cascade = CascadeType.ALL, targetEntity = Caracteristica.class)
    private ArrayList<Caracteristica> caracteristicas;

    public TipoRecurso(String nombre, String descripcion, ArrayList<Caracteristica> caracteristicas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.caracteristicas = caracteristicas;
    }

    public TipoRecurso() {

    }

    public String mostrarCategoria() {
        return this.nombre;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Caracteristica> getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(ArrayList<Caracteristica> caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
}