package com.ppai.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "TELEFONOS")
public class Telefono {
    @Id
    @Column(name = "ID_TELEFONO")
    private Long id;

    @Column(name = "NRO_TELEFONO")
    private String nroTelefono;

    @Column(name = "REFERENCIA")
    private String referencia;
}
