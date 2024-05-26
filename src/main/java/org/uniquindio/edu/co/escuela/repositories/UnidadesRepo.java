package org.uniquindio.edu.co.escuela.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uniquindio.edu.co.escuela.domain.Unidad;

public interface UnidadesRepo extends JpaRepository<Unidad, Long> {
}