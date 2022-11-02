package com.ppai.domain.gestion_recursos_tecnologicos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FranjaHoraria {
    private String horaDesde;
    private String horaHasta;
    private Integer periodosFraccionamiento;
}