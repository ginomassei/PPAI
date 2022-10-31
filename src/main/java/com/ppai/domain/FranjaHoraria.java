package com.ppai.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FRANJAS_HORARIAS")
public class FranjaHoraria {

    @Id
    @Column(name = "ID_FRANJA_HORARIA")
    private Long id;

    private String horaDesde;
    private String horaHasta;
    private Integer periodosFraccionamiento;

    public FranjaHoraria(String horaDesde, String horaHasta, Integer periodosFraccionamiento) {
        this.horaDesde = horaDesde;
        this.horaHasta = horaHasta;
        this.periodosFraccionamiento = periodosFraccionamiento;
    }

    public FranjaHoraria() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}