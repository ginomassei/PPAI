package com.ppai.domain.gestion_recursos_tecnologicos;

import com.ppai.domain.gestion_recursos_tecnologicos.Caracteristica;

public class CaracteristicaRecurso {

    private Caracteristica caracteristica;
    private String valor;

    public CaracteristicaRecurso(Caracteristica caracteristica, String valor) {
        this.caracteristica = caracteristica;
        this.valor = valor;
    }
}