package com.ppai.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Data
@Entity
@Table(name = "MARCAS")
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_MARCA", nullable = false)
    private Long id;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @OneToMany(mappedBy = "marca", cascade = CascadeType.ALL)
    private List<Modelo> modelos;

    public boolean esTuModelo(Modelo modelo) {
        return this.modelos.contains(modelo);
    }
}