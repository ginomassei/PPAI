package com.ppai.domain.gestion_recursos_tecnologicos;

import com.ppai.config.vendors.MarcasVendor;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Modelo {
    private String nombre;
    private String descripcion;

    public String mostrarMarca() {
        String miMarca = "";
        for (Marca marca: MarcasVendor.getMarcas()) {
            if (marca.esTuModelo(this)) {
                miMarca = marca.mostrarNombre();
                return miMarca;
            }
        }
        return miMarca;
    }

    public String mostrarNombre() {
        return this.nombre;
    }
}