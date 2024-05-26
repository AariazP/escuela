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
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "docente_seq")
    @SequenceGenerator(name = "docente_seq", sequenceName = "DOCENTE_SEQ", allocationSize = 1)
    @EqualsAndHashCode.Include
    private Integer idDocente;


    @Column(nullable = false, length = 63)
    @EqualsAndHashCode.Include
    private String nombre;

    @Column(nullable = false, length = 63)
    @EqualsAndHashCode.Include
    private String apellido;

    @Column(nullable = false, length = 63)
    @EqualsAndHashCode.Include
    private String identificacion;

    @OneToMany(mappedBy = "docente", fetch = FetchType.LAZY)
    private List<Grupo> grupos;

    @OneToMany(mappedBy = "docente", fetch = FetchType.LAZY)
    private List<Examen> examenes;

    @OneToMany(mappedBy = "docente", fetch = FetchType.LAZY)
    private List<Pregunta> preguntas;
}
