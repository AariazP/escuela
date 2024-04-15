package org.uniquindio.edu.co.escuela.servicios.interfaces;

import org.uniquindio.edu.co.escuela.DTO.PresentacionExamenDTO;
import org.uniquindio.edu.co.escuela.DTO.PresentacionPreguntaDTO;
import org.uniquindio.edu.co.escuela.domain.PresentacionExamen;

public interface AlumnoServicio {




    public Long presentarExamen (PresentacionExamenDTO presentacionExamenDTO);

    public Long presentarPregunta(PresentacionPreguntaDTO presentacionPreguntaDTO);

}
