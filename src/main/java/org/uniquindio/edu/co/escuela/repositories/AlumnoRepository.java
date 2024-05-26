package org.uniquindio.edu.co.escuela.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.uniquindio.edu.co.escuela.DTO.TokenDTO;
import org.uniquindio.edu.co.escuela.domain.Alumno;

import java.util.Map;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {



}
