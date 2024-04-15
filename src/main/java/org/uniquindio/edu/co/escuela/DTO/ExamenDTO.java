package org.uniquindio.edu.co.escuela.DTO;

import org.uniquindio.edu.co.escuela.domain.*;

import java.time.LocalDate;
import java.util.List;

public record ExamenDTO(


        Integer tiempoMaximo,
        Integer numeroPreguntas,

       // Double porcentajeCurso -- No creo que sea necesario poner ese atributo en el DTO

        String nombre,

        String descripcion,

        Double porcentajeAprobatorio,

        LocalDate fechaHoraInicio,

        LocalDate fechaHoraLimite,

        Integer numeroPreguntasAleatorias,

        GrupoDTO grupo,

        DocenteDTO docente,

       // List<PresentacionExamenDTO> examenesPresentados --Tampoco creo necesario esto
        TemaDTO tema,

        List<PreguntaExamenDTO> preguntasExamen







) {
}
