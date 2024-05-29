package org.uniquindio.edu.co.escuela.services.interfaces;

import org.uniquindio.edu.co.escuela.DTO.*;

import java.util.Date;
import java.util.List;

public interface DocenteService {



    List<PreguntaBancoDTO> obtenerBancoPreguntas (Long id_tema);

    String crearRespuesta (String descripcion, Character esVerdadera, Long id_pregunta );

    String crearExamen (CrearExamenDTO examenDTO);

    String crearPregunta (String enunciado, Character es_publica, String tipoPregunta,
                          Integer id_tema, Integer id_docente);


    String calificarExamen (Long id_presentacion_examen);

    List <PreguntaBancoDTO> obtenerPreguntasDocente(Long id_docente);

    List <ExamenDTO> obtenerExamenesDocente (Long id_docente);

    String obtenerNombre(String id, String rol);

    List<CursoDTO> obtenerCursos(String id, String rol);

    List<TemasCursoDTO> obtenerTemasCurso(Integer id_curso);

}
