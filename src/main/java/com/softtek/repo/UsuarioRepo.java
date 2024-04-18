package com.softtek.repo;

import com.softtek.modelo.Usuario;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioRepo implements IUsuarioRepo {
    @Override
    public Optional<Usuario> obtenerUsuario(String nombreUsuario){
        if(nombreUsuario == null || nombreUsuario.trim().isEmpty()){
            return Optional.empty();
        }
        return Optional.of(new Usuario(nombreUsuario));
    }
}
