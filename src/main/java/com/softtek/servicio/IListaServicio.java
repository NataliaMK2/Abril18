package com.softtek.servicio;

import com.softtek.modelo.Lista;
import java.util.Optional;

public interface IListaServicio {
    Optional<String> obtenerValor(Lista lista, int posicion);
}
