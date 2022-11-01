package com.ppai.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "PERSONAL_CIENTIFICO")
public class PersonalCientifico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private int legajo;
    private String nombre;
    private String apellido;
    private String nroDocumento;
    private String correoInstitucional;
    private String correoPersonal;
    private Telefono telefono;
    private Usuario usuario;

    public void mostrarCientifico() {
        // TODO implement here
    }

    public boolean esTuUsuario(Usuario usuario) {
        return this.usuario.equals(usuario);
    }

    public int getLegajo() {
        return legajo;
    }
}