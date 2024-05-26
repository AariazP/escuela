package org.uniquindio.edu.co.escuela.servicios.interfaces;

import org.uniquindio.edu.co.escuela.DTO.PresentacionExamenDTO;
import org.uniquindio.edu.co.escuela.DTO.PresentacionPreguntaDTO;
import org.uniquindio.edu.co.escuela.domain.Alumno;

import java.util.List;

public interface AlumnoService {



    Long presentarExamen (PresentacionExamenDTO presentacionExamenDTO);

    Long presentarPregunta(PresentacionPreguntaDTO presentacionPreguntaDTO);

    List<Alumno> listarAlumnos();
}
