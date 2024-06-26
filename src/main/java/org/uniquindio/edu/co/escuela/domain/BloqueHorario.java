package org.uniquindio.edu.co.escuela.domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long bloqueId;

    @Column(nullable = false, length = 63)
    @EqualsAndHashCode.Include
    private String lugar;

    @Column(nullable = false)
    @EqualsAndHashCode.Include
    private char dia;

    @Column(nullable = false)
    @EqualsAndHashCode.Include
    private Timestamp horaInicio;

    @Column(nullable = false)
    @EqualsAndHashCode.Include
    private Timestamp horaFin;

    @ManyToMany(mappedBy = "horarios", fetch = FetchType.LAZY)
    private List<Grupo> horarios;
}
