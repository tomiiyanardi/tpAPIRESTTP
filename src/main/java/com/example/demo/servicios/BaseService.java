package com.example.demo.servicios;

import com.example.demo.entidades.BaseEntidad;
import java.util.List;
import java.io.Serializable;

public interface BaseService <E, ID>{
    public List<E> findAll() throws Exception;
    public E findById(ID id) throws Exception;
    public E save(E entity) throws Exception;
    public E update(ID id, E entity) throws Exception;
    public boolean delete(ID id) throws Exception;
}