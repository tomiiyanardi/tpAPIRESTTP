package com.example.demo.controladores;

import com.example.demo.entidades.Domicilio;
import com.example.demo.servicios.DomicilioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/basedatos/domicilios")
public class DomicilioController extends BaseControllerImpl <Domicilio, DomicilioServiceImpl>{

}

