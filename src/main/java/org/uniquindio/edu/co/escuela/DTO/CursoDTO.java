package org.uniquindio.edu.co.escuela.DTO;

import org.uniquindio.edu.co.escuela.domain.Grupo;
import org.uniquindio.edu.co.escuela.domain.Unidades;

import java.util.List;

public record CursoDTO(


        Long cursoId,

        String nombre,

        String descripcion,

        List<GrupoDTO> grupos,

        List<UnidadesDTO> unidades


) {
}
