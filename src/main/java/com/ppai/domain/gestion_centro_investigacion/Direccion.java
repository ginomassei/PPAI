package com.ppai.domain.gestion_centro_investigacion;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Direccion {
    private String calle;
    private Integer numero;
    private String edificio;
    private Integer piso;
    private String coordenadas;
}
