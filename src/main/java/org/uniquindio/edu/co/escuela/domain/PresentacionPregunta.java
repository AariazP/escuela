package org.uniquindio.edu.co.escuela.domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@Entity
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PresentacionPregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long presentacionPreguntaId;

    @Column(nullable=false)
    @EqualsAndHashCode.Include
    private boolean fueCorrecta;

    // Relación para subrespuestas
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "presentacion_pregunta_padre_id") // Nombre de la columna que referencia a la presentación pregunta padre
    private PresentacionPregunta presentacionPreguntaPadre;

    @OneToMany(mappedBy = "presentacionPreguntaPadre", fetch = FetchType.LAZY)
    private List<PresentacionPregunta> subRespuestas;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "presentacion_examen_id")
    private PresentacionExamen presentacionExamen;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pregunta_id")
    private Pregunta pregunta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "respuesta_id")
    private Respuesta respuesta;

}

