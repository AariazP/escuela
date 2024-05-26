package org.uniquindio.edu.co.escuela;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.uniquindio.edu.co.escuela.domain.Docente;
import org.uniquindio.edu.co.escuela.repositories.DocenteRepo;

@SpringBootTest
class EscuelaApplicationTests {


    @Autowired
    private DocenteRepo docenteRepo;


    @Test
    void contextLoads() {
    }

@Test
    void testConsultaDocentePorId() {
        // ID del docente que deseas consultar
        Long idDocente = 1L;

    // Realizar la consulta al repositorio
    Docente docente= docenteRepo.buscarPorId(idDocente).orElse(null);


    assert docente != null;
    System.out.println(docente.getNombre());
    }

}
