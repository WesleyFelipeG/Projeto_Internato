package com.example.Projeto_Internato.dto;

import lombok.Data;

@Data
public class RodizioAlunoRequestDTO {
    private Long rodizioId;
    private Long alunoId;
    private boolean confirmado;
}
