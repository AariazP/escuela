package org.uniquindio.edu.co.escuela.services.interfaces;

import org.uniquindio.edu.co.escuela.DTO.*;

import java.util.List;

public interface AlumnoService {



    Long presentarExamen (PresentacionExamenDTO presentacionExamenDTO);

    Long presentarPregunta(PresentacionPreguntaDTO presentacionPreguntaDTO);

    List<AlumnoDTO> listarAlumnos();

    TokenDTO login(SesionDTO user);
}
