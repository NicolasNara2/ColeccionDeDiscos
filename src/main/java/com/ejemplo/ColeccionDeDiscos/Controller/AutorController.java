package com.ejemplo.ColeccionDeDiscos.Controller;

import com.ejemplo.ColeccionDeDiscos.Entity.Autor;
import com.ejemplo.ColeccionDeDiscos.Services.AutorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/autor")
public class AutorController {
    private AutorService autorService;

    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    @GetMapping
    public List<Autor> listarTodos(){
        return autorService.listarTodos();
    }
    public Autor buscarId (Long id){
        return autorService.buscarId(id);
    }

}
