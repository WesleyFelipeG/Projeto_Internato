package com.example.Projeto_Internato.dto;

import lombok.Data;

@Data
public class PeriodoAcademicoEspecialidadeResponseDTO {
    private Long id;
    private Long periodoId;
    private Long especialidadeId;
    private Integer cargaHorariaObrigatoria;
}
