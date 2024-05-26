package org.uniquindio.edu.co.escuela.services.interfaces;

import org.uniquindio.edu.co.escuela.DTO.SesionDTO;
import org.uniquindio.edu.co.escuela.DTO.TokenDTO;

public interface AutenticacionServicio {

    TokenDTO login(SesionDTO sesionDTO) throws Exception;


}
