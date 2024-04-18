package com.softtek.servicio;

import com.softtek.modelo.Producto;
import java.util.List;
import java.util.Optional;

public interface IProductoServicio {
    List<Producto> obtenerTodos();
    Optional<Producto> obtenerProducto(int id);
    Producto crearProducto(Producto p);
    void eliminarProducto(int id);
}