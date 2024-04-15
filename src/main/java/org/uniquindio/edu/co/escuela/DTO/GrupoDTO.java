package org.uniquindio.edu.co.escuela.DTO;

import org.uniquindio.edu.co.escuela.domain.*;

import java.util.List;

public record GrupoDTO(


        Long grupoId,
        List<BloqueHorarioDTO> horarios,
        String jornada,
        String nombre,
        String periodo,

        List<NotaDTO> notas,

        CursoDTO curso,

        List<AlumnoDTO> alumnos,

        DocenteDTO docente



) {
}
