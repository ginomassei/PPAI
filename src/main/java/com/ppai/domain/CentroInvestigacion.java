package com.ppai.domain;

import com.ppai.domain.state.Estado;

import java.util.*;
import lombok.Data;

import javax.persistence.*;
import java.util.concurrent.atomic.AtomicBoolean;

@Data
@Entity
@Table(name = "CENTROS_INVESTIGACION")
public class CentroInvestigacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_CENTRO_INVESTIGACION", nullable = false)
    private Long id;

    private String nombre;
    private String sigla;

    @OneToOne
    private Direccion direccion;

    @OneToOne
    private Telefono telefonos;

    private String correoElectronico;

    @ManyToOne
    private PersonalCientifico director;

    private Integer tiempoPrevioReserva;

    private Date fechaInicio;

    @ManyToOne
    private Estado estado;

    private Date fechaBaja;

    private String motivoBaja;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_RECURSO_TECNOLOGICO")
    private List<RecursoTecnologico> recursos;

    private Integer numeroResolucion;
    private Date fechaResolucion;
    private String reglamento;
    private Date fechaAlta;
    private String caracteristicas;

    @OneToOne
    private AsignacionDirector direc;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_ASIGNACION_CIENTIFICO")
    private List<AsignacionCientificoCI> asignacionCientificoCIS;

    public void darDeBaja() {
        // TODO implement here
    }

    public List<RecursoTecnologico> listarRecursosTecnológicos() {
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

    public boolean estaDeBaja() {
        if (this.fechaBaja == null) {
            return false;
        } else return new Date().before(this.fechaBaja);
    }

    public ArrayList<ArrayList<String>> listarRecursosTecnologicosPorTipo(ArrayList<String> tiposRecursos) {
        ArrayList<ArrayList<String>> recursosEncontrados = new ArrayList<>();

        tiposRecursos.forEach(tipo -> {
            this.recursos.forEach( rt -> {
                if (rt.esDeTipo(tipo) & rt.estaAptoReserva()) {
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

    public boolean esTuCientifico(PersonalCientifico cientifico) {
        AtomicBoolean esTuCientifico = new AtomicBoolean(false);
        this.asignacionCientificoCIS.forEach(asignacionCientificoCI -> {
            if (asignacionCientificoCI.esTuCientifico(cientifico) && asignacionCientificoCI.esCientificoActivo()) {
                esTuCientifico.set(true);
            }
        });
        return esTuCientifico.get();
    }

    public boolean esTuNombre(String nombre) {
        return this.nombre.equals(nombre);
    }
}