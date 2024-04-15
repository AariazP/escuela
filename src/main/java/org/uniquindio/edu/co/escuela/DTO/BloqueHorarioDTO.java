package org.uniquindio.edu.co.escuela.DTO;

import org.uniquindio.edu.co.escuela.domain.Grupo;

import java.util.List;

public record BloqueHorarioDTO(



        Long bloqueId,
        String lugar,
        String hora,

        List<GrupoDTO> horarios
) {
}
