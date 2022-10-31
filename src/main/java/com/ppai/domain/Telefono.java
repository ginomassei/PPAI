package com.ppai.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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

    public Telefono(String nroTelefono, String referencia) {
        this.nroTelefono = nroTelefono;
        this.referencia = referencia;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getNroTelefono() {
        return nroTelefono;
    }

    public void setNroTelefono(String nroTelefono) {
        this.nroTelefono = nroTelefono;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
}