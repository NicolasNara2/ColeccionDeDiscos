package com.ejemplo.ColeccionDeDiscos.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Getter
@Setter
@ToString

@Entity
@Table (name= "autores")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column (name = "apellido")
    private String apellido;
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(mappedBy = "autor")
    private Set<Disco> discos;

}
