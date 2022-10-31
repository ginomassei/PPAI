package com.ppai.domain;

import javax.persistence.*;

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

    public CaracteristicaRecurso(Caracteristica caracteristica, String valor) {
        this.caracteristica = caracteristica;
        this.valor = valor;
    }

    public CaracteristicaRecurso() {

    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    public Caracteristica getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(Caracteristica caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}