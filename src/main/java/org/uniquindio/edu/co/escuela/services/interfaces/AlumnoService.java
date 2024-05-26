package org.uniquindio.edu.co.escuela.services.interfaces;

import org.uniquindio.edu.co.escuela.DTO.AlumnoDTO;
import org.uniquindio.edu.co.escuela.DTO.PresentacionExamenDTO;
import org.uniquindio.edu.co.escuela.DTO.PresentacionPreguntaDTO;

import java.util.List;

public interface AlumnoService {



    Long presentarExamen (PresentacionExamenDTO presentacionExamenDTO);

    Long presentarPregunta(PresentacionPreguntaDTO presentacionPreguntaDTO);

    List<AlumnoDTO> listarAlumnos();
}
