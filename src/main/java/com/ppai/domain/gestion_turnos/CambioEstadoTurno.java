package com.ppai.domain.gestion_turnos;

import com.ppai.domain.gestion_turnos.estados.EstadoTurno;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

@Data
@AllArgsConstructor
public class CambioEstadoTurno {
    private Date fechaHoraDesde;
    private Date fechaHoraHasta;
    private EstadoTurno estadoTurno;

    public String mostrarEstado() {
        return this.estadoTurno.mostrarEstado();
    }

    public boolean esActual() {
        return fechaHoraHasta == null;
    }
}