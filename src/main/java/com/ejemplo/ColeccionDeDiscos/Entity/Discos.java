package com.ejemplo.ColeccionDeDiscos.Entity;

public class Discos {
    private String nombre;
    private String autor;
    private Integer año;
    private Long id;

    public Discos(String nombre, String autor, Integer año, Long id) {
        this.nombre = nombre;
        this.autor = autor;
        this.año = año;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
