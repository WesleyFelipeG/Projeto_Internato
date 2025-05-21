package com.example.Projeto_Internato.controller;

import com.example.Projeto_Internato.dto.RodizioAlunoRequestDTO;
import com.example.Projeto_Internato.dto.RodizioAlunoResponseDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/rodizio-alunos")
public class RodizioAlunoController {

    @PostMapping
    public RodizioAlunoResponseDTO criarRodizioAluno(@RequestBody RodizioAlunoRequestDTO dto) {
        return null;
    }

    @GetMapping
    public List<RodizioAlunoResponseDTO> listarRodizioAlunos() {
        return List.of();
    }

    @GetMapping("/{rodizioId}/{alunoId}")
    public RodizioAlunoResponseDTO buscarRodizioAluno(@PathVariable Long rodizioId, @PathVariable Long alunoId) {
        return null;
    }

    @PutMapping("/{rodizioId}/{alunoId}")
    public RodizioAlunoResponseDTO atualizarRodizioAluno(@PathVariable Long rodizioId, @PathVariable Long alunoId, @RequestBody RodizioAlunoRequestDTO dto) {
        return null;
    }

    @DeleteMapping("/{rodizioId}/{alunoId}")
    public void deletarRodizioAluno(@PathVariable Long rodizioId, @PathVariable Long alunoId) {
    }
}
