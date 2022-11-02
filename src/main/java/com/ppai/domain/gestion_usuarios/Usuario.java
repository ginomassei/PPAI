package com.ppai.domain.gestion_usuarios;

import com.ppai.config.vendors.CientificosVendor;
import com.ppai.domain.gestion_cientificos.cientifico.PersonalCientifico;
import com.ppai.domain.gestion_turnos.estados.EstadoTurno;

import java.util.concurrent.atomic.AtomicReference;

public class Usuario {
    private String contrasena;
    private EstadoTurno estado;
    private String nombreUsuario;

    public Usuario(String contrasena, EstadoTurno estado, String nombreUsuario) {
        this.contrasena = contrasena;
        this.estado = estado;
        this.nombreUsuario = nombreUsuario;
    }

    public void registrarBaja() {
        // TODO implement here
    }

    public PersonalCientifico obtenerCientifico() {
        AtomicReference<PersonalCientifico> atomicReference = new AtomicReference<>();
        CientificosVendor.getCientificos().forEach(cientifico -> {
            if (cientifico.esTuUsuario(this)) {
                atomicReference.set(cientifico);
            }
        });
        return atomicReference.get();
    }
}