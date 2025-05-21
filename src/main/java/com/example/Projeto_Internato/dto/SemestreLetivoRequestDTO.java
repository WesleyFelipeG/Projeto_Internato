package com.example.Projeto_Internato.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class SemestreLetivoRequestDTO {
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private boolean ativo;
    private boolean encerrado;
}
