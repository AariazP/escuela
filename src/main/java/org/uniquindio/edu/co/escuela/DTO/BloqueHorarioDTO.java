package org.uniquindio.edu.co.escuela.DTO;

import org.uniquindio.edu.co.escuela.domain.Grupo;

import java.sql.Timestamp;
import java.util.List;

public record BloqueHorarioDTO(



        Long bloqueId,
        String lugar,
        Timestamp horaInicio,

        Timestamp horaFin,

        List<GrupoDTO> horarios
) {
}
