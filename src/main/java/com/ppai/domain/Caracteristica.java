package com.ppai.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "CARACTERISTICAS")
public class Caracteristica {

    @Id
    @Column(name = "ID_CARACTERISTICA")
    private Long id;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY)
    private TipoRecurso tipoRecurso;

    public void modificar() {
        // TODO implement here
    }
}
