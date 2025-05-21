package com.example.Projeto_Internato.dto;

import com.example.Projeto_Internato.enums.TipoUsuario;
import java.util.List;

public record UsuarioRequestDTO(
    String nome,
    String email,
    TipoUsuario tipo,
    Long periodoId,
    List<Long> especialidadeIds
) {}
