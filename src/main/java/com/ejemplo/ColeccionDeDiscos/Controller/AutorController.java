package com.ejemplo.ColeccionDeDiscos.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import com.ejemplo.ColeccionDeDiscos.Entity.Autor;
import com.ejemplo.ColeccionDeDiscos.Services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/autor")
public class AutorController {
    private AutorService autorService;
@Autowired
    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }
    @GetMapping("/")
    public ResponseEntity <?>listarTodos(){
    List<Autor> autores=autorService.listarTodos();
    if (autores.isEmpty()){
        System.out.println(autores);return
                ResponseEntity.badRequest().body("Autores no encontrados.");
    } else {
            return ResponseEntity.status(200).body(autores);}
}
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
        Optional<Autor> autor= autorService.buscarId(autorId);
      if (autor.isEmpty()) {
          System.out.println(autor);return
                ResponseEntity.badRequest().body("Autor no encontrado");
    }
        else{
        return ResponseEntity.status(200).body(autor);
    }
}
}
