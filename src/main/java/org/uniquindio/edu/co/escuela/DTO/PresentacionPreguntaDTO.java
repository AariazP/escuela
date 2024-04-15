package org.uniquindio.edu.co.escuela.DTO;

import org.uniquindio.edu.co.escuela.domain.Pregunta;
import org.uniquindio.edu.co.escuela.domain.PresentacionExamen;
import org.uniquindio.edu.co.escuela.domain.PresentacionPregunta;
import org.uniquindio.edu.co.escuela.domain.Respuesta;

import java.util.List;

public record PresentacionPreguntaDTO(



        boolean respuestaCorrecta,


        PresentacionExamenDTO presentacionExamen,

        PreguntaDTO pregunta,

        RespuestaDTO respuesta



) {
}
