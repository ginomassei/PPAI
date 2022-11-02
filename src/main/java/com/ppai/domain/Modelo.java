package com.ppai.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "MODELOS")
public class Modelo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_MODELO", nullable = false)
    private Long id;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "DESCRIPCION")
    private String descripcion;

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "ID_MARCA")
//    private Marca marca;

    public String mostrarMarca() {
//        return this.marca.getNombre();
        return "";
    }

    public String mostrarNombre() {
        return this.nombre;
    }
}