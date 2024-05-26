package org.uniquindio.edu.co.escuela.controllers;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.uniquindio.edu.co.escuela.domain.Alumno;
import org.uniquindio.edu.co.escuela.servicios.interfaces.AlumnoService;

import java.util.List;

@RestController
@RequestMapping("/api/estudiante")
@AllArgsConstructor
public class AlumnoController {

    private final AlumnoService alumnoService;


    @GetMapping("/listar-alumnos")
    public ResponseEntity<List<Alumno>> listarAlumnos() {
        return ResponseEntity.ok().body(alumnoService.listarAlumnos());
    }

}
