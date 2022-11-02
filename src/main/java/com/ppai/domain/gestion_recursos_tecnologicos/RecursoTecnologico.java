package com.ppai.domain.gestion_recursos_tecnologicos;

import com.ppai.domain.gestion_cientificos.cientifico.PersonalCientifico;
import com.ppai.domain.gestion_mantenimiento.MantenimientoCorrectivo;
import com.ppai.domain.gestion_mantenimiento.MantenimientoPreventivo;
import com.ppai.domain.gestion_recursos_tecnologicos.estados.CambioEstadoRecurso;
import com.ppai.domain.gestion_turnos.Turno;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

@Data
@AllArgsConstructor
public class RecursoTecnologico {
    private int nroInventario;
    private Date fechaAlta;
    private TipoRecurso tipo;
    private ArrayList<CaracteristicaRecurso> caracteristicas;
    private List<String> imagenes;
    private Disponibilidad disponibilidad;
    private PersonalCientifico responsableTecnico;
    private ArrayList<CambioEstadoRecurso> estado;
    private MantenimientoPreventivo mantPreventivos;
    private MantenimientoCorrectivo mantCorrectivos;
    private Modelo modelo;
    private ArrayList<Turno> turno;
    private String periodicidadMp;
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

    /**
     * Responde si el Recurso tecnológico es de un modelo y una marca especificos.
     * @param modeloI Modelo a chequear.
     * @param marcaI Marca a chequear.
     * @return boolean true; si el recurso es del modelo y marca ingresados por parámetro.
     */
    public boolean esMiModeloYMarca(String modeloI, String marcaI) {
        boolean esModelo = Objects.equals(this.modelo.mostrarNombre(), modeloI);
        String marcaRecurso =  this.modelo.mostrarMarca();
        boolean esMarca = Objects.equals(marcaRecurso, marcaI);
        boolean retorno = esModelo && esMarca;
        return retorno;
    }

    /**
     * Responde si el recurso es de cierto tipo.
     * @param nombreTipo Tipo del que queremos saber si el recurso pertenece.
     * @return true si el recurso es de ese tipo.
     */
    public boolean esDeTipo(String nombreTipo) {
        return this.tipo.mostrarCategoria().equals(nombreTipo);
    }

    /**
     * Muestra el modelo y la marca del recurso.
     * @return string con el modelo y la marca.
     */
    public ArrayList<String> mostrarModeloYMarca() {
        String modelo = this.modelo.mostrarNombre();
        String marca = this.modelo.mostrarMarca();
        ArrayList<String> modeloYMarca = new ArrayList<>();
        modeloYMarca.add(modelo);
        modeloYMarca.add(marca);
        return modeloYMarca;
    }

    /**
     * Retorna el número de inventario.
     * @return String con el numero del inventario.
     */
    public String mostrarNumeroRT() {
        return Integer.toString(this.nroInventario);
    }

    /**
     * Muestra el estaqdo actual del recurso.
     * @return Nombre del estado actual en que se encuentra el recurso.
     */
    public String mostrarEstado() {
        String estadoActual = null;
        for (CambioEstadoRecurso e: estado) {
            if (e.esActual()) {
                estadoActual = e.mostrarEstado();
            }
        }
        return estadoActual;
    }

    /**
     * Responde si el recurso esta disponible para ser reservado.
     * Que este reservado quiere decir que no esta en baja tecnica o definitiva
     * @return true; si esta disponible.
     */
    public boolean estaAptoReserva() {
        AtomicBoolean aptoReserva = new AtomicBoolean(false);
        this.estado.forEach(cambioEstadoRecurso -> {
            if (cambioEstadoRecurso.esActual()) {
                if (!(cambioEstadoRecurso.esBajaTecnica() || cambioEstadoRecurso.esBajaDefinitiva())) aptoReserva.set(true);
            }
        });
        return aptoReserva.get();
    }

    /**
     * Muestra todos los turnos disponibles para el recurso.
     * @return array con un string de turnos.
     */
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