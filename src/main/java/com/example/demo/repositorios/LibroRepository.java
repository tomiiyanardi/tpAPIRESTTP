package com.example.demo.repositorios;

import com.example.demo.entidades.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro,Long> {
}
