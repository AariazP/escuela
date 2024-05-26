package org.uniquindio.edu.co.escuela.services.impl;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.uniquindio.edu.co.escuela.DTO.SesionDTO;
import org.uniquindio.edu.co.escuela.DTO.TokenDTO;
import org.uniquindio.edu.co.escuela.repositories.DocenteRepo;
import org.uniquindio.edu.co.escuela.services.interfaces.AutenticacionServicio;

@AllArgsConstructor
@Service
public class AutenticacionServicioImpl implements AutenticacionServicio {



    @Autowired
    private DocenteRepo docenteRepo ;

    @Override
    public TokenDTO login(SesionDTO sesionDTO) throws Exception {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    return null;
    }
}
