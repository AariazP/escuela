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
public class Tema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long temaId;

    @Column(nullable = false, length = 63)
    @EqualsAndHashCode.Include
    private String titulo;

    @Column(nullable = false, length = 63)
    @EqualsAndHashCode.Include
    private String descripcion;

    @OneToMany(mappedBy = "tema", fetch = FetchType.LAZY)
    private List<Examen> examenes;

    @OneToMany(mappedBy = "tema", fetch = FetchType.LAZY)
    private List<Pregunta> unidades;
}
