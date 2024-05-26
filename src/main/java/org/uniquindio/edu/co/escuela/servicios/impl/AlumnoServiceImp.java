package org.uniquindio.edu.co.escuela.servicios.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.uniquindio.edu.co.escuela.DTO.PresentacionExamenDTO;
import org.uniquindio.edu.co.escuela.DTO.PresentacionPreguntaDTO;
import org.uniquindio.edu.co.escuela.domain.Alumno;
import org.uniquindio.edu.co.escuela.repositories.AlumnoRepository;
import org.uniquindio.edu.co.escuela.servicios.interfaces.AlumnoService;

import java.util.List;

@Service
@AllArgsConstructor
public class AlumnoServiceImp implements AlumnoService {

    private final AlumnoRepository alumnoRepository;


    @Override
    public Long presentarExamen(PresentacionExamenDTO presentacionExamenDTO) {
        return null;
    }

    @Override
    public Long presentarPregunta(PresentacionPreguntaDTO presentacionPreguntaDTO) {
        return null;
    }

    @Override
    public List<Alumno> listarAlumnos() {
        return alumnoRepository.findAll();
    }
}
