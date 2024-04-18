package com.softtek.controlador;

import com.softtek.modelo.Tarea;
import com.softtek.servicio.TareaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestMapping("/tareas")
public class ControladorTarea {
    @Autowired
    private TareaServicio servicio;
    @GetMapping
    public Tarea obtenerTarea(){
        return servicio.obtenerTarea();
    }
    @PostMapping
    public Tarea crearTarea(@RequestBody Tarea t){
        return servicio.crearTarea(t);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id){
        servicio.eliminarTarea(id);
    }
}
