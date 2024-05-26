package org.uniquindio.edu.co.escuela.domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@Entity
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Examen {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "examen_seq")
    @SequenceGenerator(name = "examen_seq", sequenceName = "EXAMEN_SEQ", allocationSize = 1)
    @EqualsAndHashCode.Include
    private Long idExamen;


    @Column(nullable=false)
    @EqualsAndHashCode.Include
    private Integer tiempoMax;

    @Column(nullable=false)
    @EqualsAndHashCode.Include
    private Integer numeroPreguntas;

    @Column(nullable=false)
    @EqualsAndHashCode.Include
    private Double porcentajeCurso;

    @Column(nullable=false)
    @EqualsAndHashCode.Include
    private String nombre;


    @Column(nullable=false)
    @EqualsAndHashCode.Include
    private Double porcentajeAprobatorio;

    @Column(nullable=false)
    @EqualsAndHashCode.Include
    private LocalDate fechaHoraInicio;

    @Column(nullable=false)
    @EqualsAndHashCode.Include
    private LocalDate fechaHoraFin;

    @Column(nullable=false)
    @EqualsAndHashCode.Include
    private Integer numPreguntasAleatorias;

    @Column (nullable=false)
    @EqualsAndHashCode.Include
    private String estado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_grupo")
    private Grupo grupo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_docente")
    private Docente docente;

    @OneToMany(mappedBy = "examen", fetch = FetchType.LAZY)
    private List<PresentacionExamen> preguntas;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tema")
    private Tema tema;

    @OneToMany(mappedBy = "examen", fetch = FetchType.LAZY)
    private List<PreguntaExamen> preguntasExamen;


}
