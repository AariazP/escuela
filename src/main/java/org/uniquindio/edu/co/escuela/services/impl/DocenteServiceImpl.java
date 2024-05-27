package org.uniquindio.edu.co.escuela.services.impl;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import oracle.jdbc.internal.OracleTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;
import org.uniquindio.edu.co.escuela.DTO.PreguntaBancoDTO;
import org.uniquindio.edu.co.escuela.services.interfaces.DocenteService;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class DocenteServiceImpl implements DocenteService {


    @Autowired
    private JdbcTemplate jdbcTemplate;

   @Override
    @Transactional
    public List<PreguntaBancoDTO> obtenerBancoPreguntas(Long id_tema) {
        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("obtener_banco_preguntas")
                .declareParameters(
                        new SqlParameter("v_id_tema", OracleTypes.NUMBER),
                        new SqlOutParameter("p_preguntas", OracleTypes.CURSOR)
                )
                .returningResultSet("p_preguntas", this::mapRowToPreguntaBancoDTO);

        Map<String, Object> result = jdbcCall.execute(new MapSqlParameterSource("v_id_tema", id_tema));

       System.out.println("llega hasta antes del return dentro del servicio docente");

        return (List<PreguntaBancoDTO>) result.get("p_preguntas");
    }

    private PreguntaBancoDTO mapRowToPreguntaBancoDTO(ResultSet rs, int rowNum) throws SQLException {
        return new PreguntaBancoDTO(
                rs.getLong("id_pregunta"),
                rs.getString("enunciado"),
                rs.getString("es_publica").charAt(0),
                rs.getString("tipo_pregunta"),
                rs.getLong("id_tema"),
                rs.getLong("id_docente")
        );
    }
}


