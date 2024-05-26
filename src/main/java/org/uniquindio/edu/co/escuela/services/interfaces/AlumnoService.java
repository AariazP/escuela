package org.uniquindio.edu.co.escuela.services.interfaces;

import org.uniquindio.edu.co.escuela.DTO.*;

import java.util.List;

public interface AlumnoService {

    TokenDTO login(SesionDTO user);

    String guardarPregunta(PreguntaDTO preguntaDTO);
}
