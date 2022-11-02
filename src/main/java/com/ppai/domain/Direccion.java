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

    private String calle;
    private Integer numero;
    private String edificio;
    private Integer piso;
    private String coordenadas;
}
