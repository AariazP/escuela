package org.uniquindio.edu.co.escuela.domain;
import lombok.Getter;

import java.io.Serializable;
import java.util.Objects;


//Esta claseeee es solo para la clave primaria compuesta de presentación examen
@Getter
public class PreguntaExamenId implements Serializable {
    // Getters, setters, equals y hashCode
    private Long pregunta;
    private Long examen;

    public PreguntaExamenId() {}

    public PreguntaExamenId(Long pregunta, Long examen) {
        this.pregunta = pregunta;
        this.examen = examen;
    }

    public void setPregunta(Long pregunta) {
        this.pregunta = pregunta;
    }

    public void setExamen(Long examen) {
        this.examen = examen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PreguntaExamenId that = (PreguntaExamenId) o;
        return Objects.equals(pregunta, that.pregunta) && Objects.equals(examen, that.examen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pregunta, examen);
    }
}
