package com.ppai.domain;

public class PersonalCientifico {
    private int legajo;
    private String nombre;
    private String apellido;
    private String nroDocumento;
    private String correoInstitucional;
    private String correoPersonal;
    private Telefono telefono;
    private Usuario usuario;

    public PersonalCientifico(
        int legajo,
        String nombre,
        String apellido,
        String nroDocumento,
        String correoInstitucional,
        String correoPersonal,
        Telefono telefono,
        Usuario usuario
    ) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroDocumento = nroDocumento;
        this.correoInstitucional = correoInstitucional;
        this.correoPersonal = correoPersonal;
        this.telefono = telefono;
        this.usuario = usuario;
    }

    public void mostrarCientifico() {
        // TODO implement here
    }
}