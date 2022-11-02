package com.ppai.domain;

import lombok.Data;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

@Data
@Entity
@Table(name = "RECURSOS_TECNOLOGICOS")
public class RecursoTecnologico {
    @Id
    @Column(name = "ID_RECURSO_TECNOLOGICO")
    private Long id;

    @Column(name = "NRO_INVENTARIO")
    private int nroInventario;

    @Column(name = "FECHA_ALTA")
    private Date fechaAlta;

    @OneToOne
    private TipoRecurso tipo;

    @OneToMany(mappedBy = "recursoTecnologico", cascade = CascadeType.ALL, targetEntity = CaracteristicaRecurso.class)
    private List<CaracteristicaRecurso> caracteristicas;

    @OneToOne
    private Disponibilidad disponibilidad;

    @OneToOne
    private PersonalCientifico responsableTecnico;

    @OneToMany(mappedBy = "recursoTecnologico", cascade = CascadeType.ALL, targetEntity = CambioEstado.class)
    private List<CambioEstado> estado;

    @OneToOne
    private MantenimientoPreventivo mantPreventivos;

    @OneToOne
    private MantenimientoCorrectivo mantCorrectivos;

    @ManyToOne()
    @JoinColumn(name = "ID_MODELO")
    private Modelo modelo;

    @OneToMany(mappedBy = "recursoTecnologico", cascade = CascadeType.ALL, targetEntity = Turno.class)
    private List<Turno> turno;

    @Column(name = "PERIODICIDAD_MANTENIMIENTO_PREVENTIVO")
    private String periodicidadMp;

    @Column(name = "DURACION_MANTENIMIENTO_PREVENTIVO")
    private String duracionMp;

    public void mostrarRecurso() {
        // TODO implement here
    }

    public void cancelarTurnoMantenimiento() {
        // TODO implement here
    }

    public void mostrarCaracXTipoRecurso() {
        // TODO implement here
    }

    public void actualizarDisponibilidad() {
        // TODO implement here
    }

    public void darDeBaja() {
        // TODO implement here
    }

    public void esTipo() {
        // TODO implement here
    }

    public boolean esMiModeloYMarca(String modeloI, String marcaI) {
        boolean esModelo = Objects.equals(this.modelo.mostrarNombre(), modeloI);
        String marcaRecurso =  this.modelo.mostrarMarca();
        boolean esMarca = Objects.equals(marcaRecurso, marcaI);
        boolean retorno = esModelo && esMarca;
        return retorno;
    }

    public boolean esDeTipo(String nombreTipo) {
        return this.tipo.mostrarCategoria().equals(nombreTipo);
    }

    public ArrayList<String> mostrarModeloYMarca() {
        String modelo = this.modelo.mostrarNombre();
        String marca = this.modelo.mostrarMarca();
        ArrayList<String> modeloYMarca = new ArrayList<>();
        modeloYMarca.add(modelo);
        modeloYMarca.add(marca);
        return modeloYMarca;
    }

    public String mostrarNumeroRT() {
        return Integer.toString(this.nroInventario);
    }

    public String mostrarEstado() {
        String estadoActual = null;
        for (CambioEstado e: estado) {
            if (e.esActual()) {
                estadoActual = e.mostrarEstado();
            }
        }
        return estadoActual;
    }

    public boolean estaAptoReserva() {
        AtomicBoolean aptoReserva = new AtomicBoolean(false);
//        this.estado.forEach(cambioEstado -> {
//            if (cambioEstado.esActual()) {
//                if (!(cambioEstado.esBajaTecnica() || cambioEstado.esBajaDefinitiva())) aptoReserva.set(true);
//            }
//        });
        return aptoReserva.get();
    }

    public ArrayList<String[]> mostrarTurnosFuturos() {
        ArrayList<String[]> turnosFuturos = new ArrayList<>();
        for (Turno t: turno) {
            Date fechaActual = new Date();
            if (t.esPosteriorA(fechaActual) && t.esActivo()) {
                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

                // Convert Date to Calendar
                Calendar c1 = Calendar.getInstance();
                Calendar c2 = Calendar.getInstance();

                c1.setTime(t.getFechaHoraDesde());
                c2.setTime(t.getFechaHoraHasta());
                // Perform addition/subtraction
                c1.add(Calendar.YEAR, -1900);
                c2.add(Calendar.YEAR, -1900);

                // Convert calendar back to Date
                Date fechaHoraDesde = c1.getTime();
                Date fechaHoraHasta = c2.getTime();

                String[] newTurno = {formatter.format(fechaHoraDesde), formatter.format(fechaHoraHasta),t.mostrarId()};
                turnosFuturos.add(newTurno);
            }
        }
        return turnosFuturos;
    }
}
