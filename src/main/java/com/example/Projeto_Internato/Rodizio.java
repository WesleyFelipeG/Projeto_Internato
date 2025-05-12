package com.example.Projeto_Internato;

import com.example.Projeto_Internato.enums.Turno;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rodizio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private LocalEspecialidade localEspecialidade;

    @ManyToOne
    private Usuario preceptor;

    private LocalDate dataInicio;
    private LocalDate dataFim;

    @Enumerated(EnumType.STRING)
    private Turno turno;

    private Integer qtdVagas;
    private Integer cargaHorariaPlanejada;
}
