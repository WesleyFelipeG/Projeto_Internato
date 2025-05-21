package com.example.Projeto_Internato.dto;

import com.example.Projeto_Internato.enums.TipoUsuario;
import java.util.List;

public record UsuarioResponseDTO(
    Long id,
    String nome,
    String email,
    TipoUsuario tipo,
    String periodoNome,
    List<String> especialidades
) {}
