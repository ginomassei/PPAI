package com.ppai.domain;

public class Sesion {
    public Usuario usuario;

    public Sesion(Usuario usuario) {
        this.usuario = usuario;
    }

    public PersonalCientifico obtenerCientifico() {
        return this.usuario.obtenerCientifico();
    }
}