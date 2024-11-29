package examen.semana9.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import examen.semana9.entity.Alumno;

@RestController
@RequestMapping("/alumno")

public class AlumnoControlador {
	
	    @GetMapping("/alumno")
	    public Alumno getAlumno() {
	        Alumno alumno = new Alumno();
	        alumno.setNombre("Roberdi");
	        alumno.setApellido("Riveros");
	        alumno.setEdad(23);
	        return alumno;
	    }
	}


