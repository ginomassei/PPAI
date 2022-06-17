package com.ppai.domain;

import java.util.*;

public class Direccion {

    private String calle;
    private Integer numero;
    private String edificio;
    private Integer piso;
    private String coordenadas;

    public Direccion(String calle, Integer numero, String edificio, Integer piso, String coordenadas) {
        this.calle = calle;
        this.numero = numero;
        this.edificio = edificio;
        this.piso = piso;
        this.coordenadas = coordenadas;
    }

}