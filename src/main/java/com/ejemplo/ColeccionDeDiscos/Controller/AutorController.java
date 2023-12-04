package com.ejemplo.ColeccionDeDiscos.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import com.ejemplo.ColeccionDeDiscos.Entity.Autor;
import com.ejemplo.ColeccionDeDiscos.Services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/autor")
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

    @GetMapping("/")
    public List<Autor> listarTodos(){
        return autorService.listarTodos();
    }
   // @GetMapping ("/{id}")
   // public Autor buscarId (@PathVariable Long id) {return autorService.buscarId(id);}
    @PostMapping
    public Autor create(@RequestBody Autor autor) {
    return autorService.create(autor);
    }
    @DeleteMapping ("/{id}")
    public void delete (@PathVariable Long id){
    autorService.eliminar(id);
    }
    @PutMapping
    public Autor update(Autor autor){
    return autorService.update(autor);
    }
    @GetMapping("/{autorId}") // response entity
    public ResponseEntity<?> buscarId(@PathVariable Long autorId) {
        Autor autor= autorService.buscarId(autorId);
        // lo tenemos definido en una variable estática
      if (autor == null) {
          System.out.println(autor);return
                ResponseEntity.badRequest().body("Autor no encontrado");
    }
        else{
        return ResponseEntity.status(200).body(autor);
    }
    // ResponseEntity.ok().body(autorEncontrado);
}
}
