package com.ppai.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "MANTENIMIENTOS")
public class Mantenimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_MANTENIMIENTO", nullable = false)
    private Long id;

    @Column(name = "FECHA_INICIO")
    private Date fechaInicio;

    @OneToOne
    private Demora demoras;

    @Column(name = "FECHA_FIN")
    private Date fechaFin;

    public void crear() {
        // TODO implement here
    }

    public void mostrar() {
        // TODO implement here
    }

    public void extenciónFecha() {
        // TODO implement here
    }

    public void finMantenimiento() {
        // TODO implement here
    }

}