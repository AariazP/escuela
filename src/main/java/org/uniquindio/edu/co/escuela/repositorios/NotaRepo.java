package org.uniquindio.edu.co.escuela.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uniquindio.edu.co.escuela.domain.Nota;

public interface NotaRepo extends JpaRepository<Nota, Long> {
}
