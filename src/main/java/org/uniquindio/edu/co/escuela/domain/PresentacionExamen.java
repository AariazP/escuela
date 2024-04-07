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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long presentacionId;

    @Column(nullable=false)
    @EqualsAndHashCode.Include
    private Integer tiempo;

    @Column(nullable=false)
    @EqualsAndHashCode.Include
    private boolean presentado;

    @Column(nullable=false)
    @EqualsAndHashCode.Include
    private Double calificacion;

    @Column(nullable=false, length=12)
    @EqualsAndHashCode.Include
    private Double ipSource;

    @Column(nullable=false)
    @EqualsAndHashCode.Include
    private LocalDate fechaPresentacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "alumno_id")
    private  Alumno alumno;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "examen_id")
    private Examen examen;

    @OneToMany(mappedBy = "presentacionExamen", fetch = FetchType.LAZY)
    private List<PresentacionPregunta> respuestas;


}
