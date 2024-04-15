package org.uniquindio.edu.co.escuela.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uniquindio.edu.co.escuela.domain.Grupo;

public interface GrupoRepo extends JpaRepository<Grupo,Long> {
}
