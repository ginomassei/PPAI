package com.ppai.domain;

import com.ppai.domain.state.Estado;

import javax.persistence.*;
import java.util.concurrent.atomic.AtomicReference;

@Entity
@Table(name = "USUARIOS")
public class Usuario {
    @Id
    @Column(name = "ID_USUARIO")
    private Long id;

    @Column(name = "PASSWORD")
    private String password;

    @OneToOne
    private Estado estado;

    @Column(name = "NOMBRE_USUARIO")
    private String nombreUsuario;

    public Usuario(String contrasena, Estado estado, String nombreUsuario) {
        this.password = contrasena;
        this.estado = estado;
        this.nombreUsuario = nombreUsuario;
    }

    public Usuario() {

    }

    public void registrarBaja() {
        // TODO implement here
    }

    public PersonalCientifico obtenerCientifico() {
        AtomicReference<PersonalCientifico> atomicReference = new AtomicReference<>();
//        CientificosVendor.getCientificos().forEach(cientifico -> {
//            if (cientifico.esTuUsuario(this)) {
//                atomicReference.set(cientifico);
//            }
//        });
        return atomicReference.get();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
}