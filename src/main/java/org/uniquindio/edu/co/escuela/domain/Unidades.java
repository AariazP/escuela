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
public class Unidades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long unidadId;

    @EqualsAndHashCode.Include
    @Column(nullable = false, length = 63)
    private String titulo;

    @EqualsAndHashCode.Include
    @Column(nullable = false, length = 63)
    private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "curso_id")
    @EqualsAndHashCode.Include
    private Curso curso;


}
