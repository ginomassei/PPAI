package com.ppai.config.vendors;

import com.ppai.domain.gestion_recursos_tecnologicos.*;
import com.ppai.domain.gestion_turnos.turno.Turno;
import io.quarkus.runtime.Startup;

import javax.annotation.PostConstruct;
import javax.ejb.DependsOn;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;

@Singleton
@Startup
@DependsOn(value= {"EstadosVendor", "MarcasVendor"})
public class    RecursosVendor {
    @Inject
    EstadosVendor estadosVendor;

    @Inject
    MarcasVendor marcasVendor;

    private ArrayList<Caracteristica> caracteristicas;
    private static ArrayList<TipoRecurso> tiposRecurso;
    private ArrayList<CaracteristicaRecurso> caracteristicasRecurso;
    private ArrayList<RecursoTecnologico> recursosTecnologicos;

    @PostConstruct
    public void init() {
        caracteristicas = new ArrayList<>();
        tiposRecurso = new ArrayList<>();
        caracteristicasRecurso = new ArrayList<>();
        recursosTecnologicos = new ArrayList<>();

        crearCaracteristicas();
        crearTiposRecurso();
        crearCaracteristicasRecurso();
        crearRecursosTecnologicos();
    }

    public ArrayList<Caracteristica> getCaracteristicas() {
        return caracteristicas;
    }

    public static ArrayList<TipoRecurso> getTiposRecurso() {
        return tiposRecurso;
    }

    public ArrayList<CaracteristicaRecurso> getCaracteristicasRecurso() {
        return caracteristicasRecurso;
    }

    public ArrayList<RecursoTecnologico> getRecursosTecnologicos() {
        return recursosTecnologicos;
    }

    private void crearCaracteristicas() {
        Caracteristica caracteristica1 = new Caracteristica("Capacidad", null);
        Caracteristica caracteristica2 = new Caracteristica("Repetitivad", null);
        Caracteristica caracteristica3 = new Caracteristica("Linealidad", null);
        Caracteristica caracteristica4 = new Caracteristica("Tiempo de respuesta", null);
        Caracteristica caracteristica5 = new Caracteristica("Dimensiones", null);
        Caracteristica caracteristica6 = new Caracteristica("Peso", null);
        Caracteristica caracteristica7 = new Caracteristica("Pantalla LCD", null);
        Caracteristica caracteristica8 = new Caracteristica("Velocidad de enfoque", null);
        Caracteristica caracteristica9 = new Caracteristica("Velocidad de movimiento vertical", null);
        Caracteristica caracteristica10 = new Caracteristica("Platina", null);
        Caracteristica caracteristica11 = new Caracteristica("Potencia", null);
        Caracteristica caracteristica12 = new Caracteristica("Indicacion minima", null);

        caracteristicas.add(caracteristica1);
        caracteristicas.add(caracteristica2);
        caracteristicas.add(caracteristica3);
        caracteristicas.add(caracteristica4);
        caracteristicas.add(caracteristica5);
        caracteristicas.add(caracteristica6);
        caracteristicas.add(caracteristica7);
        caracteristicas.add(caracteristica8);
        caracteristicas.add(caracteristica9);
        caracteristicas.add(caracteristica10);
        caracteristicas.add(caracteristica11);
        caracteristicas.add(caracteristica12);
    }

    private void crearTiposRecurso() {
        ArrayList<Caracteristica> caracteristicasTipo1 = new ArrayList<>();
        ArrayList<Caracteristica> caracteristicasTipo2 = new ArrayList<>();
        ArrayList<Caracteristica> caracteristicasTipo3 = new ArrayList<>();
        ArrayList<Caracteristica> caracteristicasTipo4 = new ArrayList<>();
        ArrayList<Caracteristica> caracteristicasTipo5 = new ArrayList<>();

        caracteristicasTipo1.add(caracteristicas.get(4));
        caracteristicasTipo1.add(caracteristicas.get(5));
        caracteristicasTipo1.add(caracteristicas.get(0));
        caracteristicasTipo1.add(caracteristicas.get(1));
        caracteristicasTipo1.add(caracteristicas.get(2));
        caracteristicasTipo1.add(caracteristicas.get(3));

        TipoRecurso tipoRecurso1 = new TipoRecurso("Balanza", null, caracteristicasTipo1);

        caracteristicasTipo2.add(caracteristicas.get(4));
        caracteristicasTipo2.add(caracteristicas.get(5));
        caracteristicasTipo2.add(caracteristicas.get(6));
        caracteristicasTipo2.add(caracteristicas.get(7));
        caracteristicasTipo2.add(caracteristicas.get(8));
        caracteristicasTipo2.add(caracteristicas.get(9));

        TipoRecurso tipoRecurso2 = new TipoRecurso("Microscopio", null, caracteristicasTipo2);

        caracteristicasTipo3.add(caracteristicas.get(4));
        caracteristicasTipo3.add(caracteristicas.get(5));
        caracteristicasTipo3.add(caracteristicas.get(10));
        caracteristicasTipo3.add(caracteristicas.get(11));

        TipoRecurso tipoRecurso3 = new TipoRecurso("Resonador Magnetico", null, caracteristicasTipo3);

        caracteristicasTipo4.add(caracteristicas.get(4));
        caracteristicasTipo4.add(caracteristicas.get(5));
        caracteristicasTipo4.add(caracteristicas.get(0));
        caracteristicasTipo4.add(caracteristicas.get(10));

        TipoRecurso tipoRecurso4 = new TipoRecurso("Mezclador", null, caracteristicasTipo4);

        caracteristicasTipo5.add(caracteristicas.get(4));
        caracteristicasTipo5.add(caracteristicas.get(5));
        caracteristicasTipo5.add(caracteristicas.get(3));
        caracteristicasTipo5.add(caracteristicas.get(6));

        TipoRecurso tipoRecurso5 = new TipoRecurso("Impresora 3D", null, caracteristicasTipo5);

        tiposRecurso.add(tipoRecurso1);
        tiposRecurso.add(tipoRecurso2);
        tiposRecurso.add(tipoRecurso3);
        tiposRecurso.add(tipoRecurso4);
        tiposRecurso.add(tipoRecurso5);
    }

    private void crearCaracteristicasRecurso() {
        CaracteristicaRecurso caracteristicaRecurso1 = new CaracteristicaRecurso(caracteristicas.get(0),"20");
        CaracteristicaRecurso caracteristicaRecurso2 = new CaracteristicaRecurso(caracteristicas.get(0),"45");
        CaracteristicaRecurso caracteristicaRecurso3 = new CaracteristicaRecurso(caracteristicas.get(1),"1,2");
        CaracteristicaRecurso caracteristicaRecurso4 = new CaracteristicaRecurso(caracteristicas.get(1),"1,8");
        CaracteristicaRecurso caracteristicaRecurso5 = new CaracteristicaRecurso(caracteristicas.get(2),"0,03");
        CaracteristicaRecurso caracteristicaRecurso6 = new CaracteristicaRecurso(caracteristicas.get(2),"0,05");
        CaracteristicaRecurso caracteristicaRecurso7 = new CaracteristicaRecurso(caracteristicas.get(3),"4");
        CaracteristicaRecurso caracteristicaRecurso8 = new CaracteristicaRecurso(caracteristicas.get(3),"2");
        CaracteristicaRecurso caracteristicaRecurso9 = new CaracteristicaRecurso(caracteristicas.get(4),"20x10");
        CaracteristicaRecurso caracteristicaRecurso10 = new CaracteristicaRecurso(caracteristicas.get(4),"8x15");
        CaracteristicaRecurso caracteristicaRecurso11 = new CaracteristicaRecurso(caracteristicas.get(4),"22x40");
        CaracteristicaRecurso caracteristicaRecurso12 = new CaracteristicaRecurso(caracteristicas.get(4),"5x12");
        CaracteristicaRecurso caracteristicaRecurso13 = new CaracteristicaRecurso(caracteristicas.get(4),"18x40");
        CaracteristicaRecurso caracteristicaRecurso14 = new CaracteristicaRecurso(caracteristicas.get(4),"30x12");
        CaracteristicaRecurso caracteristicaRecurso15 = new CaracteristicaRecurso(caracteristicas.get(5),"200");
        CaracteristicaRecurso caracteristicaRecurso16 = new CaracteristicaRecurso(caracteristicas.get(5),"130");
        CaracteristicaRecurso caracteristicaRecurso17 = new CaracteristicaRecurso(caracteristicas.get(5),"400");
        CaracteristicaRecurso caracteristicaRecurso18 = new CaracteristicaRecurso(caracteristicas.get(5),"320");
        CaracteristicaRecurso caracteristicaRecurso19 = new CaracteristicaRecurso(caracteristicas.get(5),"750");
        CaracteristicaRecurso caracteristicaRecurso20 = new CaracteristicaRecurso(caracteristicas.get(5),"425");
        CaracteristicaRecurso caracteristicaRecurso21 = new CaracteristicaRecurso(caracteristicas.get(6),"320x240");
        CaracteristicaRecurso caracteristicaRecurso22 = new CaracteristicaRecurso(caracteristicas.get(6),"720x430");
        CaracteristicaRecurso caracteristicaRecurso23 = new CaracteristicaRecurso(caracteristicas.get(7),"0,4");
        CaracteristicaRecurso caracteristicaRecurso24 = new CaracteristicaRecurso(caracteristicas.get(7),"0,2");
        CaracteristicaRecurso caracteristicaRecurso25 = new CaracteristicaRecurso(caracteristicas.get(8),"0,9");
        CaracteristicaRecurso caracteristicaRecurso26 = new CaracteristicaRecurso(caracteristicas.get(9),"12x6");
        CaracteristicaRecurso caracteristicaRecurso27 = new CaracteristicaRecurso(caracteristicas.get(10),"2300");
        CaracteristicaRecurso caracteristicaRecurso28 = new CaracteristicaRecurso(caracteristicas.get(10),"1700");
        CaracteristicaRecurso caracteristicaRecurso29 = new CaracteristicaRecurso(caracteristicas.get(11),"0,001");
        CaracteristicaRecurso caracteristicaRecurso30 = new CaracteristicaRecurso(caracteristicas.get(11),"0,02");

        caracteristicasRecurso.add(caracteristicaRecurso1);
        caracteristicasRecurso.add(caracteristicaRecurso2);
        caracteristicasRecurso.add(caracteristicaRecurso3);
        caracteristicasRecurso.add(caracteristicaRecurso4);
        caracteristicasRecurso.add(caracteristicaRecurso5);
        caracteristicasRecurso.add(caracteristicaRecurso6);
        caracteristicasRecurso.add(caracteristicaRecurso7);
        caracteristicasRecurso.add(caracteristicaRecurso8);
        caracteristicasRecurso.add(caracteristicaRecurso9);
        caracteristicasRecurso.add(caracteristicaRecurso10);
        caracteristicasRecurso.add(caracteristicaRecurso11);
        caracteristicasRecurso.add(caracteristicaRecurso12);
        caracteristicasRecurso.add(caracteristicaRecurso13);
        caracteristicasRecurso.add(caracteristicaRecurso14);
        caracteristicasRecurso.add(caracteristicaRecurso15);
        caracteristicasRecurso.add(caracteristicaRecurso16);
        caracteristicasRecurso.add(caracteristicaRecurso17);
        caracteristicasRecurso.add(caracteristicaRecurso18);
        caracteristicasRecurso.add(caracteristicaRecurso19);
        caracteristicasRecurso.add(caracteristicaRecurso20);
        caracteristicasRecurso.add(caracteristicaRecurso21);
        caracteristicasRecurso.add(caracteristicaRecurso22);
        caracteristicasRecurso.add(caracteristicaRecurso23);
        caracteristicasRecurso.add(caracteristicaRecurso24);
        caracteristicasRecurso.add(caracteristicaRecurso25);
        caracteristicasRecurso.add(caracteristicaRecurso26);
        caracteristicasRecurso.add(caracteristicaRecurso27);
        caracteristicasRecurso.add(caracteristicaRecurso28);
        caracteristicasRecurso.add(caracteristicaRecurso29);
        caracteristicasRecurso.add(caracteristicaRecurso30);
    }

    public void crearRecursosTecnologicos() {
        ArrayList<CambioEstado> cambiosEstadoRecursoActivo = new ArrayList<>();
        ArrayList<CambioEstado> cambiosEstadoRecursoDeBaja = new ArrayList<>();

        ArrayList<CaracteristicaRecurso> caracteristicasRecurso1 = new ArrayList<>();
        ArrayList<CaracteristicaRecurso> caracteristicasRecurso2 = new ArrayList<>();
        ArrayList<CaracteristicaRecurso> caracteristicasRecurso3 = new ArrayList<>();
        ArrayList<CaracteristicaRecurso> caracteristicasRecurso4 = new ArrayList<>();
        ArrayList<CaracteristicaRecurso> caracteristicasRecurso5 = new ArrayList<>();
        ArrayList<CaracteristicaRecurso> caracteristicasRecurso6 = new ArrayList<>();
        ArrayList<CaracteristicaRecurso> caracteristicasRecurso7 = new ArrayList<>();
        ArrayList<CaracteristicaRecurso> caracteristicasRecurso8 = new ArrayList<>();
        ArrayList<CaracteristicaRecurso> caracteristicasRecurso9 = new ArrayList<>();
        ArrayList<CaracteristicaRecurso> caracteristicasRecurso10 = new ArrayList<>();
        ArrayList<CaracteristicaRecurso> caracteristicasRecurso11 = new ArrayList<>();
        ArrayList<CaracteristicaRecurso> caracteristicasRecurso12 = new ArrayList<>();
        ArrayList<CaracteristicaRecurso> caracteristicasRecurso13 = new ArrayList<>();
        ArrayList<CaracteristicaRecurso> caracteristicasRecurso14 = new ArrayList<>();
        ArrayList<CaracteristicaRecurso> caracteristicasRecurso15 = new ArrayList<>();

        ArrayList<Turno> turnosRecurso1 = new ArrayList<>();
        ArrayList<Turno> turnosRecurso2 = new ArrayList<>();
        ArrayList<Turno> turnosRecurso3 = new ArrayList<>();
        ArrayList<Turno> turnosRecurso4 = new ArrayList<>();
        ArrayList<Turno> turnosRecurso5 = new ArrayList<>();
        ArrayList<Turno> turnosRecurso6 = new ArrayList<>();
        ArrayList<Turno> turnosRecurso7 = new ArrayList<>();
        ArrayList<Turno> turnosRecurso8 = new ArrayList<>();
        ArrayList<Turno> turnosRecurso9 = new ArrayList<>();
        ArrayList<Turno> turnosRecurso10 = new ArrayList<>();
        ArrayList<Turno> turnosRecurso11 = new ArrayList<>();
        ArrayList<Turno> turnosRecurso12 = new ArrayList<>();
        ArrayList<Turno> turnosRecurso13 = new ArrayList<>();
        ArrayList<Turno> turnosRecurso14 = new ArrayList<>();
        ArrayList<Turno> turnosRecurso15 = new ArrayList<>();


        cambiosEstadoRecursoActivo.add(estadosVendor.getCambiosEstado().get(0));
        cambiosEstadoRecursoActivo.add(estadosVendor.getCambiosEstado().get(1));
        cambiosEstadoRecursoActivo.add(estadosVendor.getCambiosEstado().get(2));

        cambiosEstadoRecursoDeBaja.add(estadosVendor.getCambiosEstado().get(0));
        cambiosEstadoRecursoDeBaja.add(estadosVendor.getCambiosEstado().get(1));
        cambiosEstadoRecursoDeBaja.add(estadosVendor.getCambiosEstado().get(3));

        caracteristicasRecurso1.add(caracteristicasRecurso.get(10));
        caracteristicasRecurso1.add(caracteristicasRecurso.get(15));
        caracteristicasRecurso1.add(caracteristicasRecurso.get(0));
        caracteristicasRecurso1.add(caracteristicasRecurso.get(2));
        caracteristicasRecurso1.add(caracteristicasRecurso.get(4));
        caracteristicasRecurso1.add(caracteristicasRecurso.get(6));

        turnosRecurso1.add(estadosVendor.getTurnos().get(0));
        turnosRecurso1.add(estadosVendor.getTurnos().get(1));
        turnosRecurso1.add(estadosVendor.getTurnos().get(5));
        turnosRecurso1.add(estadosVendor.getTurnos().get(7));
        turnosRecurso1.add(estadosVendor.getTurnos().get(12));

        RecursoTecnologico recurso1 = new RecursoTecnologico(
            39,
            null,
            tiposRecurso.get(0),
            caracteristicasRecurso1,
            null,
            null,
            null,
            cambiosEstadoRecursoDeBaja,
            null,
            null,
            marcasVendor.getModelos().get(0),
            turnosRecurso1,
            null,
            null
        );

        caracteristicasRecurso2.add(caracteristicasRecurso.get(11));
        caracteristicasRecurso2.add(caracteristicasRecurso.get(16));
        caracteristicasRecurso2.add(caracteristicasRecurso.get(1));
        caracteristicasRecurso2.add(caracteristicasRecurso.get(3));
        caracteristicasRecurso2.add(caracteristicasRecurso.get(5));
        caracteristicasRecurso2.add(caracteristicasRecurso.get(7));

        turnosRecurso2.add(estadosVendor.getTurnos().get(0));
        turnosRecurso2.add(estadosVendor.getTurnos().get(1));
        turnosRecurso2.add(estadosVendor.getTurnos().get(3));
        turnosRecurso2.add(estadosVendor.getTurnos().get(5));
        turnosRecurso2.add(estadosVendor.getTurnos().get(13));

        RecursoTecnologico recurso2 = new RecursoTecnologico(
            14,
            null,
            tiposRecurso.get(0),
            caracteristicasRecurso2,
            null,
            null,
            null,
            cambiosEstadoRecursoActivo,
            null,
            null,
            marcasVendor.getModelos().get(1),
            turnosRecurso2,
            null,
            null
        );

        caracteristicasRecurso3.add(caracteristicasRecurso.get(12));
        caracteristicasRecurso3.add(caracteristicasRecurso.get(17));
        caracteristicasRecurso3.add(caracteristicasRecurso.get(0));
        caracteristicasRecurso3.add(caracteristicasRecurso.get(3));
        caracteristicasRecurso3.add(caracteristicasRecurso.get(4));
        caracteristicasRecurso3.add(caracteristicasRecurso.get(7));

        turnosRecurso3.add(estadosVendor.getTurnos().get(0));
        turnosRecurso3.add(estadosVendor.getTurnos().get(1));
        turnosRecurso3.add(estadosVendor.getTurnos().get(7));
        turnosRecurso3.add(estadosVendor.getTurnos().get(8));
        turnosRecurso3.add(estadosVendor.getTurnos().get(11));

        RecursoTecnologico recurso3 = new RecursoTecnologico(
            2,
            null,
            tiposRecurso.get(0),
            caracteristicasRecurso3,
            null,
            null,
            null,
            cambiosEstadoRecursoActivo,
            null,
            null,
            marcasVendor.getModelos().get(2),
            turnosRecurso3,
            null,
            null
        );

        caracteristicasRecurso4.add(caracteristicasRecurso.get(13));
        caracteristicasRecurso4.add(caracteristicasRecurso.get(18));
        caracteristicasRecurso4.add(caracteristicasRecurso.get(20));
        caracteristicasRecurso4.add(caracteristicasRecurso.get(22));
        caracteristicasRecurso4.add(caracteristicasRecurso.get(24));
        caracteristicasRecurso4.add(caracteristicasRecurso.get(25));

        turnosRecurso4.add(estadosVendor.getTurnos().get(0));
        turnosRecurso4.add(estadosVendor.getTurnos().get(1));
        turnosRecurso4.add(estadosVendor.getTurnos().get(2));
        turnosRecurso4.add(estadosVendor.getTurnos().get(6));
        turnosRecurso4.add(estadosVendor.getTurnos().get(9));

        RecursoTecnologico recurso4 = new RecursoTecnologico(
            98,
            null,
            tiposRecurso.get(1),
            caracteristicasRecurso4,
            null,
            null,
            null,
            cambiosEstadoRecursoActivo,
            null,
            null,
            marcasVendor.getModelos().get(3),
            turnosRecurso4,
            null,
            null
        );

        caracteristicasRecurso5.add(caracteristicasRecurso.get(13));
        caracteristicasRecurso5.add(caracteristicasRecurso.get(15));
        caracteristicasRecurso5.add(caracteristicasRecurso.get(21));
        caracteristicasRecurso5.add(caracteristicasRecurso.get(23));
        caracteristicasRecurso5.add(caracteristicasRecurso.get(24));
        caracteristicasRecurso5.add(caracteristicasRecurso.get(25));

        turnosRecurso5.add(estadosVendor.getTurnos().get(0));
        turnosRecurso5.add(estadosVendor.getTurnos().get(1));
        turnosRecurso5.add(estadosVendor.getTurnos().get(7));
        turnosRecurso5.add(estadosVendor.getTurnos().get(11));
        turnosRecurso5.add(estadosVendor.getTurnos().get(12));

        RecursoTecnologico recurso5 = new RecursoTecnologico(
            46,
            null,
            tiposRecurso.get(1),
            caracteristicasRecurso5,
            null,
            null,
            null,
            cambiosEstadoRecursoActivo,
            null,
            null,
            marcasVendor.getModelos().get(4),
            turnosRecurso5,
            null,
            null
        );

        caracteristicasRecurso6.add(caracteristicasRecurso.get(13));
        caracteristicasRecurso6.add(caracteristicasRecurso.get(15));
        caracteristicasRecurso6.add(caracteristicasRecurso.get(20));
        caracteristicasRecurso6.add(caracteristicasRecurso.get(23));
        caracteristicasRecurso6.add(caracteristicasRecurso.get(24));
        caracteristicasRecurso6.add(caracteristicasRecurso.get(25));

        turnosRecurso6.add(estadosVendor.getTurnos().get(0));
        turnosRecurso6.add(estadosVendor.getTurnos().get(1));
        turnosRecurso6.add(estadosVendor.getTurnos().get(3));
        turnosRecurso6.add(estadosVendor.getTurnos().get(9));
        turnosRecurso6.add(estadosVendor.getTurnos().get(10));

        RecursoTecnologico recurso6 = new RecursoTecnologico(
            77,
            null,
            tiposRecurso.get(1),
            caracteristicasRecurso6,
            null,
            null,
            null,
            cambiosEstadoRecursoDeBaja,
            null,
            null,
            marcasVendor.getModelos().get(5),
            turnosRecurso6,
            null,
            null
        );

        caracteristicasRecurso7.add(caracteristicasRecurso.get(12));
        caracteristicasRecurso7.add(caracteristicasRecurso.get(17));
        caracteristicasRecurso7.add(caracteristicasRecurso.get(26));
        caracteristicasRecurso7.add(caracteristicasRecurso.get(28));

        turnosRecurso7.add(estadosVendor.getTurnos().get(0));
        turnosRecurso7.add(estadosVendor.getTurnos().get(1));
        turnosRecurso7.add(estadosVendor.getTurnos().get(2));
        turnosRecurso7.add(estadosVendor.getTurnos().get(11));
        turnosRecurso7.add(estadosVendor.getTurnos().get(13));

        RecursoTecnologico recurso7 = new RecursoTecnologico(
            84,
            null,
            tiposRecurso.get(2),
            caracteristicasRecurso7,
            null,
            null,
            null,
            cambiosEstadoRecursoActivo,
            null,
            null,
            marcasVendor.getModelos().get(6),
            turnosRecurso7,
            null,
            null
        );

        caracteristicasRecurso8.add(caracteristicasRecurso.get(13));
        caracteristicasRecurso8.add(caracteristicasRecurso.get(15));
        caracteristicasRecurso8.add(caracteristicasRecurso.get(27));
        caracteristicasRecurso8.add(caracteristicasRecurso.get(29));

        turnosRecurso8.add(estadosVendor.getTurnos().get(0));
        turnosRecurso8.add(estadosVendor.getTurnos().get(1));
        turnosRecurso8.add(estadosVendor.getTurnos().get(6));
        turnosRecurso8.add(estadosVendor.getTurnos().get(10));
        turnosRecurso8.add(estadosVendor.getTurnos().get(12));

        RecursoTecnologico recurso8 = new RecursoTecnologico(
            33,
            null,
            tiposRecurso.get(2),
            caracteristicasRecurso8,
            null,
            null,
            null,
            cambiosEstadoRecursoDeBaja,
            null,
            null,
            marcasVendor.getModelos().get(7),
            turnosRecurso8,
            null,
            null
        );

        caracteristicasRecurso9.add(caracteristicasRecurso.get(11));
        caracteristicasRecurso9.add(caracteristicasRecurso.get(19));
        caracteristicasRecurso9.add(caracteristicasRecurso.get(26));
        caracteristicasRecurso9.add(caracteristicasRecurso.get(29));

        turnosRecurso9.add(estadosVendor.getTurnos().get(0));
        turnosRecurso9.add(estadosVendor.getTurnos().get(1));
        turnosRecurso9.add(estadosVendor.getTurnos().get(4));
        turnosRecurso9.add(estadosVendor.getTurnos().get(8));
        turnosRecurso9.add(estadosVendor.getTurnos().get(11));

        RecursoTecnologico recurso9 = new RecursoTecnologico(
            5,
            null,
            tiposRecurso.get(2),
            caracteristicasRecurso9,
            null,
            null,
            null,
            cambiosEstadoRecursoActivo,
            null,
            null,
            marcasVendor.getModelos().get(8),
            turnosRecurso9,
            null,
            null
        );

        caracteristicasRecurso10.add(caracteristicasRecurso.get(13));
        caracteristicasRecurso10.add(caracteristicasRecurso.get(18));
        caracteristicasRecurso10.add(caracteristicasRecurso.get(0));
        caracteristicasRecurso10.add(caracteristicasRecurso.get(26));

        turnosRecurso10.add(estadosVendor.getTurnos().get(0));
        turnosRecurso10.add(estadosVendor.getTurnos().get(1));
        turnosRecurso10.add(estadosVendor.getTurnos().get(5));
        turnosRecurso10.add(estadosVendor.getTurnos().get(7));
        turnosRecurso10.add(estadosVendor.getTurnos().get(13));

        RecursoTecnologico recurso10 = new RecursoTecnologico(
            19,
            null,
            tiposRecurso.get(3),
            caracteristicasRecurso10,
            null,
            null,
            null,
            cambiosEstadoRecursoActivo,
            null,
            null,
            marcasVendor.getModelos().get(9),
            turnosRecurso10,
            null,
            null
        );

        caracteristicasRecurso11.add(caracteristicasRecurso.get(11));
        caracteristicasRecurso11.add(caracteristicasRecurso.get(16));
        caracteristicasRecurso11.add(caracteristicasRecurso.get(1));
        caracteristicasRecurso11.add(caracteristicasRecurso.get(27));

        turnosRecurso11.add(estadosVendor.getTurnos().get(0));
        turnosRecurso11.add(estadosVendor.getTurnos().get(1));
        turnosRecurso11.add(estadosVendor.getTurnos().get(3));
        turnosRecurso11.add(estadosVendor.getTurnos().get(6));
        turnosRecurso11.add(estadosVendor.getTurnos().get(11));

        RecursoTecnologico recurso11 = new RecursoTecnologico(
            39,
            null,
            tiposRecurso.get(3),
            caracteristicasRecurso11,
            null,
            null,
            null,
            cambiosEstadoRecursoActivo,
            null,
            null,
            marcasVendor.getModelos().get(10),
            turnosRecurso11,
            null,
            null
        );

        caracteristicasRecurso12.add(caracteristicasRecurso.get(14));
        caracteristicasRecurso12.add(caracteristicasRecurso.get(15));
        caracteristicasRecurso12.add(caracteristicasRecurso.get(0));
        caracteristicasRecurso12.add(caracteristicasRecurso.get(27));

        turnosRecurso12.add(estadosVendor.getTurnos().get(0));
        turnosRecurso12.add(estadosVendor.getTurnos().get(1));
        turnosRecurso12.add(estadosVendor.getTurnos().get(5));
        turnosRecurso12.add(estadosVendor.getTurnos().get(9));
        turnosRecurso12.add(estadosVendor.getTurnos().get(13));

        RecursoTecnologico recurso12 = new RecursoTecnologico(
            2,
            null,
            tiposRecurso.get(3),
            caracteristicasRecurso12,
            null,
            null,
            null,
            cambiosEstadoRecursoDeBaja,
            null,
            null,
            marcasVendor.getModelos().get(11),
            turnosRecurso12,
            null,
            null
        );

        caracteristicasRecurso13.add(caracteristicasRecurso.get(12));
        caracteristicasRecurso13.add(caracteristicasRecurso.get(18));
        caracteristicasRecurso13.add(caracteristicasRecurso.get(6));
        caracteristicasRecurso13.add(caracteristicasRecurso.get(20));

        turnosRecurso13.add(estadosVendor.getTurnos().get(0));
        turnosRecurso13.add(estadosVendor.getTurnos().get(1));
        turnosRecurso13.add(estadosVendor.getTurnos().get(3));
        turnosRecurso13.add(estadosVendor.getTurnos().get(4));
        turnosRecurso13.add(estadosVendor.getTurnos().get(12));

        RecursoTecnologico recurso13 = new RecursoTecnologico(
            94,
            null,
            tiposRecurso.get(4),
            caracteristicasRecurso13,
            null,
            null,
            null,
            cambiosEstadoRecursoActivo,
            null,
            null,
            marcasVendor.getModelos().get(12),
            turnosRecurso13,
            null,
            null
        );

        caracteristicasRecurso14.add(caracteristicasRecurso.get(11));
        caracteristicasRecurso14.add(caracteristicasRecurso.get(15));
        caracteristicasRecurso14.add(caracteristicasRecurso.get(7));
        caracteristicasRecurso14.add(caracteristicasRecurso.get(21));

        turnosRecurso14.add(estadosVendor.getTurnos().get(0));
        turnosRecurso14.add(estadosVendor.getTurnos().get(1));
        turnosRecurso14.add(estadosVendor.getTurnos().get(2));
        turnosRecurso14.add(estadosVendor.getTurnos().get(7));
        turnosRecurso14.add(estadosVendor.getTurnos().get(11));

        RecursoTecnologico recurso14 = new RecursoTecnologico(
            94,
            null,
            tiposRecurso.get(4),
            caracteristicasRecurso14,
            null,
            null,
            null,
            cambiosEstadoRecursoDeBaja,
            null,
            null,
            marcasVendor.getModelos().get(13),
            turnosRecurso14,
            null,
            null
        );

        caracteristicasRecurso14.add(caracteristicasRecurso.get(10));
        caracteristicasRecurso14.add(caracteristicasRecurso.get(19));
        caracteristicasRecurso14.add(caracteristicasRecurso.get(6));
        caracteristicasRecurso14.add(caracteristicasRecurso.get(21));

        turnosRecurso15.add(estadosVendor.getTurnos().get(0));
        turnosRecurso15.add(estadosVendor.getTurnos().get(1));
        turnosRecurso15.add(estadosVendor.getTurnos().get(4));
        turnosRecurso15.add(estadosVendor.getTurnos().get(5));
        turnosRecurso15.add(estadosVendor.getTurnos().get(6));

        RecursoTecnologico recurso15 = new RecursoTecnologico(
            9312,
            null,
            tiposRecurso.get(4),
            caracteristicasRecurso15,
            null,
            null,
            null,
            cambiosEstadoRecursoActivo,
            null,
            null,
            marcasVendor.getModelos().get(14),
            turnosRecurso15,
            null,
            null
        );

        recursosTecnologicos.add(recurso1);
        recursosTecnologicos.add(recurso2);
        recursosTecnologicos.add(recurso3);
        recursosTecnologicos.add(recurso4);
        recursosTecnologicos.add(recurso5);
        recursosTecnologicos.add(recurso6);
        recursosTecnologicos.add(recurso7);
        recursosTecnologicos.add(recurso8);
        recursosTecnologicos.add(recurso9);
        recursosTecnologicos.add(recurso10);
        recursosTecnologicos.add(recurso11);
        recursosTecnologicos.add(recurso12);
        recursosTecnologicos.add(recurso13);
        recursosTecnologicos.add(recurso14);
        recursosTecnologicos.add(recurso15);
    }
}