package org.uniquindio.edu.co.escuela.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.uniquindio.edu.co.escuela.DTO.*;
import org.uniquindio.edu.co.escuela.services.interfaces.AlumnoService;

@RestController
@RequestMapping("/api/estudiante")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class AlumnoController {

    private final AlumnoService alumnoService;

    @PostMapping("/guardar-pregunta")
    public ResponseEntity<MensajeDTO<String>> guardarPregunta(@RequestBody PreguntaDTO preguntaDTO) {
        return ResponseEntity.ok().body(new MensajeDTO<>(false, "", alumnoService.guardarPregunta(preguntaDTO)));
    }

}
