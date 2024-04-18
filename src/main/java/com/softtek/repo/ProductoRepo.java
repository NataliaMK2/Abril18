package com.softtek.repo;

import com.softtek.modelo.Producto;
import com.softtek.repo.IProductoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepo implements IProductoRepo {

    @Autowired
    private IProductoRepo productoJpaRepository;

    @Override
    public List<Producto> obtenerTodos() {
        return productoJpaRepository.obtenerTodos();
    }

    @Override
    public Optional<Producto> obtenerProducto(int id) {
        return productoJpaRepository.obtenerProducto(id);
    }

    @Override
    public Producto crearProducto(Producto p) {
        return productoJpaRepository.crearProducto(p);
    }

    @Override
    public void eliminarProducto(int id) {
        productoJpaRepository.eliminarProducto(id);
    }
}
