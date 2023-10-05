package com.example.demo.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "libro")
public class Libro extends BaseEntidad {
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "fecha")
    private int fecha;
    @Column(name = "genero")
    private String genero;
    @Column(name = "paginas")
    private int paginas;
    @Column(name = "autor")
    private String autor;

    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores;
}
