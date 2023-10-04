package com.example.demo.repositorios;

import com.example.demo.entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LiboRepository extends JpaRepository<Libro,Long> {
}
