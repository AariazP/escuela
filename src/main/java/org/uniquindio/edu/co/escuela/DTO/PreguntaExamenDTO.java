package org.uniquindio.edu.co.escuela.DTO;

import org.uniquindio.edu.co.escuela.domain.Examen;
import org.uniquindio.edu.co.escuela.domain.Pregunta;

public record PreguntaExamenDTO(


        Double porcentajeExamen,

        Integer tiempoPregunta,

        boolean tieneTiempoMaximo,

        PreguntaDTO pregunta,

        ExamenDTO examen

) {
}
