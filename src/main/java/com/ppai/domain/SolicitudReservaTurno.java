package com.ppai.domain;

import com.ppai.domain.state.Estado;

public class SolicitudReservaTurno {
    private AsignacionCientifico cientifico;
    private RecursoTecnologico recurso;
    private Estado estado;
    private String motivo;

    public SolicitudReservaTurno(AsignacionCientifico cientifico, RecursoTecnologico recurso, Estado estado, String motivo) {
        this.cientifico = cientifico;
        this.recurso = recurso;
        this.estado = estado;
        this.motivo = motivo;
    }

    public void notificarAnalisisSolicitud() {
        // TODO implement here
    }
}