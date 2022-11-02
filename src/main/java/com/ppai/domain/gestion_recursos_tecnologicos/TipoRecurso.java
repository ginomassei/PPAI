package com.ppai.domain.gestion_recursos_tecnologicos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class TipoRecurso {
    private String nombre;
    private String descripcion;
    private ArrayList<Caracteristica> caracteristicas;

    public String mostrarCategoria() {
        return this.nombre;
    }
}