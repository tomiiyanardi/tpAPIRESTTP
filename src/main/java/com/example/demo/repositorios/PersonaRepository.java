package com.example.demo.repositorios;

import com.example.demo.entidades.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long> {
}
