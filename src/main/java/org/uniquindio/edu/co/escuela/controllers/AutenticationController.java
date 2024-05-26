package org.uniquindio.edu.co.escuela.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.uniquindio.edu.co.escuela.DTO.SesionDTO;
import org.uniquindio.edu.co.escuela.DTO.TokenDTO;
import org.uniquindio.edu.co.escuela.services.interfaces.AutenticacionServicio;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AutenticationController {

    private final AutenticacionServicio autenticacionServicio;



}
