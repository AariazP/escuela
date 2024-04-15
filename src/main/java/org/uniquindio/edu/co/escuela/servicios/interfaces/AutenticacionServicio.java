package org.uniquindio.edu.co.escuela.servicios.interfaces;

import org.uniquindio.edu.co.escuela.DTO.SesionDTO;
import org.uniquindio.edu.co.escuela.DTO.TokenDTO;

public interface AutenticacionServicio {

    TokenDTO login(SesionDTO sesionDTO) throws Exception;


}
