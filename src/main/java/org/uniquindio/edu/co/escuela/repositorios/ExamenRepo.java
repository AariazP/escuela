package org.uniquindio.edu.co.escuela.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uniquindio.edu.co.escuela.domain.Examen;

public interface ExamenRepo extends JpaRepository<Examen,Long> {
}
