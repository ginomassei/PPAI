package com.ppai.domain.gestion_mantenimiento;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

@Data
@AllArgsConstructor
public class Demora {

    private String motivo;
    private Date fechaEstimadaOriginal;
    private Date nuevaFechaEstimada;
}