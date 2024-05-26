package org.uniquindio.edu.co.escuela.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.uniquindio.edu.co.escuela.DTO.AlumnoDTO;
import org.uniquindio.edu.co.escuela.DTO.MensajeDTO;
import org.uniquindio.edu.co.escuela.DTO.SesionDTO;
import org.uniquindio.edu.co.escuela.DTO.TokenDTO;
import org.uniquindio.edu.co.escuela.services.interfaces.AlumnoService;

import java.util.List;

@RestController
@RequestMapping("/api/estudiante")
@AllArgsConstructor
public class AlumnoController {

    private final AlumnoService alumnoService;


    @GetMapping("/listar-alumnos")
    public ResponseEntity<List<AlumnoDTO>> listarAlumnos() {
        return ResponseEntity.ok().body(alumnoService.listarAlumnos());
    }

    @PostMapping("/login")
    public ResponseEntity<MensajeDTO<TokenDTO>> login(@RequestBody SesionDTO loginDTO )  throws Exception {

        TokenDTO tokenDTO = alumnoService.login(loginDTO);

        return ResponseEntity.ok().body(new MensajeDTO<>(false, tokenDTO));
    }

}
