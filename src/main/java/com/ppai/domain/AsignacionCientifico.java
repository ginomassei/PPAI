package com.ppai.domain;

import lombok.Data;
import javax.persistence.*;
import java.util.*;

@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "ASIGNACIONES_CIENTIFICOS")
public class AsignacionCientifico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_ASIGNACION_CIENTIFICO", nullable = false)
    private Long id;

    @OneToOne
    @JoinColumn(name = "LEGAJO_PERSONAL_CIENTIFICO")
    private PersonalCientifico cientifico;

    @Column(name = "FECHA_INICIO")
    private Date fechaInicio;

    @Column(name = "FECHA_FIN")
    private Date fechaFin;

    public boolean esCientificoActivo() {
        if (this.fechaFin == null) {
            return true;
        } else return new Date().before(this.fechaFin);
    }

    public boolean esTuCientifico(PersonalCientifico cientifico) {
        return this.cientifico.equals(cientifico);
    }
}