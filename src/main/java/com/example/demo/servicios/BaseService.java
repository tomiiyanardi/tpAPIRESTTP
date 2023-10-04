package com.example.demo.servicios;

import com.example.demo.entidades.BaseEntidad;
import java.util.List;
import java.io.Serializable;

public interface BaseService <E>{
    public List<E> findAll() throws Exception;
    public E findById(Long id) throws Exception;
    public E save(E entity) throws Exception;
    public E update(Long id, E entity) throws Exception;
    public boolean delete(Long id) throws Exception;
}