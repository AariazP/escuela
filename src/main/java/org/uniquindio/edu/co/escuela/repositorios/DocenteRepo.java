package org.uniquindio.edu.co.escuela.repositorios;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.uniquindio.edu.co.escuela.domain.Docente;

import java.util.Optional;

@Repository
public interface DocenteRepo extends JpaRepository<Docente,Long> {

    @Query("select d from Docente d where d.idDocente = :id")
    Optional<Docente> buscarPorId(Long id);



}
