package org.uniquindio.edu.co.escuela.DTO;

import java.util.Date;

public record ExamenPendienteDTO(
        String nombreExamen,
        String fecha,
        Integer idExamen
) {
}
