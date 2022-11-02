package com.ppai.domain.gestion_turnos.turno;

import com.ppai.domain.gestion_cientificos.asignaciones.AsignacionCientifico;
import com.ppai.domain.gestion_recursos_tecnologicos.RecursoTecnologico;
import com.ppai.domain.gestion_turnos.turno.estados.EstadoTurno;

public class SolicitudReservaTurno {
    private AsignacionCientifico cientifico;
    private RecursoTecnologico recurso;
    private EstadoTurno estadoTurno;
    private String motivo;

    public SolicitudReservaTurno(AsignacionCientifico cientifico, RecursoTecnologico recurso, EstadoTurno estadoTurno, String motivo) {
        this.cientifico = cientifico;
        this.recurso = recurso;
        this.estadoTurno = estadoTurno;
        this.motivo = motivo;
    }

    public void notificarAnalisisSolicitud() {
        // TODO implement here
    }
}