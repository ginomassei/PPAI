package com.ppai.domain;

import com.ppai.domain.state.Estado;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

@Entity
@Table(name = "TURNOS")
public class Turno {
    @Id
    @Column(name = "ID_TURNO")
    private Long id;
    @OneToMany(mappedBy = "turno", cascade = CascadeType.ALL, targetEntity = CambioEstado.class)
    private List<CambioEstado> cambiosEstado;
    @OneToOne
    private Estado estado;

    @Column(name = "FECHA_HORA_DESDE")
    private Date fechaHoraDesde;

    @Column(name = "FECHA_HORA_HASTA")
    private Date fechaHoraHasta;

    @Column(name = "FECHA_HORA_INICIO_TURNO")
    private Date fechaHoraInicioTurno;

    @Column(name = "FECHA_HORA_FIN_TURNO")
    private Date fechaHoraFinTurno;

    public Turno() {}

    public Turno(
        ArrayList<CambioEstado> cambiosEstado,
        Date fechaHoraDesde,
        Date fechaHoraHasta,
        Date fechaHoraInicioTurno,
        Date fechaHoraFinTurno
    ) {
        this.cambiosEstado = cambiosEstado;
        this.fechaHoraDesde = fechaHoraDesde;
        this.fechaHoraHasta = fechaHoraHasta;
        this.fechaHoraInicioTurno = fechaHoraInicioTurno;
        this.fechaHoraFinTurno = fechaHoraFinTurno;
    }

    public void notificarInasistencia() {
        // TODO implement here
    }

    public void reservarTurno() {
        Date fechaHoraActual = new Date();
        this.estado.reservarTurno(fechaHoraActual, this);
    }

    public boolean esActivo() {
        AtomicBoolean activo = new AtomicBoolean(false);
        cambiosEstado.forEach(cambioEstado -> {
            if (cambioEstado.esActual()) {
                activo.set(true);
            }
        });
        return activo.get();
    }

    public boolean esPosteriorA(Date today) {
        return fechaHoraDesde.after(today);
    }

    public String mostrarId() {
        return Integer.toString(Math.toIntExact(id));
    }

    public boolean esTuId(int id) {
        return this.id == id;
    }

    public String[] mostrarTurno() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        // Convert Date to Calendar
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();

        c1.setTime(getFechaHoraDesde());
        c2.setTime(getFechaHoraHasta());
        // Perform addition / subtraction
        c1.add(Calendar.YEAR, -1900);
        c2.add(Calendar.YEAR, -1900);

        // Convert calendar back to Date
        Date fechaHoraDesde = c1.getTime();
        Date fechaHoraHasta = c2.getTime();

        return new String[] {formatter.format(fechaHoraDesde), formatter.format(fechaHoraHasta), mostrarId()};
    }

    public void vincularNuevoCambioEstado(CambioEstado cambioEstado) {
        this.cambiosEstado.add(cambioEstado);
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

    public Date getFechaHoraInicioTurno() {
        return fechaHoraInicioTurno;
    }

    public void setFechaHoraInicioTurno(Date fechaHoraInicioTurno) {
        this.fechaHoraInicioTurno = fechaHoraInicioTurno;
    }

    public void setFechaHoraFinTurno(Date fechaHoraFinTurno) {
        this.fechaHoraFinTurno = fechaHoraFinTurno;
    }

    public Date getFechaHoraFinTurno() {
        return fechaHoraFinTurno;
    }

    public List<CambioEstado> getCambiosEstado() {
        return cambiosEstado;
    }

    public void setCambiosEstado(List<CambioEstado> cambioEstados) {
        this.cambiosEstado = cambioEstados;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Long getId() {
       return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}