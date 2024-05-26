package org.uniquindio.edu.co.escuela.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uniquindio.edu.co.escuela.domain.Curso;

public interface CursoRepo extends JpaRepository <Curso,Long> {
}
