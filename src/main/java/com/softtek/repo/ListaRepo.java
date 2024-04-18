package com.softtek.repo;
import org.springframework.stereotype.Repository;
import com.softtek.modelo.Lista;
import java.util.Optional;
@Repository
public class ListaRepo implements IListaRepo {
    @Override
    public Optional<String> obtenerValor(Lista lista, int posicion){
        if(lista.getValores() == null || lista.getValores().isEmpty()){
            return Optional.empty();
        }
        if(posicion < 0 || posicion >= lista.getValores().size()){
            return Optional.of(lista.getValores().get(0));
        }
        return Optional.of(lista.getValores().get(posicion));
    }
}