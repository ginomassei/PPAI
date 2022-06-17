package com.ppai.domain;

import java.util.*;


public class FranjaHoraria {

    private String horaDesde;
    private String horaHasta;
    private Integer periodosFraccionamiento;

    public FranjaHoraria(String horaDesde, String horaHasta, Integer periodosFraccionamiento) {
        this.horaDesde = horaDesde;
        this.horaHasta = horaHasta;
        this.periodosFraccionamiento = periodosFraccionamiento;
    }
}