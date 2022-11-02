package com.ppai.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "ASIGNACIONES_DIRECTOR")
public class AsignacionDirector extends AsignacionCientifico {

    @OneToOne
    private PersonalCientifico director;
}
