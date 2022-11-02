package com.ppai.domain.gestion_centro_investigacion;

import com.ppai.domain.gestion_cientificos.cientifico.PersonalCientifico;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Facultad {
    private String nombre;
    private PersonalCientifico responsableCyT;
    private CentroInvestigacion centrosDeInvestigacion;
}