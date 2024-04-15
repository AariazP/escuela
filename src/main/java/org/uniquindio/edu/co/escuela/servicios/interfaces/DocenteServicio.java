package org.uniquindio.edu.co.escuela.servicios.interfaces;

import org.uniquindio.edu.co.escuela.DTO.ExamenDTO;
import org.uniquindio.edu.co.escuela.DTO.PreguntaDTO;

public interface DocenteServicio {


    // Crear examen retorna Long porque es el código del nuevo examen creado que retorna la BD
    public Long crearExamen (ExamenDTO examenDTO);
    // Crear Pregunta retorna Long porque es el código del nuevo examen creado que retorna la BD
    public Long crearPregunta(PreguntaDTO preguntaDTO);



}
