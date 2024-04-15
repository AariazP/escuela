package org.uniquindio.edu.co.escuela.DTO;

import org.uniquindio.edu.co.escuela.domain.*;

import java.util.List;

public record PreguntaDTO(


        String enunciado,

        boolean esPublica,
        String tipoPregunta,
        PreguntaDTO preguntaPadre,

        List<PreguntaDTO> subPreguntas,

        List<RespuestaDTO> respuestas,

        List<PresentacionPreguntaDTO> presentacionesPregunta,

        DocenteDTO docente,
        TemaDTO tema,

        RespuestaDTO respuesta,

        List<PreguntaExamenDTO> preguntasExamen





) {
}
