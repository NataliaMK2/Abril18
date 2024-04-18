package com.softtek.controlador;

import com.softtek.modelo.Usuario;
import com.softtek.servicio.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class ControladorUsuario {
    @Autowired
    private UsuarioServicio servicio;

    @GetMapping("/{nombreUsuario}")
    public String obtenerUsuario(@PathVariable String nombreUsuario){
        Optional<Usuario> usuario = servicio.obtenerUsuario(nombreUsuario);
        return usuario.map(Usuario::getNombreUsuario).orElse("nombre de usuario inválido");
    }
}
