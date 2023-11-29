package com.ejemplo.ColeccionDeDiscos;

import com.ejemplo.ColeccionDeDiscos.Services.AutorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColeccionDeDiscosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ColeccionDeDiscosApplication.class, args);
	}
	AutorService autorService = new AutorService();
}
