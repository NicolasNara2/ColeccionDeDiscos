package com.ejemplo.ColeccionDeDiscos.Repository;

import com.ejemplo.ColeccionDeDiscos.Entity.Autor;
import com.ejemplo.ColeccionDeDiscos.Entity.Disco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscoRepository extends JpaRepository<Disco, Long> {
}
