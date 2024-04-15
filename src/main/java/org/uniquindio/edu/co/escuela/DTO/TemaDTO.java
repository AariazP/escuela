package org.uniquindio.edu.co.escuela.DTO;

import org.uniquindio.edu.co.escuela.domain.Examen;
import org.uniquindio.edu.co.escuela.domain.Pregunta;

import java.util.List;

public record TemaDTO(


        Long temaId,
        String titulo,

        String descripcion,

        List<ExamenDTO> examenes,

        List<PreguntaDTO> unidades


) {
}
