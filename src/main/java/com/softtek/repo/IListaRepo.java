package com.softtek.repo;

import com.softtek.modelo.Lista;
import java.util.Optional;

public interface IListaRepo {
    Optional<String> obtenerValor(Lista lista, int posicion);
}