package com.ppai.domain;

import com.ppai.domain.state.Estado;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CAMBIOS_ESTADO")
public class CambioEstado {
    @Id
    @Column(name = "ID_CAMBIO_ESTADO")
    private Long id;

    @Column(name = "FECHA_HORA_DESDE")
    private Date fechaHoraDesde;

    @Column(name = "FECHA_HORA_HASTA")
    private Date fechaHoraHasta;

    @OneToOne
    private Estado estado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ID_TURNO")
    @ToString.Exclude
    private Turno turno;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ID_RECURSO_TECNOLOGICO")
    @ToString.Exclude
    private RecursoTecnologico recursoTecnologico;

    public CambioEstado(Date fechaHoraDesde, Date fechaHoraHasta, Estado estado) {
        this.fechaHoraDesde = fechaHoraDesde;
        this.fechaHoraHasta = fechaHoraHasta;
        this.estado = estado;
    }

    public String mostrarEstado() {
        return this.estado.mostrar();
    }

    public boolean esActual() {
        return fechaHoraHasta == null;
    }

    public void finalizar() {
        this.fechaHoraHasta = new Date();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CambioEstado that = (CambioEstado) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}