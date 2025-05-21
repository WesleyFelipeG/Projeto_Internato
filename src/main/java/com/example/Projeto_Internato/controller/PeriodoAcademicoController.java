package com.example.Projeto_Internato.controller;

import com.example.Projeto_Internato.dto.PeriodoAcademicoRequestDTO;
import com.example.Projeto_Internato.dto.PeriodoAcademicoResponseDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/periodos-academicos")
public class PeriodoAcademicoController {

    @PostMapping
    public PeriodoAcademicoResponseDTO criarPeriodo(@RequestBody PeriodoAcademicoRequestDTO dto) {
        return null;
    }

    @GetMapping
    public List<PeriodoAcademicoResponseDTO> listarPeriodos() {
        return List.of();
    }

    @GetMapping("/{id}")
    public PeriodoAcademicoResponseDTO buscarPeriodo(@PathVariable Long id) {
        return null;
    }

    @PutMapping("/{id}")
    public PeriodoAcademicoResponseDTO atualizarPeriodo(@PathVariable Long id, @RequestBody PeriodoAcademicoRequestDTO dto) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletarPeriodo(@PathVariable Long id) {
    }
}
