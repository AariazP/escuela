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
public class PresentacionExamen {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "presentacion_examen_seq")
    @SequenceGenerator(name = "presentacion_examen_seq", sequenceName = "PRESENTACION_EXAMEN_SEQ", allocationSize = 1)
    @EqualsAndHashCode.Include
    private Long idPresentacionExamen;


    @Column(nullable=false)
    @EqualsAndHashCode.Include
    private Integer tiempo;

    @Column(nullable=false)
    @EqualsAndHashCode.Include
    private char terminado;

    @Column
    @EqualsAndHashCode.Include
    private Float calificacion;

    @Column(length=12)
    @EqualsAndHashCode.Include
    private String ipSource;

    @Column
    @EqualsAndHashCode.Include
    private LocalDate fecha_hora_presentacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_alumno")
    private  Alumno alumno;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_examen")
    private Examen examen;

    @OneToMany(mappedBy = "presentacionExamen", fetch = FetchType.LAZY)
    private List<PresentacionPregunta> respuestas;


}
