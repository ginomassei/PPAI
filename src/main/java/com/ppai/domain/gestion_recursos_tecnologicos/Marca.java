package com.ppai.domain.gestion_recursos_tecnologicos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

@Data
@AllArgsConstructor
public class Marca {
    private String nombre;
    private String descripción;
    private ArrayList<Modelo> modelos;

    public String mostrarNombre() {
        return this.nombre;
    }

    public boolean esTuModelo(Modelo modelo) {
        return this.modelos.contains(modelo);
    }
}