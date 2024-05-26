package org.uniquindio.edu.co.escuela.services.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.uniquindio.edu.co.escuela.DTO.AlumnoDTO;
import org.uniquindio.edu.co.escuela.DTO.PresentacionExamenDTO;
import org.uniquindio.edu.co.escuela.DTO.PresentacionPreguntaDTO;
import org.uniquindio.edu.co.escuela.domain.Alumno;
import org.uniquindio.edu.co.escuela.repositories.AlumnoRepository;
import org.uniquindio.edu.co.escuela.services.interfaces.AlumnoService;

import java.util.ArrayList;
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
    public List<AlumnoDTO> listarAlumnos() {
        ArrayList<AlumnoDTO> listAlumnos = new ArrayList<>();

        for(Alumno alumno: alumnoRepository.findAll()){

            listAlumnos.add(
                    new AlumnoDTO(
                            alumno.getNombre(),
                            alumno.getApellido(),
                            alumno.getIdAlumno()
                    )
            );
        }


        return listAlumnos;

    }
}
