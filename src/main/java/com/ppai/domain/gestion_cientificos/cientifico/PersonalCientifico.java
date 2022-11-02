package com.ppai.domain.gestion_cientificos.cientifico;

import com.ppai.domain.gestion_centro_investigacion.Telefono;
import com.ppai.domain.gestion_usuarios.Usuario;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PersonalCientifico {
    private int legajo;
    private String nombre;
    private String apellido;
    private String nroDocumento;
    private String correoInstitucional;
    private String correoPersonal;
    private Telefono telefono;
    private Usuario usuario;

    public boolean esTuUsuario(Usuario usuario) {
        return this.usuario.equals(usuario);
    }

    public void mostrarCientifico() {
        // TODO implement here
    }
}