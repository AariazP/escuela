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
public class Alumno {

    //comentario de preuba
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long alumnoId;

    @Column(nullable = false, length = 63)
    @EqualsAndHashCode.Include
    private String nombre;

    @Column(nullable = false, length = 63)
    @EqualsAndHashCode.Include
    private String apellido;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "alumnos")
    private List<Grupo> grupos;

    @OneToMany(mappedBy = "alumno", fetch = FetchType.LAZY)
    private List<Nota> notas;

    @OneToMany(mappedBy = "alumno", fetch = FetchType.LAZY)
    private List<PresentacionExamen> examenes;
}
