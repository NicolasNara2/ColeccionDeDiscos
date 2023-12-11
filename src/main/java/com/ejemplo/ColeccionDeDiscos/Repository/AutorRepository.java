package com.ejemplo.ColeccionDeDiscos.Repository;

import com.ejemplo.ColeccionDeDiscos.Entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository <Autor, Long> {

}
