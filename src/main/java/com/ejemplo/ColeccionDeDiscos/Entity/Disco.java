package com.ejemplo.ColeccionDeDiscos.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Entity
@Table (name = "discos")
public class Disco {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    @Column (name = "nombre")
    private String nombre;
    @Column (name = "año")
    private Integer año;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "autor_id")
    private Autor autor;
    }
