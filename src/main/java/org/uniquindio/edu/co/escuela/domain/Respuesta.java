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
public class Respuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long respuestaId;

    @Column(nullable = false, length = 63)
    @EqualsAndHashCode.Include
    private String descripcion;

    @Column(nullable = false, length = 63)
    @EqualsAndHashCode.Include
    private boolean esVerdadera;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pregunta_id")
    private Pregunta pregunta;

    @OneToMany(mappedBy = "respuesta", fetch = FetchType.LAZY)
    private List<PresentacionPregunta> presentacionesPregunta;

}
