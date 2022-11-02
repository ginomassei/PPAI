package com.ppai.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "PERSONAL_CIENTIFICO")
public class PersonalCientifico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "LEGAJO_PERSONAL_CIENTIFICO", nullable = false)
    private Long legajo;

    private String nombre;
    private String apellido;
    private String nroDocumento;
    private String correoInstitucional;
    private String correoPersonal;

    @OneToOne
    private Telefono telefono;

    @OneToOne
    private Usuario usuario;

    public void mostrarCientifico() {
        // TODO implement here
    }

    public boolean esTuUsuario(Usuario usuario) {
        return this.usuario.equals(usuario);
    }

    public Long getLegajo() {
        return legajo;
    }
}