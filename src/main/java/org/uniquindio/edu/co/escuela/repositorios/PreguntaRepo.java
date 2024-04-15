package org.uniquindio.edu.co.escuela.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uniquindio.edu.co.escuela.domain.Pregunta;

public interface PreguntaRepo extends JpaRepository<Pregunta,Long> {
}
