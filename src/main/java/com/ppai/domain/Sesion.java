package com.ppai.domain;

import javax.inject.Singleton;

@Singleton
public class Sesion {
    public Usuario usuario;

    public Sesion(Usuario usuario) {
        this.usuario = usuario;
    }

    public void obtenerCientifico() {
        // TODO implement here
    }
}