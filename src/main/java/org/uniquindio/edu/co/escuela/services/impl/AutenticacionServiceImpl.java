package org.uniquindio.edu.co.escuela.services.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.uniquindio.edu.co.escuela.DTO.LoginDTO;
import org.uniquindio.edu.co.escuela.DTO.TokenDTO;
import org.uniquindio.edu.co.escuela.services.interfaces.AutenticacionService;

@AllArgsConstructor
@Service
public class AutenticacionServiceImpl implements AutenticacionService {


    private final EntityManager entityManager;

    @Transactional
    @Override
    public TokenDTO login(LoginDTO user) {

        StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("login");

        storedProcedure.registerStoredProcedureParameter("email", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("password", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("p_id_usuario", Integer.class, ParameterMode.OUT);
        storedProcedure.registerStoredProcedureParameter("p_email", String.class, ParameterMode.OUT);

        storedProcedure.setParameter("email", user.email());
        storedProcedure.setParameter("password", user.password());

        storedProcedure.execute();

        Integer idUsuario = (Integer) storedProcedure.getOutputParameterValue("p_id_usuario");
        String email = (String) storedProcedure.getOutputParameterValue("p_email");

        return new TokenDTO(idUsuario, email);
    }



}
