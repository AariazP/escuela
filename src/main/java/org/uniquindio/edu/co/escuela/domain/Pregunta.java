package org.uniquindio.edu.co.escuela.domain;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;
@Setter
@NoArgsConstructor
@SuperBuilder
@Entity
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Pregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pregunta_seq")
    @SequenceGenerator(name = "pregunta_seq", sequenceName = "PREGUNTA_SEQ", allocationSize = 1)
    @EqualsAndHashCode.Include
    private Long idPregunta;

    @Column(nullable = false, length = 63)
    @EqualsAndHashCode.Include
    private String estado;

    @Column(nullable = false, length = 300)
    @EqualsAndHashCode.Include
    private String enunciado;

    @Column(nullable = false)
    private Character esPublica;

    @Column(nullable = false, length = 63)
    private String tipoPregunta;

    // Relación para subpreguntas
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pregunta_compuesta") // Nombre de la columna que referencia a la pregunta padre
    private Pregunta preguntaPadre;

    @OneToMany(mappedBy = "preguntaPadre", fetch = FetchType.LAZY)
    private List<Pregunta> subPreguntas;

    @OneToMany(mappedBy = "pregunta", fetch = FetchType.LAZY)
    private List<Respuesta> respuestas;

    @OneToMany(mappedBy = "pregunta", fetch = FetchType.LAZY)
    private List<PresentacionPregunta> presentacionesPregunta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_docente")
    private Docente docente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tema")
    private Tema tema;


    @OneToMany(mappedBy = "pregunta", fetch = FetchType.LAZY)
    private List<PreguntaExamen> preguntasExamen;
}
