package org.uniquindio.edu.co.escuela.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uniquindio.edu.co.escuela.domain.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {

}
