package com.example.Projeto_Internato;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PeriodoAcademicoEspecialidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private PeriodoAcademico periodo;

    @ManyToOne
    private Especialidade especialidade;

    private Integer cargaHorariaObrigatoria;
}
