package com.ppai.domain.gestion_recursos_tecnologicos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

@Data
@AllArgsConstructor
public class Disponibilidad {
    private Date dia;
    private FranjaHoraria franjasHorarias;
    private Date fechaVigenciaDesde;
    private Date fechaVigenciaHasta;

    public void modificar() {
        // TODO implement here
    }

    public void mostrar() {
        // TODO implement here
    }
}