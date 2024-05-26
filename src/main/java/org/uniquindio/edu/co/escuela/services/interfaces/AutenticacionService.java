package org.uniquindio.edu.co.escuela.services.interfaces;

import org.uniquindio.edu.co.escuela.DTO.LoginDTO;
import org.uniquindio.edu.co.escuela.DTO.TokenDTO;

public interface AutenticacionService {

    TokenDTO login(LoginDTO sesionDTO);

}
