package com.example.Projeto_Internato;

import com.example.Projeto_Internato.enums.StatusRodizio;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RodizioAluno {

    @EmbeddedId
    private RodizioAlunoId id;

    @ManyToOne
    @MapsId("rodizioId")
    private Rodizio rodizio;

    @ManyToOne
    @MapsId("alunoId")
    private Usuario aluno;

    @Enumerated(EnumType.STRING)
    private StatusRodizio status; // CONFIRMADO, FALTOU, etc.
}
