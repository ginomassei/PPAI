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

    private String nombre;
    private String descripción;

    public void mostrar() {
        // TODO implement here
    }

    public void modificar() {
        // TODO implement here
    }

    public String mostrarMarca() {
        String miMarca = "";
//        for (Marca marca: MarcasVendor.getMarcas()) {
//            if (marca.esTuModelo(this)) {
//                miMarca = marca.mostrarNombre();
//                return miMarca;
//            }
//        }
        return miMarca;
    }

    public String mostrarNombre() {
        return this.nombre;
    }
}