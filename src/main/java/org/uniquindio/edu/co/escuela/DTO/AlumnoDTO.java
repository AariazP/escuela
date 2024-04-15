package org.uniquindio.edu.co.escuela.DTO;

import org.uniquindio.edu.co.escuela.domain.Grupo;
import org.uniquindio.edu.co.escuela.domain.Nota;
import org.uniquindio.edu.co.escuela.domain.PresentacionExamen;

import java.util.List;

public record AlumnoDTO(


        String nombre,
        String apellido,
        Long id,

        List<GrupoDTO> grupos,

        List<NotaDTO> notas,

        List<PresentacionExamenDTO> examenes





) {
}
