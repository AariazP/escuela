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

@IdClass(PreguntaExamenId.class)
public class PreguntaExamen {


    @Column(nullable=false)
    @EqualsAndHashCode.Include
    private Double porcentajeExamen;

    @Column
    @EqualsAndHashCode.Include
    private Integer tiempoPregunta;

    @Column(nullable=false)
    @EqualsAndHashCode.Include
    private char tieneTiempoMaximo;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pregunta")
    private Pregunta pregunta;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_examen")
    private Examen examen;
}
