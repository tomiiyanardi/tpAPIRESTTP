package com.example.demo.servicios;

import com.example.demo.entidades.Persona;
import com.example.demo.repositorios.BaseRepository;
import com.example.demo.repositorios.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl <Persona, Long> implements PersonaService {

    @Autowired
    private final PersonaRepository personaRepository;


    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }
}