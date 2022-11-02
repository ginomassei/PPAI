package com.ppai.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "ASIGNACIONES_RECURSOS_TECNOLOGICOS")
public class AsignacionRT extends AsignacionCientifico {

    @ManyToOne
    @JoinColumn(name = "ID_RECURSO_TECNOLOGICO")
    private RecursoTecnologico recursoTecnologico;
}
