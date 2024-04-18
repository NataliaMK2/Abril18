package com.softtek.servicio;

import com.softtek.modelo.Producto;
import com.softtek.repo.IProductoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServicio implements IProductoServicio{
    @Autowired
    private IProductoRepo repo;

    @Override
    public List<Producto> obtenerTodos(){
        return repo.obtenerTodos();
    }

    @Override
    public Optional<Producto> obtenerProducto(int id) {
        return repo.obtenerProducto(id);
    }

    @Override
    public Producto crearProducto(Producto p) {
        return repo.crearProducto(p);
    }

    @Override
    public void eliminarProducto(int id) {
        repo.eliminarProducto(id);
    }
}
