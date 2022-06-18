package com.ppai.config;

import com.ppai.domain.*;
import io.quarkus.runtime.Startup;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.Date;

@Singleton
@Startup
public class GlobalVendor {
    public static ArrayList<Caracteristica> caracteristicas;
    public static ArrayList<TipoRecurso> tiposRecurso;
    public static ArrayList<Modelo> modelos;
    public static ArrayList<Marca> marcas;
    public static ArrayList<PersonalCientifico> cientificos;
    public static ArrayList<RecursoTecnologico> recursosTecnologicos;
    public static ArrayList<CentroInvestigacion> centrosInvestigacion;
    public static ArrayList<CambioEstado> cambiosEstado;
    public static ArrayList<Turno> turnos;
    public static ArrayList<Estado> estados;
    public static ArrayList<CaracteristicaRecurso> caracteristicasRecurso;
    public static ArrayList<Usuario> usuarios;
    public static ArrayList<AsignacionCientificoCI> asignacionesCientificoCI;

    public static ArrayList<Caracteristica> getCaracteristicas() {
        return caracteristicas;
    }

    public static ArrayList<TipoRecurso> getTiposRecurso() {
        return tiposRecurso;
    }

    public static ArrayList<Modelo> getModelos() {
        return modelos;
    }

    public static ArrayList<Marca> getMarcas() {
        return marcas;
    }

    public static ArrayList<PersonalCientifico> getCientificos() {
        return cientificos;
    }

    public static ArrayList<RecursoTecnologico> getRecursosTecnologicos() {
        return recursosTecnologicos;
    }

    public static ArrayList<CentroInvestigacion> getCentrosInvestigacion() {
        return centrosInvestigacion;
    }

    public static ArrayList<CambioEstado> getCambiosEstado() {
        return cambiosEstado;
    }

    public static ArrayList<Turno> getTurnos() {
        return turnos;
    }

    public static ArrayList<Estado> getEstados() {
        return estados;
    }

    public static ArrayList<CaracteristicaRecurso> getCaracteristicasRecurso() {
        return caracteristicasRecurso;
    }

    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public static ArrayList<AsignacionCientificoCI> getAsignacionesCientificoCI() {
        return asignacionesCientificoCI;
    }

    @PostConstruct
    public static void init(){
        crearCaracteristicas();
        crearTiposRecurso();
        crearCaracteristicasRecurso();
        crearModelos();
        crearMarcas();
        crearEstados();
        crearCambiosEstado();
        crearTurnos();
        crearUsuarios();
        crearPersonalCientifico();
        crearAsignacionesCientificosCI();
        crearRecursosTecnologicos();
        crearCentrosInvestigacion();
    }

    private static void crearCaracteristicas() {
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

    private static void crearTiposRecurso() {

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

    public static void crearModelos() {
        Modelo modelo1 = new Modelo("TXB312", null);
        Modelo modelo2 = new Modelo("TXB203", null);
        Modelo modelo3 = new Modelo("TXB465", null);
        Modelo modelo4 = new Modelo("MM001", null);
        Modelo modelo5 = new Modelo("MM302", null);
        Modelo modelo6 = new Modelo("MM789", null);
        Modelo modelo7 = new Modelo("PTA209", null);
        Modelo modelo8 = new Modelo("PTA421", null);
        Modelo modelo9 = new Modelo("PTA803", null);
        Modelo modelo10 = new Modelo("SLQ821", null);
        Modelo modelo11 = new Modelo("SLQ746", null);
        Modelo modelo12 = new Modelo("SLQ002", null);
        Modelo modelo13 = new Modelo("IPW491", null);
        Modelo modelo14 = new Modelo("IPW298", null);
        Modelo modelo15 = new Modelo("IPW991", null);

        modelos.add(modelo1);
        modelos.add(modelo2);
        modelos.add(modelo3);
        modelos.add(modelo4);
        modelos.add(modelo5);
        modelos.add(modelo6);
        modelos.add(modelo7);
        modelos.add(modelo8);
        modelos.add(modelo9);
        modelos.add(modelo10);
        modelos.add(modelo11);
        modelos.add(modelo12);
        modelos.add(modelo13);
        modelos.add(modelo14);
        modelos.add(modelo15);
    }

    public static void crearMarcas() {
        ArrayList<Modelo> modelosMarca1 = new ArrayList<>();
        ArrayList<Modelo> modelosMarca2 = new ArrayList<>();
        ArrayList<Modelo> modelosMarca3 = new ArrayList<>();
        ArrayList<Modelo> modelosMarca4 = new ArrayList<>();
        ArrayList<Modelo> modelosMarca5 = new ArrayList<>();

        modelosMarca1.add(modelos.get(0));
        modelosMarca1.add(modelos.get(1));
        modelosMarca1.add(modelos.get(5));

        Marca marca1 = new Marca("Mettler",null,modelosMarca1);

        modelosMarca2.add(modelos.get(3));
        modelosMarca2.add(modelos.get(4));
        modelosMarca2.add(modelos.get(9));

        Marca marca2 = new Marca("Baxtran",null,modelosMarca2);

        modelosMarca3.add(modelos.get(12));
        modelosMarca3.add(modelos.get(14));
        modelosMarca3.add(modelos.get(7));

        Marca marca3 = new Marca("Nikon",null,modelosMarca3);

        modelosMarca4.add(modelos.get(2));
        modelosMarca4.add(modelos.get(6));
        modelosMarca4.add(modelos.get(8));

        Marca marca4 = new Marca("Gram",null,modelosMarca4);

        modelosMarca5.add(modelos.get(10));
        modelosMarca5.add(modelos.get(11));
        modelosMarca5.add(modelos.get(13));

        Marca marca5 = new Marca("Fuzion",null,modelosMarca5);

        marcas.add(marca1);
        marcas.add(marca2);
        marcas.add(marca3);
        marcas.add(marca4);
        marcas.add(marca5);
    }

    public static void crearRecursosTecnologicos() {
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


        cambiosEstadoRecursoActivo.add(cambiosEstado.get(5));
        cambiosEstadoRecursoActivo.add(cambiosEstado.get(6));
        cambiosEstadoRecursoActivo.add(cambiosEstado.get(7));

        cambiosEstadoRecursoDeBaja.add(cambiosEstado.get(5));
        cambiosEstadoRecursoDeBaja.add(cambiosEstado.get(6));
        cambiosEstadoRecursoDeBaja.add(cambiosEstado.get(8));

        caracteristicasRecurso1.add(caracteristicasRecurso.get(10));
        caracteristicasRecurso1.add(caracteristicasRecurso.get(15));
        caracteristicasRecurso1.add(caracteristicasRecurso.get(0));
        caracteristicasRecurso1.add(caracteristicasRecurso.get(2));
        caracteristicasRecurso1.add(caracteristicasRecurso.get(4));
        caracteristicasRecurso1.add(caracteristicasRecurso.get(6));

        turnosRecurso1.add(turnos.get(0));
        turnosRecurso1.add(turnos.get(1));
        turnosRecurso1.add(turnos.get(5));
        turnosRecurso1.add(turnos.get(7));
        turnosRecurso1.add(turnos.get(12));

        RecursoTecnologico recurso1 = new RecursoTecnologico(39,null,tiposRecurso.get(0),
                caracteristicasRecurso1,null,null,null,
                cambiosEstadoRecursoDeBaja,null,null,modelos.get(0),turnosRecurso1,
                null, null);

        caracteristicasRecurso2.add(caracteristicasRecurso.get(11));
        caracteristicasRecurso2.add(caracteristicasRecurso.get(16));
        caracteristicasRecurso2.add(caracteristicasRecurso.get(1));
        caracteristicasRecurso2.add(caracteristicasRecurso.get(3));
        caracteristicasRecurso2.add(caracteristicasRecurso.get(5));
        caracteristicasRecurso2.add(caracteristicasRecurso.get(7));

        turnosRecurso2.add(turnos.get(0));
        turnosRecurso2.add(turnos.get(1));
        turnosRecurso2.add(turnos.get(3));
        turnosRecurso2.add(turnos.get(5));
        turnosRecurso2.add(turnos.get(14));

        RecursoTecnologico recurso2 = new RecursoTecnologico(14,null,tiposRecurso.get(0),
                caracteristicasRecurso2,null,null,null,
                cambiosEstadoRecursoActivo,null,null,modelos.get(1),turnosRecurso2,
                null, null);

        caracteristicasRecurso3.add(caracteristicasRecurso.get(12));
        caracteristicasRecurso3.add(caracteristicasRecurso.get(17));
        caracteristicasRecurso3.add(caracteristicasRecurso.get(0));
        caracteristicasRecurso3.add(caracteristicasRecurso.get(3));
        caracteristicasRecurso3.add(caracteristicasRecurso.get(4));
        caracteristicasRecurso3.add(caracteristicasRecurso.get(7));

        turnosRecurso3.add(turnos.get(0));
        turnosRecurso3.add(turnos.get(1));
        turnosRecurso3.add(turnos.get(7));
        turnosRecurso3.add(turnos.get(8));
        turnosRecurso3.add(turnos.get(11));

        RecursoTecnologico recurso3 = new RecursoTecnologico(2,null,tiposRecurso.get(0),
                caracteristicasRecurso3,null,null,null,
                cambiosEstadoRecursoActivo,null,null,modelos.get(2),turnosRecurso3,
                null, null);

        caracteristicasRecurso4.add(caracteristicasRecurso.get(13));
        caracteristicasRecurso4.add(caracteristicasRecurso.get(18));
        caracteristicasRecurso4.add(caracteristicasRecurso.get(20));
        caracteristicasRecurso4.add(caracteristicasRecurso.get(22));
        caracteristicasRecurso4.add(caracteristicasRecurso.get(24));
        caracteristicasRecurso4.add(caracteristicasRecurso.get(25));

        turnosRecurso4.add(turnos.get(0));
        turnosRecurso4.add(turnos.get(1));
        turnosRecurso4.add(turnos.get(2));
        turnosRecurso4.add(turnos.get(6));
        turnosRecurso4.add(turnos.get(9));

        RecursoTecnologico recurso4 = new RecursoTecnologico(98,null,tiposRecurso.get(1),
                caracteristicasRecurso4,null,null,null,
                cambiosEstadoRecursoActivo,null,null,modelos.get(3),turnosRecurso4,
                null, null);

        caracteristicasRecurso5.add(caracteristicasRecurso.get(13));
        caracteristicasRecurso5.add(caracteristicasRecurso.get(15));
        caracteristicasRecurso5.add(caracteristicasRecurso.get(21));
        caracteristicasRecurso5.add(caracteristicasRecurso.get(23));
        caracteristicasRecurso5.add(caracteristicasRecurso.get(24));
        caracteristicasRecurso5.add(caracteristicasRecurso.get(25));

        turnosRecurso5.add(turnos.get(0));
        turnosRecurso5.add(turnos.get(1));
        turnosRecurso5.add(turnos.get(7));
        turnosRecurso5.add(turnos.get(11));
        turnosRecurso5.add(turnos.get(12));

        RecursoTecnologico recurso5 = new RecursoTecnologico(46,null,tiposRecurso.get(1),
                caracteristicasRecurso5,null,null,null,
                cambiosEstadoRecursoActivo,null,null,modelos.get(4),turnosRecurso5,
                null, null);

        caracteristicasRecurso6.add(caracteristicasRecurso.get(13));
        caracteristicasRecurso6.add(caracteristicasRecurso.get(15));
        caracteristicasRecurso6.add(caracteristicasRecurso.get(20));
        caracteristicasRecurso6.add(caracteristicasRecurso.get(23));
        caracteristicasRecurso6.add(caracteristicasRecurso.get(24));
        caracteristicasRecurso6.add(caracteristicasRecurso.get(25));

        turnosRecurso6.add(turnos.get(0));
        turnosRecurso6.add(turnos.get(1));
        turnosRecurso6.add(turnos.get(3));
        turnosRecurso6.add(turnos.get(9));
        turnosRecurso6.add(turnos.get(10));

        RecursoTecnologico recurso6 = new RecursoTecnologico(77,null,tiposRecurso.get(1),
                caracteristicasRecurso6,null,null,null,
                cambiosEstadoRecursoDeBaja,null,null,modelos.get(5),turnosRecurso6,
                null, null);

        caracteristicasRecurso7.add(caracteristicasRecurso.get(12));
        caracteristicasRecurso7.add(caracteristicasRecurso.get(17));
        caracteristicasRecurso7.add(caracteristicasRecurso.get(26));
        caracteristicasRecurso7.add(caracteristicasRecurso.get(28));

        turnosRecurso7.add(turnos.get(0));
        turnosRecurso7.add(turnos.get(1));
        turnosRecurso7.add(turnos.get(2));
        turnosRecurso7.add(turnos.get(11));
        turnosRecurso7.add(turnos.get(14));

        RecursoTecnologico recurso7 = new RecursoTecnologico(84,null,tiposRecurso.get(2),
                caracteristicasRecurso7,null,null,null,
                cambiosEstadoRecursoActivo,null,null,modelos.get(6),turnosRecurso7,
                null, null);

        caracteristicasRecurso8.add(caracteristicasRecurso.get(13));
        caracteristicasRecurso8.add(caracteristicasRecurso.get(15));
        caracteristicasRecurso8.add(caracteristicasRecurso.get(27));
        caracteristicasRecurso8.add(caracteristicasRecurso.get(29));

        turnosRecurso8.add(turnos.get(0));
        turnosRecurso8.add(turnos.get(1));
        turnosRecurso8.add(turnos.get(6));
        turnosRecurso8.add(turnos.get(10));
        turnosRecurso8.add(turnos.get(12));

        RecursoTecnologico recurso8 = new RecursoTecnologico(33,null,tiposRecurso.get(2),
                caracteristicasRecurso8,null,null,null,
                cambiosEstadoRecursoDeBaja,null,null,modelos.get(7),turnosRecurso8,
                null, null);

        caracteristicasRecurso9.add(caracteristicasRecurso.get(11));
        caracteristicasRecurso9.add(caracteristicasRecurso.get(19));
        caracteristicasRecurso9.add(caracteristicasRecurso.get(26));
        caracteristicasRecurso9.add(caracteristicasRecurso.get(29));

        turnosRecurso9.add(turnos.get(0));
        turnosRecurso9.add(turnos.get(1));
        turnosRecurso9.add(turnos.get(4));
        turnosRecurso9.add(turnos.get(8));
        turnosRecurso9.add(turnos.get(11));

        RecursoTecnologico recurso9 = new RecursoTecnologico(5,null,tiposRecurso.get(2),
                caracteristicasRecurso9,null,null,null,
                cambiosEstadoRecursoActivo,null,null,modelos.get(8),turnosRecurso9,
                null, null);

        caracteristicasRecurso10.add(caracteristicasRecurso.get(13));
        caracteristicasRecurso10.add(caracteristicasRecurso.get(18));
        caracteristicasRecurso10.add(caracteristicasRecurso.get(0));
        caracteristicasRecurso10.add(caracteristicasRecurso.get(26));

        turnosRecurso10.add(turnos.get(0));
        turnosRecurso10.add(turnos.get(1));
        turnosRecurso10.add(turnos.get(5));
        turnosRecurso10.add(turnos.get(7));
        turnosRecurso10.add(turnos.get(13));

        RecursoTecnologico recurso10 = new RecursoTecnologico(19,null,tiposRecurso.get(3),
                caracteristicasRecurso10,null,null,null,
                cambiosEstadoRecursoActivo,null,null,modelos.get(9),turnosRecurso10,
                null, null);

        caracteristicasRecurso11.add(caracteristicasRecurso.get(11));
        caracteristicasRecurso11.add(caracteristicasRecurso.get(16));
        caracteristicasRecurso11.add(caracteristicasRecurso.get(1));
        caracteristicasRecurso11.add(caracteristicasRecurso.get(27));

        turnosRecurso11.add(turnos.get(0));
        turnosRecurso11.add(turnos.get(1));
        turnosRecurso11.add(turnos.get(3));
        turnosRecurso11.add(turnos.get(6));
        turnosRecurso11.add(turnos.get(11));

        RecursoTecnologico recurso11 = new RecursoTecnologico(39,null,tiposRecurso.get(3),
                caracteristicasRecurso11,null,null,null,
                cambiosEstadoRecursoActivo,null,null,modelos.get(10),turnosRecurso11,
                null, null);

        caracteristicasRecurso12.add(caracteristicasRecurso.get(14));
        caracteristicasRecurso12.add(caracteristicasRecurso.get(15));
        caracteristicasRecurso12.add(caracteristicasRecurso.get(0));
        caracteristicasRecurso12.add(caracteristicasRecurso.get(27));

        turnosRecurso12.add(turnos.get(0));
        turnosRecurso12.add(turnos.get(1));
        turnosRecurso12.add(turnos.get(5));
        turnosRecurso12.add(turnos.get(9));
        turnosRecurso12.add(turnos.get(14));

        RecursoTecnologico recurso12 = new RecursoTecnologico(2,null,tiposRecurso.get(3),
                caracteristicasRecurso12,null,null,null,
                cambiosEstadoRecursoDeBaja,null,null,modelos.get(11),turnosRecurso12,
                null, null);

        caracteristicasRecurso13.add(caracteristicasRecurso.get(12));
        caracteristicasRecurso13.add(caracteristicasRecurso.get(18));
        caracteristicasRecurso13.add(caracteristicasRecurso.get(6));
        caracteristicasRecurso13.add(caracteristicasRecurso.get(20));

        turnosRecurso13.add(turnos.get(0));
        turnosRecurso13.add(turnos.get(1));
        turnosRecurso13.add(turnos.get(3));
        turnosRecurso13.add(turnos.get(4));
        turnosRecurso13.add(turnos.get(12));

        RecursoTecnologico recurso13 = new RecursoTecnologico(94,null,tiposRecurso.get(4),
                caracteristicasRecurso13,null,null,null,
                cambiosEstadoRecursoActivo,null,null,modelos.get(12),turnosRecurso13,
                null, null);

        caracteristicasRecurso14.add(caracteristicasRecurso.get(11));
        caracteristicasRecurso14.add(caracteristicasRecurso.get(15));
        caracteristicasRecurso14.add(caracteristicasRecurso.get(7));
        caracteristicasRecurso14.add(caracteristicasRecurso.get(21));

        turnosRecurso14.add(turnos.get(0));
        turnosRecurso14.add(turnos.get(1));
        turnosRecurso14.add(turnos.get(2));
        turnosRecurso14.add(turnos.get(7));
        turnosRecurso14.add(turnos.get(11));

        RecursoTecnologico recurso14 = new RecursoTecnologico(94,null,tiposRecurso.get(4),
                caracteristicasRecurso14,null,null,null,
                cambiosEstadoRecursoDeBaja,null,null,modelos.get(13),turnosRecurso14,
                null, null);

        caracteristicasRecurso14.add(caracteristicasRecurso.get(10));
        caracteristicasRecurso14.add(caracteristicasRecurso.get(19));
        caracteristicasRecurso14.add(caracteristicasRecurso.get(6));
        caracteristicasRecurso14.add(caracteristicasRecurso.get(21));

        turnosRecurso15.add(turnos.get(0));
        turnosRecurso15.add(turnos.get(1));
        turnosRecurso15.add(turnos.get(4));
        turnosRecurso15.add(turnos.get(5));
        turnosRecurso15.add(turnos.get(6));

        RecursoTecnologico recurso15 = new RecursoTecnologico(94,null,tiposRecurso.get(4),
                caracteristicasRecurso15,null,null,null,
                cambiosEstadoRecursoActivo,null,null,modelos.get(14),turnosRecurso15,
                null, null);

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

    public static void crearPersonalCientifico() {
        PersonalCientifico cientifico1 = new PersonalCientifico(2901, "Pedro", "Sanchez",
                "20948277", null, null, null,usuarios.get(0));

        PersonalCientifico cientifico2 = new PersonalCientifico(2923, "Maria", "Tretta",
                "24248567", null, null, null,usuarios.get(1));

        PersonalCientifico cientifico3 = new PersonalCientifico(2832, "Gabriel", "Lazcano",
                "23229098", null, null, null,usuarios.get(2));

        PersonalCientifico cientifico4 = new PersonalCientifico(2143, "Carlos", "Ruiz",
                "27525878", null, null, null,usuarios.get(3));

        PersonalCientifico cientifico5 = new PersonalCientifico(3001, "Andrea", "Reynoso",
                "19610500", null, null, null,usuarios.get(4));

        PersonalCientifico cientifico6 = new PersonalCientifico(2789, "Tomas", "Diaz",
                "21404747", null, null, null,usuarios.get(5));

        cientificos.add(cientifico1);
        cientificos.add(cientifico2);
        cientificos.add(cientifico3);
        cientificos.add(cientifico4);
        cientificos.add(cientifico5);
        cientificos.add(cientifico6);

    }

    public static void crearAsignacionesCientificosCI() {
        Date fechaDesde1 = new Date(2022,01,23);

        AsignacionCientificoCI asignacion1 = new AsignacionCientificoCI(cientificos.get(0), null, fechaDesde1,
                null, null);

        Date fechaDesde2 = new Date(2022,01,23);

        AsignacionCientificoCI asignacion2 = new AsignacionCientificoCI(cientificos.get(1), null, fechaDesde2,
                null, null);

        Date fechaDesde3 = new Date(2022,01,23);

        AsignacionCientificoCI asignacion3 = new AsignacionCientificoCI(cientificos.get(2), null, fechaDesde3,
                null, null);

        Date fechaDesde4 = new Date(2022,01,23);

        AsignacionCientificoCI asignacion4 = new AsignacionCientificoCI(cientificos.get(3), null, fechaDesde4,
                null, null);

        Date fechaDesde5 = new Date(2022,01,23);

        AsignacionCientificoCI asignacion5 = new AsignacionCientificoCI(cientificos.get(4), null, fechaDesde5,
                null, null);

        Date fechaDesde6 = new Date(2022,01,23);

        AsignacionCientificoCI asignacion6 = new AsignacionCientificoCI(cientificos.get(5), null, fechaDesde6,
                null, null);

        asignacionesCientificoCI.add(asignacion1);
        asignacionesCientificoCI.add(asignacion2);
        asignacionesCientificoCI.add(asignacion3);
        asignacionesCientificoCI.add(asignacion4);
        asignacionesCientificoCI.add(asignacion5);
        asignacionesCientificoCI.add(asignacion6);
    }

    public static void crearUsuarios(){

        Usuario usuario1 = new Usuario(null, null, "psanchez");
        Usuario usuario2 = new Usuario(null, null, "mtretta");
        Usuario usuario3 = new Usuario(null, null, "glazcano");
        Usuario usuario4 = new Usuario(null, null, "cruiz");
        Usuario usuario5 = new Usuario(null, null, "areynoso");
        Usuario usuario6 = new Usuario(null, null, "tdiaz");

        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        usuarios.add(usuario4);
        usuarios.add(usuario5);
        usuarios.add(usuario6);
    }

    public static void crearCentrosInvestigacion() {
        ArrayList<RecursoTecnologico> recursosCentro1 = new ArrayList<>();
        ArrayList<RecursoTecnologico> recursosCentro2 = new ArrayList<>();
        ArrayList<RecursoTecnologico> recursosCentro3 = new ArrayList<>();
        ArrayList<RecursoTecnologico> recursosCentro4 = new ArrayList<>();

        Date fechaDesde1 = new Date(2022,01,23);

        recursosCentro1.add(recursosTecnologicos.get(0));
        recursosCentro1.add(recursosTecnologicos.get(3));
        recursosCentro1.add(recursosTecnologicos.get(6));
        recursosCentro1.add(recursosTecnologicos.get(9));
        recursosCentro1.add(recursosTecnologicos.get(12));

        ArrayList<AsignacionCientificoCI> asignacionesCentro1 = new ArrayList<>();
        asignacionesCentro1.add(asignacionesCientificoCI.get(0));
        asignacionesCentro1.add(asignacionesCientificoCI.get(1));

        CentroInvestigacion centro1 = new CentroInvestigacion("Estructura","EST", null,
                null, null, null, null, fechaDesde1,
                null, null, null, recursosCentro1, null, null,
                null, null, null, null, asignacionesCentro1);

        Date fechaDesde2 = new Date(2022,01,23);

        recursosCentro2.add(recursosTecnologicos.get(1));
        recursosCentro2.add(recursosTecnologicos.get(4));
        recursosCentro2.add(recursosTecnologicos.get(7));
        recursosCentro2.add(recursosTecnologicos.get(10));
        recursosCentro2.add(recursosTecnologicos.get(13));

        ArrayList<AsignacionCientificoCI> asignacionesCentro2 = new ArrayList<>();
        asignacionesCentro2.add(asignacionesCientificoCI.get(2));
        asignacionesCentro2.add(asignacionesCientificoCI.get(3));

        CentroInvestigacion centro2 = new CentroInvestigacion("Quimica","QUI", null,
                null, null, null, null, fechaDesde2,
                null, null, null, recursosCentro2, null, null,
                null, null, null, null, asignacionesCentro2);

        Date fechaDesde3 = new Date(2022,01,23);

        recursosCentro3.add(recursosTecnologicos.get(2));
        recursosCentro3.add(recursosTecnologicos.get(5));
        recursosCentro3.add(recursosTecnologicos.get(8));
        recursosCentro3.add(recursosTecnologicos.get(11));
        recursosCentro3.add(recursosTecnologicos.get(14));

        ArrayList<AsignacionCientificoCI> asignacionesCentro3 = new ArrayList<>();
        asignacionesCentro3.add(asignacionesCientificoCI.get(4));
        asignacionesCentro3.add(asignacionesCientificoCI.get(5));

        CentroInvestigacion centro3 = new CentroInvestigacion("Fisica","FIS", null,
                null, null, null, null, fechaDesde3,
                null, null, null, recursosCentro3, null, null,
                null, null, null, null, asignacionesCentro3);

        Date fechaDesde4 = new Date(2022,01,23);
        Date fechaBaja4 = new Date(2022,02,23);

        recursosCentro4.add(recursosTecnologicos.get(1));
        recursosCentro4.add(recursosTecnologicos.get(3));
        recursosCentro4.add(recursosTecnologicos.get(7));
        recursosCentro4.add(recursosTecnologicos.get(11));
        recursosCentro4.add(recursosTecnologicos.get(13));

        ArrayList<AsignacionCientificoCI> asignacionesCentro4 = new ArrayList<>();
        asignacionesCentro4.add(asignacionesCientificoCI.get(1));
        asignacionesCentro4.add(asignacionesCientificoCI.get(4));

        CentroInvestigacion centro4 = new CentroInvestigacion("Demografia","DEM", null,
                null, null, null, null, fechaDesde4,
                null, fechaBaja4, "Incendio", recursosCentro4, null, null,
                null, null, null, null, asignacionesCentro4);

        centrosInvestigacion.add(centro1);
        centrosInvestigacion.add(centro2);
        centrosInvestigacion.add(centro3);
        centrosInvestigacion.add(centro4);
    }

    public static void crearCambiosEstado(){
        // Cambios de estado para turnos
        Date fechaDesde1 = new Date(2022,01,23,9,00);
        Date fechaHasta1 = new Date(2022,01,23,12,00);
        CambioEstado cambioEstado1 = new CambioEstado(fechaDesde1, fechaHasta1, estados.get(0));
        Date fechaDesde2 = new Date(2022,01,25,11,00);
        Date fechaHasta2 = new Date(2022,01,25,12,00);
        CambioEstado cambioEstado2 = new CambioEstado(fechaDesde2, fechaHasta2, estados.get(2));
        Date fechaDesde3 = new Date(2022,02,2,18,00);
        Date fechaHasta3 = new Date(2022,02,2,20,30);
        CambioEstado cambioEstado3 = new CambioEstado(fechaDesde3, fechaHasta3, estados.get(5));
        Date fechaDesde4 = new Date(2022,02,5,17,00);
        CambioEstado cambioEstado4 = new CambioEstado(fechaDesde4, null, estados.get(6));
        Date fechaDesde5 = new Date(2022,03,2,8,00);
        CambioEstado cambioEstado5 = new CambioEstado(fechaDesde5, null, estados.get(0));

        // Cambios de estado para recursos
        Date fechaDesde6 = new Date(2022,01,23,9,00);
        Date fechaHasta6 = new Date(2022,01,23,12,00);
        CambioEstado cambioEstado6 = new CambioEstado(fechaDesde6, fechaHasta6, estados.get(8));
        Date fechaDesde7 = new Date(2022,01,25,11,00);
        Date fechaHasta7 = new Date(2022,01,25,12,00);
        CambioEstado cambioEstado7 = new CambioEstado(fechaDesde7, fechaHasta7, estados.get(9));
        Date fechaDesde8 = new Date(2022,02,2,18,00);
        CambioEstado cambioEstado8 = new CambioEstado(fechaDesde8, null, estados.get(8));
        Date fechaDesde9 = new Date(2022,02,2,18,00);
        CambioEstado cambioEstado9 = new CambioEstado(fechaDesde9, null, estados.get(9));

        cambiosEstado.add(cambioEstado1);
        cambiosEstado.add(cambioEstado2);
        cambiosEstado.add(cambioEstado3);
        cambiosEstado.add(cambioEstado4);
        cambiosEstado.add(cambioEstado5);
        cambiosEstado.add(cambioEstado6);
        cambiosEstado.add(cambioEstado7);
        cambiosEstado.add(cambioEstado8);
        cambiosEstado.add(cambioEstado9);
    }

    public static void crearEstados() {
        Estado estado1 = new Estado("Disponible", "Turno");
        Estado estado2 = new Estado("Anulado", "Turno");
        Estado estado3 = new Estado("PendienteDeConfirmacion", "Turno");
        Estado estado4 = new Estado("CanceladoPorMant", "Turno");
        Estado estado5 = new Estado("ConReservaConfirmado", "Turno");
        Estado estado6 = new Estado("EnUso", "Turno");
        Estado estado7 = new Estado("Finalizado", "Turno");
        Estado estado8 = new Estado("AnuladoNoEjecutado", "Turno");
        Estado estado9 = new Estado("Activo", "RecursoTecnologico");
        Estado estado10 = new Estado("DeBaja", "RecursoTecnologico");

        estados.add(estado1);
        estados.add(estado2);
        estados.add(estado3);
        estados.add(estado4);
        estados.add(estado5);
        estados.add(estado6);
        estados.add(estado7);
        estados.add(estado8);
        estados.add(estado9);
        estados.add(estado10);
    }

    public static void crearTurnos() {
        // Turno finalizado
        ArrayList<CambioEstado> cambiosEstadoFinalizado = new ArrayList<>();
        cambiosEstadoFinalizado.add(cambiosEstado.get(0));
        cambiosEstadoFinalizado.add(cambiosEstado.get(1));
        cambiosEstadoFinalizado.add(cambiosEstado.get(2));
        cambiosEstadoFinalizado.add(cambiosEstado.get(3));

        ArrayList<CambioEstado> cambiosEstadoDisponible = new ArrayList<>();
        cambiosEstadoDisponible.add(cambiosEstado.get(0));
        cambiosEstadoDisponible.add(cambiosEstado.get(1));
        cambiosEstadoDisponible.add(cambiosEstado.get(2));
        cambiosEstadoDisponible.add(cambiosEstado.get(4));

        // Turno finalizado
        Date fechaDesde1 = new Date(2022,03,23,9,00);
        Date fechaHasta1 = new Date(2022,03,23,12,00);

        Turno turno1 = new Turno(cambiosEstadoFinalizado, null, null, fechaDesde1, fechaHasta1,
                null, null, null);

        // Turno finalizado
        Date fechaDesde2 = new Date(2022,04,2,12,00);
        Date fechaHasta2 = new Date(2022,04,2,14,30);

        Turno turno2 = new Turno(cambiosEstadoFinalizado, null, null, fechaDesde2, fechaHasta2,
                null, null, null);

        // Turno disponible
        Date fechaDesde3 = new Date(2022,04,3,8,00);
        Date fechaHasta3 = new Date(2022,04,3,9,30);

        Turno turno3 = new Turno(cambiosEstadoDisponible, null, null, fechaDesde3, fechaHasta3,
                null, null, null);

        // Turno disponible
        Date fechaDesde4 = new Date(2022,05,7,18,30);
        Date fechaHasta4 = new Date(2022,05,7,20,00);

        Turno turno4 = new Turno(cambiosEstadoDisponible, null, null, fechaDesde4, fechaHasta4,
                null, null, null);

        // Turno disponible
        Date fechaDesde5 = new Date(2022,05,10,11,00);
        Date fechaHasta5 = new Date(2022,05,10,14,00);

        Turno turno5 = new Turno(cambiosEstadoDisponible, null, null, fechaDesde5, fechaHasta5,
                null, null, null);

        // Turno disponible
        Date fechaDesde6 = new Date(2022,06,2,13,45);
        Date fechaHasta6 = new Date(2022,06,2,17,00);

        Turno turno6 = new Turno(cambiosEstadoDisponible, null, null, fechaDesde6, fechaHasta6,
                null, null, null);

        // Turno disponible
        Date fechaDesde7 = new Date(2022,06,9,7,30);
        Date fechaHasta7 = new Date(2022,06,9,11,00);

        Turno turno7 = new Turno(cambiosEstadoDisponible, null, null, fechaDesde7, fechaHasta7,
                null, null, null);

        // Turno disponible
        Date fechaDesde8 = new Date(2022,06,16,17,00);
        Date fechaHasta8 = new Date(2022,06,16,19,00);

        Turno turno8 = new Turno(cambiosEstadoDisponible, null, null, fechaDesde8, fechaHasta8,
                null, null, null);

        //Turno disponible

        Date fechaDesde9 = new Date(2022,06,22,13,00);
        Date fechaHasta9 = new Date(2022,06,22,18,00);

        Turno turno9 = new Turno(cambiosEstadoDisponible, null, null, fechaDesde9, fechaHasta9,
                null, null, null);

        //Turno disponible

        Date fechaDesde10 = new Date(2022,06,27,20,00);
        Date fechaHasta10 = new Date(2022,06,27,21,30);

        Turno turno10 = new Turno(cambiosEstadoDisponible, null, null, fechaDesde10, fechaHasta10,
                null, null, null);

        //Turno disponible

        Date fechaDesde11 = new Date(2022,06,30,17,30);
        Date fechaHasta11 = new Date(2022,06,30,19,00);

        Turno turno11 = new Turno(cambiosEstadoDisponible, null, null, fechaDesde11, fechaHasta11,
                null, null, null);

        //Turno disponible

        Date fechaDesde12 = new Date(2022,07,10,11,45);
        Date fechaHasta12 = new Date(2022,07,10,14,00);

        Turno turno12 = new Turno(cambiosEstadoDisponible, null, null, fechaDesde12, fechaHasta12,
                null, null, null);

        //Turno disponible

        Date fechaDesde13 = new Date(2022,07,13,10,00);
        Date fechaHasta13 = new Date(2022,07,13,12,00);

        Turno turno13 = new Turno(cambiosEstadoDisponible, null, null, fechaDesde13, fechaHasta13,
                null, null, null);

        //Turno disponible

        Date fechaDesde14 = new Date(2022,07,21,20,00);
        Date fechaHasta14 = new Date(2022,07,21,21,30);

        Turno turno14 = new Turno(cambiosEstadoDisponible, null, null, fechaDesde14, fechaHasta14,
                null, null, null);

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

    private static void crearCaracteristicasRecurso(){
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
}
