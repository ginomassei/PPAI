package com.ppai.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Data
@Entity
@Table(name = "DEMORAS")
public class Demora {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_DEMORA", nullable = false)
    private Long id;

    @Column(name = "MOTIVO")
    private String motivo;

    @Column(name = "FECHA_ESTIMADA_ORIGINAL")
    private Date fechaEstimadaOriginal;

    @Column(name = "NUEVA_FECHA_ESTIMADA")
    private Date nuevaFechaEstimada;
}
