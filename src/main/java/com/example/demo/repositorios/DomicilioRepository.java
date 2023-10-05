package com.example.demo.repositorios;

import com.example.demo.entidades.Domicilio;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioRepository extends BaseRepository<Domicilio,Long> {
}
