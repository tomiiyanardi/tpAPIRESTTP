package com.example.demo.controladores;

import com.example.demo.entidades.Autor;
import com.example.demo.servicios.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/basedatos/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl>{
}