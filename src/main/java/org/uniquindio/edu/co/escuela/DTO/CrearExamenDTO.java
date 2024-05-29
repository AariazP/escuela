package org.uniquindio.edu.co.escuela.DTO;

import java.util.Date;

public record CrearExamenDTO(
        Integer tiempo_max,
        Integer numero_preguntas,
        Integer porcentajeCurso,
        String nombre,
        Integer porcentaje_aprobatorio,
        String fecha_hora_inicio,
        String fecha_hora_fin,
        Integer num_preguntas_aleatorias,
        Integer id_tema,
        Integer id_docente,
        Integer id_grupo
) {
}
