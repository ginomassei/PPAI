package com.ppai.domain.state;

import com.ppai.domain.CambioEstado;
import com.ppai.domain.Turno;
import org.jboss.resteasy.reactive.common.NotImplementedYet;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "ESTADOS")
public abstract class Estado {

    @Id
    @Column(name = "ID_ESTADO")
    private Long id;

    @Column(name = "NOMBRE")
    private String nombre;

    public Estado() {}

    public abstract void crearEstadoSiguiente(Turno turno);

    public void reservarTurno(Date fechaHoraActual, Turno turno) {
        throw new NotImplementedYet();
    }

    public void finalizarUltimoCambioDeEstado(Turno turno) {
        List<CambioEstado> cambiosEstado = turno.getCambiosEstado();
        for (CambioEstado cambioEstado : cambiosEstado) {
            if (cambioEstado.esActual()) {
                cambioEstado.finalizar();
            }
        }
    }

    public void crearNuevoCambioEstado(Date fechaHoraDesde, Turno turno) {
        CambioEstado cambioEstado = new CambioEstado(fechaHoraDesde, null, turno.getEstado());
        turno.vincularNuevoCambioEstado(cambioEstado);
    }

    public String mostrar() {
        return this.nombre;
    }

    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}