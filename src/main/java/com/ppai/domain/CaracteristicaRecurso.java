package com.ppai.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "CARACTERISTICAS_RECURSO")
public class CaracteristicaRecurso {

    @Id
    @Column(name = "ID_CARACTERISTICA_RECURSO")
    private Long id;

    @OneToOne
    private Caracteristica caracteristica;

    @Column(name = "VALOR")
    private String valor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ID_RECURSO_TECNOLOGICO")
    private RecursoTecnologico recursoTecnologico;
}
