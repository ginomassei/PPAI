package com.ppai.domain;

import com.ppai.domain.state.Estado;
import lombok.Data;

import javax.persistence.*;
import java.util.concurrent.atomic.AtomicReference;

@Data
@Entity
@Table(name = "USUARIOS")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_USUARIO")
    private Long id;

    @Column(name = "PASSWORD")
    private String password;

    @OneToOne
    private Estado estado;

    @Column(name = "NOMBRE_USUARIO")
    private String nombreUsuario;

    public PersonalCientifico obtenerCientifico() {
        AtomicReference<PersonalCientifico> atomicReference = new AtomicReference<>();
        // TODO
//        CientificosVendor.getCientificos().forEach(cientifico -> {
//            if (cientifico.esTuUsuario(this)) {
//                atomicReference.set(cientifico);
//            }
//        });
        return atomicReference.get();
    }
}
