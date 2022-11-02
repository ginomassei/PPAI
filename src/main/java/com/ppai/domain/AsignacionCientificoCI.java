package com.ppai.domain;

import lombok.Data;
import javax.persistence.*;
import java.util.*;

@Data
@Entity
@Table(name = "ASIGNACIONES_CIENTIFICO_CI")
public class AsignacionCientificoCI extends AsignacionCientifico {

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_TURNO")
    private List<Turno> turnos;
}
