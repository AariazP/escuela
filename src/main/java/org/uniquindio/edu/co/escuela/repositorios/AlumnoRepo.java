package org.uniquindio.edu.co.escuela.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uniquindio.edu.co.escuela.domain.Alumno;

public interface AlumnoRepo extends JpaRepository<Alumno, Long> {

}
