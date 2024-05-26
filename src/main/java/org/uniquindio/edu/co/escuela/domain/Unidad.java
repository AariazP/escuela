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
public class Unidad {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "unidad_seq")
    @SequenceGenerator(name = "unidad_seq", sequenceName = "UNIDAD_SEQ", allocationSize = 1)
    @EqualsAndHashCode.Include
    private Long id_unidad;


    @EqualsAndHashCode.Include
    @Column(nullable = false, length = 63)
    private String titulo;

    @EqualsAndHashCode.Include
    @Column(nullable = false, length = 63)
    private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_curso")
    @EqualsAndHashCode.Include
    private Curso curso;

    @OneToMany(mappedBy = "unidad", fetch = FetchType.LAZY)
    private List<Tema> temas;

}
