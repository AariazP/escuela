package org.uniquindio.edu.co.escuela.domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@Entity
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class BloqueHorario {

    //hora inicio, hora fin, dia y lugar


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bloque_seq")
    @SequenceGenerator(name = "bloque_seq", sequenceName = "BLOQUE_SEQ", allocationSize = 1)
    @EqualsAndHashCode.Include
    private Long id_bloque_horario;


    @Column( length = 63)
    @EqualsAndHashCode.Include
    private String lugar;

    @Column
    @EqualsAndHashCode.Include
    private char dia;

    @Column
    @EqualsAndHashCode.Include
    private Timestamp horaInicio;

    @Column
    @EqualsAndHashCode.Include
    private Timestamp horaFin;

    @ManyToMany(mappedBy = "horarios", fetch = FetchType.LAZY)
    private List<Grupo> horarios;
}
