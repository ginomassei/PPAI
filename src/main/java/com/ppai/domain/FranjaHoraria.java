package com.ppai.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "FRANJAS_HORARIAS")
public class FranjaHoraria {

    @Id
    @Column(name = "ID_FRANJA_HORARIA")
    private Long id;

    @Column(name = "HORA_DESDE")
    private String horaDesde;

    @Column(name = "HORA_HASTA")
    private String horaHasta;

    @Column(name = "PERIODOS_FRACCIONARIOS")
    private Integer periodosFraccionamiento;
}
