package com.ppai.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Data
@Entity
@Table(name = "DISPONIBILIDAD")
public class Disponibilidad {

    @Id
    @Column(name = "ID_DISPONIBILIDAD")
    private Long id;

    @Column(name = "DIA")
    private Date dia;

    @OneToOne
    private FranjaHoraria franjasHorarias;

    @Column(name = "FECHA_DESDE")
    private Date fechaVigenciaDesde;

    @Column(name = "FECHA_HASTA")
    private Date fechaVigenciaHasta;



    public void modificar() {
        // TODO implement here
    }

    public void mostrar() {
        // TODO implement here
    }
}
