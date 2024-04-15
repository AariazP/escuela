package org.uniquindio.edu.co.escuela.DTO;

import org.uniquindio.edu.co.escuela.domain.Pregunta;
import org.uniquindio.edu.co.escuela.domain.PresentacionPregunta;

import java.util.List;

public record RespuestaDTO(

        String descripcion,
        boolean esVerdadera,

        PreguntaDTO pregunta,

        List<PresentacionPreguntaDTO> presentacionesPregunta


) {
}
