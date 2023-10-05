package com.example.demo.controladores;

import com.example.demo.entidades.Libro;
import com.example.demo.servicios.LibroServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/basedatos/libros")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl>{
}
