package com.softtek.servicio;
import com.softtek.modelo.Lista;
import com.softtek.repo.IListaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ListaServicio implements IListaServicio{
    @Autowired
    private IListaRepo repo;

    @Override
    public Optional<String> obtenerValor(Lista lista, int posicion){
        return repo.obtenerValor(lista, posicion);
    }
}