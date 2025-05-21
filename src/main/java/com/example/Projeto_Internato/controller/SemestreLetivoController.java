package com.example.Projeto_Internato.controller;

import com.example.Projeto_Internato.dto.SemestreLetivoRequestDTO;
import com.example.Projeto_Internato.dto.SemestreLetivoResponseDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/semestres-letivos")
public class SemestreLetivoController {

    @PostMapping
    public SemestreLetivoResponseDTO criarSemestreLetivo(@RequestBody SemestreLetivoRequestDTO dto) {
        return null;
    }

    @GetMapping
    public List<SemestreLetivoResponseDTO> listarSemestresLetivos() {
        return List.of();
    }

    @GetMapping("/{id}")
    public SemestreLetivoResponseDTO buscarSemestreLetivo(@PathVariable Long id) {
        return null;
    }

    @PutMapping("/{id}")
    public SemestreLetivoResponseDTO atualizarSemestreLetivo(@PathVariable Long id, @RequestBody SemestreLetivoRequestDTO dto) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletarSemestreLetivo(@PathVariable Long id) {
    }
}
