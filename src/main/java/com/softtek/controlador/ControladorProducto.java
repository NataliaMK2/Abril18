package com.softtek.controlador;

import com.softtek.modelo.Producto;
import com.softtek.servicio.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/productos")
public class ControladorProducto {
    @Autowired
    private ProductoServicio servicio;

    @GetMapping
    public List<Producto> obtenerTodos(){
        return servicio.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Optional<Producto> obtenerProducto(@PathVariable int id){
        return servicio.obtenerProducto(id);
    }

    @PostMapping
    public Producto crearProducto(@RequestBody Producto p){
        return servicio.crearProducto(p);
    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable int id){
        servicio.eliminarProducto(id);
    }
}
