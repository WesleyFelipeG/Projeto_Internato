package com.example.Projeto_Internato.dto;

import com.example.Projeto_Internato.enums.Turno;
import java.time.LocalDate;

public record RodizioResponseDTO(
    Long id,
    String nomePreceptor,
    String nomeLocalEspecialidade,
    LocalDate dataInicio,
    LocalDate dataFim,
    Turno turno,
    Integer qtdVagas,
    Integer cargaHorariaPlanejada
) {}
