package com.example.Projeto_Internato;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LocalEspecialidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private LocalParceiro local;

    @ManyToOne
    private Especialidade especialidade;

    private Integer qtdVagas;

    @ManyToOne
    private SemestreLetivo semestreLetivo;
}
