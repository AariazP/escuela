package org.uniquindio.edu.co.escuela.DTO;

import java.time.LocalDate;
import java.util.List;

public record PresentacionExamenDTO(

       Integer tiempo,
       boolean presentado,
       Double calificacion,

       Double ipSource,

       LocalDate fechaPresentacion,

       AlumnoDTO alumnoDTO,

       ExamenDTO examenDTO,

       List<PresentacionPreguntaDTO> preguntasRespondidas




) {
}
