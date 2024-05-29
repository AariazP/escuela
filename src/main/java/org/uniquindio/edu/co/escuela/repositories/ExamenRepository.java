package org.uniquindio.edu.co.escuela.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.uniquindio.edu.co.escuela.DTO.TemasCursoDTO;
import org.uniquindio.edu.co.escuela.entities.Examen;

import java.util.List;

@Repository
public interface ExamenRepository extends JpaRepository<Examen, Long>{

    @Query(value = "SELECT ID_TEMA, TITULO FROM TEMA", nativeQuery = true)
    List<Object[]> obtenerCursos();
}
