package com.ppai.domain;

import com.ppai.domain.state.Estado;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "CAMBIOS_ESTADO")
public class CambioEstado {
    @Id
    @Column(name = "ID_CAMBIO_ESTADO")
    private Long id;

    @Column(name = "FECHA_HORA_DESDE")
    private Date fechaHoraDesde;

    @Column(name = "FECHA_HORA_HASTA")
    private Date fechaHoraHasta;

    @OneToOne
    private Estado estado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ID_TURNO")
    private Turno turno;

    public CambioEstado() {}

    public CambioEstado(Date fechaHoraDesde, Date fechaHoraHasta, Estado estado) {
        this.fechaHoraDesde = fechaHoraDesde;
        this.fechaHoraHasta = fechaHoraHasta;
        this.estado = estado;
    }

    public String mostrarEstado() {
        return this.estado.mostrar();
    }

    public boolean esActual() {
        return fechaHoraHasta == null;
    }

    public void finalizar() {
        this.fechaHoraHasta = new Date();
    }

    public Estado getEstado() {
        return estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaHoraDesde() {
        return fechaHoraDesde;
    }

    public void setFechaHoraDesde(Date fechaHoraDesde) {
        this.fechaHoraDesde = fechaHoraDesde;
    }

    public Date getFechaHoraHasta() {
        return fechaHoraHasta;
    }

    public void setFechaHoraHasta(Date fechaHoraHasta) {
        this.fechaHoraHasta = fechaHoraHasta;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Turno getTurno() {
        return turno;
    }
}