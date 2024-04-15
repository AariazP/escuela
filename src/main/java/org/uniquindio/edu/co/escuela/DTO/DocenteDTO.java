package org.uniquindio.edu.co.escuela.DTO;

import org.uniquindio.edu.co.escuela.domain.Examen;
import org.uniquindio.edu.co.escuela.domain.Pregunta;

import java.util.List;

public record DocenteDTO(

        Long docenteId,
        String nombre,
        String apellido,
        String identificacion,

        List<GrupoDTO> grupos,
        List<ExamenDTO> examenes,

        List<PreguntaDTO> preguntas




) {
}
