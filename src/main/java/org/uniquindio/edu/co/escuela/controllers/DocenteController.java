package org.uniquindio.edu.co.escuela.controllers;


import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.uniquindio.edu.co.escuela.DTO.MensajeDTO;
import org.uniquindio.edu.co.escuela.DTO.PreguntaBancoDTO;
import org.uniquindio.edu.co.escuela.services.interfaces.DocenteService;

import java.util.List;

@RestController
@RequestMapping("/api/docente")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class DocenteController {

    private final DocenteService docenteService;

    @PostMapping("/listarBancoPreguntas")
    public ResponseEntity<MensajeDTO<List<PreguntaBancoDTO>>> listarBancoPreguntas(@RequestBody Long id_tema) {
        return ResponseEntity.ok().body(new MensajeDTO<>(false, "", docenteService.obtenerBancoPreguntas(id_tema)));
    }


}
