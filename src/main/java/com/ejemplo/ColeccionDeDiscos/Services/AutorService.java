package com.ejemplo.ColeccionDeDiscos.Services;

import com.ejemplo.ColeccionDeDiscos.Entity.Autor;
import com.ejemplo.ColeccionDeDiscos.Repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {
private AutorRepository autorRepository;
@Autowired
    public AutorService(AutorRepository autorRepository) {this.autorRepository = autorRepository;}
    public Autor create(Autor autor){return autorRepository.save(autor);}
    public void eliminar (Long id){
        autorRepository.deleteById(id);
    }
    public Optional<Autor> buscarId (Long id){
        return autorRepository.findById(id);
    }
    public List<Autor> listarTodos(){
        return autorRepository.findAll();
    }
    public Autor update(Autor autor){
        return autorRepository.save(autor);
    }
}
