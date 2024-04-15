package org.uniquindio.edu.co.escuela.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uniquindio.edu.co.escuela.domain.Docente;

public interface DocenteRepo extends JpaRepository<Docente,Long> {
}
