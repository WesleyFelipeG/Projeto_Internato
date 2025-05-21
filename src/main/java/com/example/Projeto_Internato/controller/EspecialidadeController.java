package com.example.Projeto_Internato.controller;

import com.example.Projeto_Internato.dto.EspecialidadeRequestDTO;
import com.example.Projeto_Internato.dto.EspecialidadeResponseDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/especialidades")
public class EspecialidadeController {

    @PostMapping
    public EspecialidadeResponseDTO criarEspecialidade(@RequestBody EspecialidadeRequestDTO dto) {
        return null;
    }

    @GetMapping
    public List<EspecialidadeResponseDTO> listarEspecialidades() {
        return List.of();
    }

    @GetMapping("/{id}")
    public EspecialidadeResponseDTO buscarEspecialidade(@PathVariable Long id) {
        return null;
    }

    @PutMapping("/{id}")
    public EspecialidadeResponseDTO atualizarEspecialidade(@PathVariable Long id, @RequestBody EspecialidadeRequestDTO dto) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletarEspecialidade(@PathVariable Long id) {
    }
}
