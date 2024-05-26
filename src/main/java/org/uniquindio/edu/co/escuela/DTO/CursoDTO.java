package org.uniquindio.edu.co.escuela.DTO;

import java.util.List;

public record CursoDTO(


        Long cursoId,

        String nombre,

        String descripcion,

        List<GrupoDTO> grupos,

        List<UnidadesDTO> unidades


) {
}
