package org.uniquindio.edu.co.escuela.services.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;
import org.uniquindio.edu.co.escuela.DTO.*;
import org.uniquindio.edu.co.escuela.domain.Alumno;
import org.uniquindio.edu.co.escuela.repositories.AlumnoRepository;
import org.uniquindio.edu.co.escuela.services.interfaces.AlumnoService;

import java.util.ArrayList;
import java.util.List;


@Service
@AllArgsConstructor
public class AlumnoServiceImp implements AlumnoService {

    private final AlumnoRepository alumnoRepository;
    private final EntityManager entityManager;





    @Transactional
    public TokenDTO login(SesionDTO user) {
        // Crear una consulta para el procedimiento almacenado
        StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("login");


        // Registrar los parámetros de entrada y salida del procedimiento almacenado
        storedProcedure.registerStoredProcedureParameter("email", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("password", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("p_id_usuario", Integer.class, ParameterMode.OUT);
        storedProcedure.registerStoredProcedureParameter("p_email", String.class, ParameterMode.OUT);
        // Establecer los valores de los parámetros de entrada
        storedProcedure.setParameter("email", user.email());
        storedProcedure.setParameter("password", user.password());

        // Ejecutar el procedimiento almacenado
        storedProcedure.execute();



        // Obtener los valores de los parámetros de salida
        Integer idUsuario = (Integer) storedProcedure.getOutputParameterValue("p_id_usuario");
        String email = (String) storedProcedure.getOutputParameterValue("p_email");

        // Retornar un objeto TokenDTO con los valores obtenidos
        return new TokenDTO(idUsuario, email);
    }


    @Transactional
    public String guardarPregunta(PreguntaDTO preguntaDTO) {
        // Crear una consulta para el procedimiento almacenado
        StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("crear_pregunta");


        // Registrar los parámetros de entrada y salida del procedimiento almacenado
        storedProcedure.registerStoredProcedureParameter("v_enunciado", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("v_es_publica", Character.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("v_tipo_pregunta", String.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("v_id_tema", Integer.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("v_id_docente", Integer.class, ParameterMode.IN);
        storedProcedure.registerStoredProcedureParameter("v_mensaje", String.class, ParameterMode.OUT);


        // Establecer los valores de los parámetros de entrada
        storedProcedure.setParameter("v_enunciado", preguntaDTO.enunciado());
        storedProcedure.setParameter("v_es_publica", preguntaDTO.es_publica());
        storedProcedure.setParameter("v_tipo_pregunta", preguntaDTO.tipo_pregunta());
        storedProcedure.setParameter("v_id_tema", preguntaDTO.id_tema());
        storedProcedure.setParameter("v_id_docente", preguntaDTO.id_docente());

        // Ejecutar el procedimiento almacenado
        storedProcedure.execute();

        String mensaje = (String) storedProcedure.getOutputParameterValue("v_mensaje");

        return mensaje;

    }


}
