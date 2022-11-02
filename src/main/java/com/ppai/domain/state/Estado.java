package com.ppai.domain.state;

import com.ppai.domain.CambioEstado;
import com.ppai.domain.Turno;
import lombok.Data;
import org.jboss.resteasy.reactive.common.NotImplementedYet;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "ESTADOS")
public abstract class Estado {

    @Id
    @Column(name = "ID_ESTADO")
    private Long id;

    @Column(name = "NOMBRE")
    private String nombre;

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
        CambioEstado cambioEstado = new CambioEstado();
        cambioEstado.setFechaHoraDesde(fechaHoraDesde);
        cambioEstado.setEstado(turno.getEstado());
        turno.vincularNuevoCambioEstado(cambioEstado);
    }

    public String mostrar() {
        return this.nombre;
    }
}
