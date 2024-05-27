package org.uniquindio.edu.co.escuela.services.interfaces;

import org.uniquindio.edu.co.escuela.DTO.*;


public interface AlumnoService {

    String guardarPregunta(PreguntaDTO preguntaDTO);

    String obtenerNombre(String id, String rol);
}
