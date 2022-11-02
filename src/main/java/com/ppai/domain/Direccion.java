package com.ppai.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "DIRECCIONES")
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_DIRECCION", nullable = false)
    private Long id;

    @Column(name = "CALLE")
    private String calle;

    @Column(name = "NUMERO")
    private Integer numero;

    @Column(name = "EDIFICIO")
    private String edificio;

    @Column(name = "PISO")
    private Integer piso;

    @Column(name = "COORDENADAS")
    private String coordenadas;
}
