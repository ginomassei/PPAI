package com.ppai.config.vendors;

import com.ppai.domain.Usuario;
import io.quarkus.runtime.Startup;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;
import java.util.ArrayList;

@Singleton
@Startup
public class UsuariosVendor {
    private ArrayList<Usuario> usuarios;

    @PostConstruct
    public void init() {
        usuarios = new ArrayList<>();
        crearUsuarios();
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void crearUsuarios(){
        Usuario usuario1 = new Usuario(null, null, "psanchez");
        Usuario usuario2 = new Usuario(null, null, "mtretta");
        Usuario usuario3 = new Usuario(null, null, "glazcano");
        Usuario usuario4 = new Usuario(null, null, "cruiz");
        Usuario usuario5 = new Usuario(null, null, "areynoso");
        Usuario usuario6 = new Usuario(null, null, "tdiaz");

        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        usuarios.add(usuario4);
        usuarios.add(usuario5);
        usuarios.add(usuario6);
    }
}
