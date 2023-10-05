package com.example.demo.controladores;


import com.example.demo.entidades.Persona;
import com.example.demo.servicios.PersonaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/basedatos/personas")
public class PersonaController extends BaseControllerImpl <Persona, PersonaServiceImpl>{
}