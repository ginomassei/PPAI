package com.ppai.config.vendors;

import com.ppai.domain.gestion_recursos_tecnologicos.CambioEstado;
import com.ppai.domain.gestion_turnos.turno.CambioEstadoTurno;
import com.ppai.domain.state.*;
import com.ppai.domain.gestion_turnos.turno.Turno;
import com.ppai.domain.gestion_turnos.turno.estados.Disponible;
import com.ppai.domain.gestion_turnos.turno.estados.EstadoTurno;
import com.ppai.domain.gestion_turnos.turno.estados.Reservado;
import io.quarkus.runtime.Startup;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.Date;

@Startup
@Singleton
public class EstadosVendor {
    private static ArrayList<EstadoTurno> estadosTurno;
    private static ArrayList<Estado> estadosRecurso;
    private ArrayList<CambioEstado> cambiosEstado;
    private ArrayList<CambioEstadoTurno> cambiosEstadoTurno;
    private ArrayList<Turno> turnos;

    @PostConstruct
    public void init() {
        estadosTurno = new ArrayList<>();
        estadosRecurso = new ArrayList<>();
        cambiosEstado = new ArrayList<>();
        cambiosEstadoTurno = new ArrayList<>();
        turnos = new ArrayList<>();

        crearEstados();
        crearCambiosEstado();
        crearTurnos();
    }

    public void crearCambiosEstado() {
        // Cambios de estado para turnos
        Date fechaDesde1 = new Date(2022,01,23,9,00);
        Date fechaHasta1 = new Date(2022,01,23,12,00);
        CambioEstadoTurno cambioEstado0 = new CambioEstadoTurno(fechaDesde1, fechaHasta1, estadosTurno.get(0));
        Date fechaDesde2 = new Date(2022,01,25,11,00);
        Date fechaHasta2 = new Date(2022,01,25,12,00);
        CambioEstadoTurno cambioEstado1 = new CambioEstadoTurno(fechaDesde2, fechaHasta2, estadosTurno.get(1));
        Date fechaDesde3 = new Date(2022,02,2,18,00);
        Date fechaHasta3 = new Date(2022,02,2,20,30);
        CambioEstadoTurno cambioEstado2 = new CambioEstadoTurno(fechaDesde3, fechaHasta3, estadosTurno.get(0));
        Date fechaDesde4 = new Date(2022,02,5,17,00);
        CambioEstadoTurno cambioEstado3 = new CambioEstadoTurno(fechaDesde4, null, estadosTurno.get(1));
        Date fechaDesde5 = new Date(2022,03,2,8,00);
        CambioEstadoTurno cambioEstado4 = new CambioEstadoTurno(fechaDesde5, null, estadosTurno.get(0));
        // Ahora si este es el ultimo cambio de estado el turno esta disponible.

        // Cambios de estado para recursos
        Date fechaDesde6 = new Date(2022,01,23,9,00);
        Date fechaHasta6 = new Date(2022,01,23,12,00);
        CambioEstado cambioEstado5 = new CambioEstado(fechaDesde6, fechaHasta6, estadosRecurso.get(0));
        Date fechaDesde7 = new Date(2022,01,25,11,00);
        Date fechaHasta7 = new Date(2022,01,25,12,00);
        CambioEstado cambioEstado6 = new CambioEstado(fechaDesde7, fechaHasta7, estadosRecurso.get(1));
        Date fechaDesde8 = new Date(2022,02,2,18,00);
        CambioEstado cambioEstado7 = new CambioEstado(fechaDesde8, null, estadosRecurso.get(0));
        Date fechaDesde9 = new Date(2022,02,2,18,00);
        CambioEstado cambioEstado8 = new CambioEstado(fechaDesde9, null, estadosRecurso.get(0));

        cambiosEstadoTurno.add(cambioEstado0);
        cambiosEstadoTurno.add(cambioEstado1);
        cambiosEstadoTurno.add(cambioEstado2);
        cambiosEstadoTurno.add(cambioEstado3);
        cambiosEstadoTurno.add(cambioEstado4);
        cambiosEstado.add(cambioEstado5);
        cambiosEstado.add(cambioEstado6);
        cambiosEstado.add(cambioEstado7);
        cambiosEstado.add(cambioEstado8);
    }

    public void crearEstados() {
        EstadoTurno estadoTurno0 = new Disponible();
        EstadoTurno estadoTurno1 = new Reservado();
        Estado estado2 = new Activo();
        Estado estado3 = new BajaTecnica();
        Estado estado4 = new BajaDefinitiva();

        estadosTurno.add(estadoTurno0);
        estadosTurno.add(estadoTurno1);
        estadosRecurso.add(estado2);
        estadosRecurso.add(estado3);
        estadosRecurso.add(estado4);
    }

    private void crearTurnos() {
        // Turno finalizado
        ArrayList<CambioEstadoTurno> cambiosEstadoFinalizado = new ArrayList<>();
        cambiosEstadoFinalizado.add(cambiosEstadoTurno.get(0));
        cambiosEstadoFinalizado.add(cambiosEstadoTurno.get(1));
        cambiosEstadoFinalizado.add(cambiosEstadoTurno.get(2));

        ArrayList<CambioEstadoTurno> cambiosEstadoDisponible = new ArrayList<>();
        cambiosEstadoDisponible.add(cambiosEstadoTurno.get(0));
        cambiosEstadoDisponible.add(cambiosEstadoTurno.get(1));
        cambiosEstadoDisponible.add(cambiosEstadoTurno.get(4));

        // Turno finalizado
        Date fechaDesde1 = new Date(2022,03,23,9,00);
        Date fechaHasta1 = new Date(2022,03,23,12,00);
        Turno turno1 = new Turno(cambiosEstadoFinalizado, fechaDesde1, fechaHasta1, null,null);

        // Turno finalizado
        Date fechaDesde2 = new Date(2022,04,2,12,00);
        Date fechaHasta2 = new Date(2022,04,2,14,30);
        Turno turno2 = new Turno(cambiosEstadoFinalizado, fechaDesde2, fechaHasta2, null, null);

        // Turno disponible
        Date fechaDesde3 = new Date(2022,04,3,8,00);
        Date fechaHasta3 = new Date(2022,04,3,9,30);

        Turno turno3 = new Turno(cambiosEstadoDisponible, fechaDesde3, fechaHasta3, null, null);

        // Turno disponible
        Date fechaDesde4 = new Date(2022,05,7,18,30);
        Date fechaHasta4 = new Date(2022,05,7,20,00);

        Turno turno4 = new Turno(cambiosEstadoDisponible, fechaDesde4, fechaHasta4, null, null);

        // Turno disponible
        Date fechaDesde5 = new Date(2022,05,10,11,00);
        Date fechaHasta5 = new Date(2022,05,10,14,00);

        Turno turno5 = new Turno(cambiosEstadoDisponible, fechaDesde5, fechaHasta5, null, null);

        // Turno disponible
        Date fechaDesde6 = new Date(2022,06,2,13,45);
        Date fechaHasta6 = new Date(2022,06,2,17,00);

        Turno turno6 = new Turno(cambiosEstadoDisponible, fechaDesde6, fechaHasta6, null, null);

        // Turno disponible
        Date fechaDesde7 = new Date(2022,06,9,7,30);
        Date fechaHasta7 = new Date(2022,06,9,11,00);

        Turno turno7 = new Turno(cambiosEstadoDisponible, fechaDesde7, fechaHasta7, null, null);

        // Turno disponible
        Date fechaDesde8 = new Date(2022,06,16,17,00);
        Date fechaHasta8 = new Date(2022,06,16,19,00);

        Turno turno8 = new Turno(cambiosEstadoDisponible, fechaDesde8, fechaHasta8, null, null);

        //Turno disponible

        Date fechaDesde9 = new Date(2022,06,22,13,00);
        Date fechaHasta9 = new Date(2022,06,22,18,00);

        Turno turno9 = new Turno(cambiosEstadoDisponible, fechaDesde9, fechaHasta9, null, null);

        //Turno disponible

        Date fechaDesde10 = new Date(2022,06,27,20,00);
        Date fechaHasta10 = new Date(2022,06,27,21,30);

        Turno turno10 = new Turno(cambiosEstadoDisponible, fechaDesde10, fechaHasta10, null, null);

        //Turno disponible

        Date fechaDesde11 = new Date(2022,06,30,17,30);
        Date fechaHasta11 = new Date(2022,06,30,19,00);

        Turno turno11 = new Turno(cambiosEstadoDisponible, fechaDesde11, fechaHasta11, null, null);

        //Turno disponible

        Date fechaDesde12 = new Date(2022,07,10,11,45);
        Date fechaHasta12 = new Date(2022,07,10,14,00);

        Turno turno12 = new Turno(cambiosEstadoDisponible, fechaDesde12, fechaHasta12, null, null);

        //Turno disponible

        Date fechaDesde13 = new Date(2022,07,13,10,00);
        Date fechaHasta13 = new Date(2022,07,13,12,00);

        Turno turno13 = new Turno(cambiosEstadoDisponible, fechaDesde13, fechaHasta13, null, null);

        //Turno disponible

        Date fechaDesde14 = new Date(2022,07,21,20,00);
        Date fechaHasta14 = new Date(2022,07,21,21,30);

        Turno turno14 = new Turno(cambiosEstadoDisponible, fechaDesde14, fechaHasta14, null, null);

        turnos.add(turno1);
        turnos.add(turno2);
        turnos.add(turno3);
        turnos.add(turno4);
        turnos.add(turno5);
        turnos.add(turno6);
        turnos.add(turno7);
        turnos.add(turno8);
        turnos.add(turno9);
        turnos.add(turno10);
        turnos.add(turno11);
        turnos.add(turno12);
        turnos.add(turno13);
        turnos.add(turno14);
    }

    public ArrayList<CambioEstado> getCambiosEstado() {
        return cambiosEstado;
    }

    public ArrayList<Turno> getTurnos() {
        return turnos;
    }
}
