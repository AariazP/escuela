package org.uniquindio.edu.co.escuela.services.interfaces;

import org.uniquindio.edu.co.escuela.DTO.PreguntaBancoDTO;

import java.util.List;

public interface DocenteService {



    List<PreguntaBancoDTO> obtenerBancoPreguntas (Long id_tema);



}
