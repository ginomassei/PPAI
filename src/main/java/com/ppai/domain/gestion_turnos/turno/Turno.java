package com.ppai.domain.gestion_turnos.turno;

import com.ppai.domain.gestion_turnos.turno.estados.Disponible;
import com.ppai.domain.gestion_turnos.turno.estados.EstadoTurno;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class Turno {
    private static int turnoGlobalTracker = 0;
    private ArrayList<CambioEstadoTurno> cambioEstados;
    private EstadoTurno estadoTurno;
    private Date fechaHoraDesde;
    private Date fechaHoraHasta;
    private Date fechaHoraInicioTurno;
    private Date fechaHoraFinTurno;
    private int id;

    public Turno(
        ArrayList<CambioEstadoTurno> cambioEstados,
        Date fechaHoraDesde,
        Date fechaHoraHasta,
        Date fechaHoraInicioTurno,
        Date fechaHoraFinTurno
    ) {
        this.cambioEstados = cambioEstados;
        this.fechaHoraDesde = fechaHoraDesde;
        this.fechaHoraHasta = fechaHoraHasta;
        this.fechaHoraInicioTurno = fechaHoraInicioTurno;
        this.fechaHoraFinTurno = fechaHoraFinTurno;
        id = turnoGlobalTracker++;
        estadoTurno = new Disponible();
    }

    public void notificarInasistencia() {
        // TODO implement here
    }

    public void reservarTurno() {
        Date fechaHoraActual = new Date();
        this.estadoTurno.reservarTurno(fechaHoraActual, this);
    }

    public boolean esActivo() {
        AtomicBoolean activo = new AtomicBoolean(false);
        cambioEstados.forEach(cambioEstado -> {
            if (cambioEstado.esActual() && estadoTurno.esDisponible()) {
                activo.set(true);
            }
        });
        return activo.get();
    }

    public boolean esPosteriorA(Date today) {
        return fechaHoraDesde.after(today);
    }

    public String mostrarId() {
        return Integer.toString(id);
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

    public void vincularNuevoCambioEstado(CambioEstadoTurno cambioEstado) {
        this.cambioEstados.add(cambioEstado);
    }

    public Date getFechaHoraDesde() {
        return fechaHoraDesde;
    }

    public Date getFechaHoraHasta() {
        return fechaHoraHasta;
    }

    public Date getFechaHoraInicioTurno() {
        return fechaHoraInicioTurno;
    }

    public Date getFechaHoraFinTurno() {
        return fechaHoraFinTurno;
    }

    public ArrayList<CambioEstadoTurno> getCambioEstados() {
        return cambioEstados;
    }

    public EstadoTurno getEstado() {
        return estadoTurno;
    }

    public void setEstado(EstadoTurno estadoTurno) {
        this.estadoTurno = estadoTurno;
    }
}