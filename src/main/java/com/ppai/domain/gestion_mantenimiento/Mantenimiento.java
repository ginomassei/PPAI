package com.ppai.domain.gestion_mantenimiento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mantenimiento {
    private Date fechaInicio;
    private Demora demoras;
    private Date fechaFin;

    public void mostrar() {
        // TODO implement here
    }

    public void extenciónFecha() {
        // TODO implement here
    }

    public void finMantenimiento() {
        // TODO implement here
    }
}