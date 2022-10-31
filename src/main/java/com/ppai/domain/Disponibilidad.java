package com.ppai.domain;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "DISPONIBILIDAD")
public class Disponibilidad {

    @Id
    @Column(name = "ID_DISPONIBILIDAD")
    private Long id;

    @Column(name = "DIA")
    private Date dia;

    @OneToOne
    private FranjaHoraria franjasHorarias;

    @Column(name = "FECHA_DESDE")
    private Date fechaVigenciaDesde;

    @Column(name = "FECHA_HASTA")
    private Date fechaVigenciaHasta;

    public Disponibilidad(Date dia, FranjaHoraria franjasHorarias, Date fechaVigenciaDesde, Date fechaVigenciaHasta) {
        this.dia = dia;
        this.franjasHorarias = franjasHorarias;
        this.fechaVigenciaDesde = fechaVigenciaDesde;
        this.fechaVigenciaHasta = fechaVigenciaHasta;
    }

    public Disponibilidad() {

    }

    public void modificar() {
        // TODO implement here
    }

    public void mostrar() {
        // TODO implement here
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public FranjaHoraria getFranjasHorarias() {
        return franjasHorarias;
    }

    public void setFranjasHorarias(FranjaHoraria franjasHorarias) {
        this.franjasHorarias = franjasHorarias;
    }

    public Date getFechaVigenciaDesde() {
        return fechaVigenciaDesde;
    }

    public void setFechaVigenciaDesde(Date fechaVigenciaDesde) {
        this.fechaVigenciaDesde = fechaVigenciaDesde;
    }

    public Date getFechaVigenciaHasta() {
        return fechaVigenciaHasta;
    }

    public void setFechaVigenciaHasta(Date fechaVigenciaHasta) {
        this.fechaVigenciaHasta = fechaVigenciaHasta;
    }
}