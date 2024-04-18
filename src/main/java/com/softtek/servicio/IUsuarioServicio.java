package com.softtek.servicio;

import com.softtek.modelo.Usuario;
import java.util.Optional;

public interface IUsuarioServicio {
    Optional<Usuario> obtenerUsuario(String nombreUsuario);
}