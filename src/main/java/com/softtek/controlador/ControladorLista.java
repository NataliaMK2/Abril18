package com.softtek.controlador;

import com.softtek.modelo.Lista;
import com.softtek.servicio.ListaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/lista")
public class ControladorLista {
    @Autowired
    private ListaServicio servicio;

    @GetMapping("/{posicion}")
    public String obtenerValor(@RequestBody Lista lista, @PathVariable int posicion){
        Optional<String> valor = servicio.obtenerValor(lista, posicion);
        return valor.orElse("La lista está vacía");
    }
}
