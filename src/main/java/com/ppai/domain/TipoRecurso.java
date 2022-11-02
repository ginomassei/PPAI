package com.ppai.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
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
    private List<Caracteristica> caracteristicas;

    public String mostrarCategoria() {
        return this.nombre;
    }
}
