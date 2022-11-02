package com.ppai.domain;

import com.ppai.domain.state.Estado;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

@Data
@Entity
@Table(name = "TURNOS")
public class Turno {
    @Id
    @Column(name = "ID_TURNO")
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_CAMBIO_ESTADO")
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ID_RECURSO_TECNOLOGICO")
    @ToString.Exclude
    private RecursoTecnologico recursoTecnologico;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ASIGNACION_CIENTIFICO")
    @ToString.Exclude
    private AsignacionCientificoCI asignacionCientificoCI;

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
}
