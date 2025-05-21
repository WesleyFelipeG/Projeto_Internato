package com.example.Projeto_Internato.controller;

import com.example.Projeto_Internato.dto.LocalEspecialidadeRequestDTO;
import com.example.Projeto_Internato.dto.LocalEspecialidadeResponseDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/locais-especialidades")
public class LocalEspecialidadeController {

    @PostMapping
    public LocalEspecialidadeResponseDTO criarLocalEspecialidade(@RequestBody LocalEspecialidadeRequestDTO dto) {
        return null;
    }

    @GetMapping
    public List<LocalEspecialidadeResponseDTO> listarLocaisEspecialidades() {
        return List.of();
    }

    @GetMapping("/{id}")
    public LocalEspecialidadeResponseDTO buscarLocalEspecialidade(@PathVariable Long id) {
        return null;
    }

    @PutMapping("/{id}")
    public LocalEspecialidadeResponseDTO atualizarLocalEspecialidade(@PathVariable Long id, @RequestBody LocalEspecialidadeRequestDTO dto) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletarLocalEspecialidade(@PathVariable Long id) {
    }
}
