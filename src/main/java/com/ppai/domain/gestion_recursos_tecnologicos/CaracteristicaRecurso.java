package com.ppai.domain.gestion_recursos_tecnologicos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CaracteristicaRecurso {
    private Caracteristica caracteristica;
    private String valor;
}