package com.ejemplo.ColeccionDeDiscos.Repository;

import com.ejemplo.ColeccionDeDiscos.Entity.Autor;

import java.util.ArrayList;
import java.util.List;

public class AutorDao implements IDao<Autor> {

    private List<Autor> autores= new ArrayList<>();
    private Autor autor1= new Autor("Fito Paez", 1L);
    private Autor autor2= new Autor("Miranda", 2L);
    private Autor autor3= new Autor("Soda Estereo", 3L);



    @Override
    public Autor create(Autor autor) {
        autores.add(autor);
        return autor;
    }

    @Override
    public void eliminar(Long id) {
        for (Autor autor: autores
             ) {
            if(autor.getId().equals(id)){
                autores.remove(autor);
            }
        }
    }
    @Override
    public List<Autor> listarTodos() {
        return autores;
    }
    @Override
    public Autor buscarId(Long id) {
        Autor idAutor = null;
        for (Autor autor: autores
        ) {
            if(autor.getId().equals(id)){
                idAutor= autor;
            }
        }
        return idAutor;
    }

    @Override
    public Autor update(Autor autor) {
        Autor idAutor= null;
        for (Autor autorUpdate: autores
             ) {
            if (autorUpdate.equals(autor)){
                autorUpdate= autor;
                autorUpdate=autor;
            }
        }
        return autor;
    }
}
