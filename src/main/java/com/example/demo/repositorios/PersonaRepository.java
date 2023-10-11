package com.example.demo.repositorios;

import com.example.demo.entidades.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long> {
    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);
    Page<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido, Pageable pageable);

    //Parametros indexados
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE '%?1%' OR p.apellido LIKE '%?1%' ")
    List<Persona> search(String filtro);
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE '%?1%' OR p.apellido LIKE '%?1%' ")
    Page<Persona> search(String filtro, Pageable pageable);

    @Query(
            value = "SELECT * FROM Persona WHERE Persona.nombre LIKE '%?1%' OR Persona.apellido LIKE '%?1%'",
            nativeQuery = true
    )
    List<Persona> searchNativo(String filtro);
    @Query(
            value = "SELECT * FROM Persona WHERE Persona.nombre LIKE '%?1%' OR Persona.apellido LIKE '%?1%'",
            countQuery = "SELECT count(*) FROM Persona",
            nativeQuery = true
    )
    Page<Persona> searchNativo(String filtro, Pageable pageable);

}