package com.ppai.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.*;

@Data
@Entity
@Table(name = "MANTENIMIENTOS_PREVENTIVOS")
public class MantenimientoPreventivo extends Mantenimiento {

    @Column(name = "FECHA_INICIO_PREVISTA")
    private Date fechaInicioPrevista;

    public void registrarDemoras(Demora demora) {
        // TODO implement here
    }
}