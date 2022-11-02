package com.ppai.domain.gestion_cientificos.asignaciones;

import com.ppai.domain.gestion_cientificos.cientifico.PersonalCientifico;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class AsignacionCientifico {
    private PersonalCientifico cientifico;
    private Date fechaInicio;
    private Date fechaFin;

    public boolean esCientificoActivo() {
        if (this.fechaFin == null) {
            return true;
        } else return new Date().before(this.fechaFin);
    }

    public boolean esTuCientifico(PersonalCientifico cientifico) {
        return this.cientifico.equals(cientifico);
    }
}