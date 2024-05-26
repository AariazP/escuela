package org.uniquindio.edu.co.escuela.domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@Entity
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PresentacionPregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "presentacion_pregunta_seq")
    @SequenceGenerator(name = "presentacion_pregunta_seq", sequenceName = "PRESENTACION_PREGUNTA_SEQ", allocationSize = 1)
    @EqualsAndHashCode.Include
    private Long idPresentacionPregunta;


    @Column(nullable=false)
    @EqualsAndHashCode.Include
    private char respuestaCorrecta;




    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_presentacion_examen")
    private PresentacionExamen presentacionExamen;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pregunta")
    private Pregunta pregunta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_respuesta")
    private Respuesta respuesta;

}

