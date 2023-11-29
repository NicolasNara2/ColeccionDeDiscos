package com.ejemplo.ColeccionDeDiscos.Controller;

import org.springframework.ui.Model;
import com.ejemplo.ColeccionDeDiscos.Entity.Autor;
import com.ejemplo.ColeccionDeDiscos.Services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/autor")
public class AutorController {
    private AutorService autorService;
@Autowired
    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }
@GetMapping("/saludo")
    public String saludo (Model model){
    model.addAttribute("nombre", "Esta funcionando");
    return "saludo";
}

    @GetMapping("/Hola")
    public List<Autor> listarTodos(){
        return autorService.listarTodos();
    }
    public Autor buscarId (Long id){
        return autorService.buscarId(id);
    }

}
