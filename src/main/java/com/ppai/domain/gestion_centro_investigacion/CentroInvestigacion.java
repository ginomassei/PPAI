package com.ppai.domain.gestion_centro_investigacion;

import com.ppai.domain.gestion_cientificos.cientifico.PersonalCientifico;
import com.ppai.domain.gestion_cientificos.asignaciones.AsignacionCientificoCI;
import com.ppai.domain.gestion_cientificos.asignaciones.AsignacionDirector;
import com.ppai.domain.gestion_recursos_tecnologicos.RecursoTecnologico;
import com.ppai.domain.gestion_turnos.estados.EstadoTurno;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

@Data
@AllArgsConstructor
public class CentroInvestigacion {
    private String nombre;
    private String sigla;
    private Direccion direccion;
    private Telefono telefonos;
    private String correoElectronico;
    private PersonalCientifico director;
    private Integer tiempoPrevioReserva;
    private Date fechaInicio;
    private EstadoTurno estado;
    private Date fechaBaja;
    private String motivoBaja;
    private ArrayList<RecursoTecnologico> recursos;
    private Integer numeroResolucion;
    private Date fechaResolucion;
    private String reglamento;
    private Date fechaAlta;
    private String caracteristicas;
    private AsignacionDirector direc;
    private ArrayList<AsignacionCientificoCI> asignacionCientificoCIS;

    public void darDeBaja() {
        // TODO implement here
    }

    public ArrayList<RecursoTecnologico> listarRecursosTecnologicos() {
        return this.recursos;
    }

    public void listarPersonal() {
        // TODO implement here
    }

    public void agregarPersonal() {
        // TODO implement here
    }

    public void mostrarPersonal() {
        // TODO implement here
    }

    /**
     * Método responsable de responder si el centro tecnológico esta de baja.
     * Lo hace identificando si existe o no la fecha de baja para el centro.
     * @return true, si el centro se encuentra dado de baja.
     */
    public boolean estaDeBaja() {
        if (this.fechaBaja == null) {
            return false;
        } else return new Date().before(this.fechaBaja);
    }

    /**
     * Lista los recursos tecnológicos asociados al centro dado un tipo de recurso que ingresamos por parámetro.
     * @param tiposRecursos array de string con los nombres de los tipos de los recursos
     * @return una lista de recursos, con modelo, marca, nro de inventario y estado del recurso.
     */
    public ArrayList<ArrayList<String>> listarRecursosTecnologicosPorTipo(ArrayList<String> tiposRecursos) {
        ArrayList<ArrayList<String>> recursosEncontrados = new ArrayList<>();

        tiposRecursos.forEach(tipo -> {
            this.recursos.forEach( rt -> {
                if (rt.esDeTipo(tipo) && rt.estaAptoReserva()) {
                    ArrayList<String> modeloYMarca = rt.mostrarModeloYMarca();
                    String nroInventario = rt.mostrarNumeroRT();
                    String estado = rt.mostrarEstado();

                    recursosEncontrados.add(new ArrayList<>(
                        List.of(modeloYMarca.get(0), modeloYMarca.get(1), nroInventario, estado)
                    ));
                }
            });
        });
        return recursosEncontrados;
    }

    /**
     * Dice si el cientifico ingresado por parámetro pertenece al centro tecnológico.
     * @param cientifico Personal cientifico
     * @return true si el cientifico pertenece al centro.
     */
    public boolean esTuCientifico(PersonalCientifico cientifico) {
        AtomicBoolean esTuCientifico = new AtomicBoolean(false);
        this.asignacionCientificoCIS.forEach(asignacionCientificoCI -> {
            if (asignacionCientificoCI.esTuCientifico(cientifico) && asignacionCientificoCI.esCientificoActivo()) {
                esTuCientifico.set(true);
            }
        });
        return esTuCientifico.get();
    }

    /**
     * Para chequear si un nombre es el nombre del centro.
     * @param nombre nombre de un centro tecnológico
     * @return true, si el nombre ingresado es igual al nombre del centro.
     */
    public boolean esTuNombre(String nombre) {
        return this.nombre.equals(nombre);
    }
}