package com.softtek.servicio;

import com.softtek.modelo.Usuario;
import com.softtek.repo.IUsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

    @Service
    public class UsuarioServicio implements IUsuarioServicio{
        @Autowired
        private IUsuarioRepo repo;

        @Override
        public Optional<Usuario> obtenerUsuario(String nombreUsuario){
            return repo.obtenerUsuario(nombreUsuario);
        }
    }
