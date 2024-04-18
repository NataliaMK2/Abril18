package com.softtek.repo;

import com.softtek.modelo.Usuario;
import java.util.Optional;

public interface IUsuarioRepo {
    Optional<Usuario> obtenerUsuario(String nombreUsuario);
}
