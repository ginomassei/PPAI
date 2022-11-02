package com.ppai.domain.gestion_usuarios;

import com.ppai.domain.gestion_cientificos.cientifico.PersonalCientifico;
import com.ppai.domain.gestion_usuarios.Usuario;

public class Sesion {
    public Usuario usuario;

    public Sesion(Usuario usuario) {
        this.usuario = usuario;
    }

    public PersonalCientifico obtenerCientifico() {
        return this.usuario.obtenerCientifico();
    }
}