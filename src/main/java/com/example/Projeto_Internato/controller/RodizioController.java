package com.example.Projeto_Internato.controller;

import com.example.Projeto_Internato.dto.RodizioRequestDTO;
import com.example.Projeto_Internato.dto.RodizioResponseDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/rodizios")
public class RodizioController {

    @PostMapping
    public RodizioResponseDTO criarRodizio(@RequestBody RodizioRequestDTO dto) {
        return null;
    }

    @GetMapping
    public List<RodizioResponseDTO> listarRodizios() {
        return List.of();
    }

    @GetMapping("/{id}")
    public RodizioResponseDTO buscarRodizio(@PathVariable Long id) {
        return null;
    }

    @PutMapping("/{id}")
    public RodizioResponseDTO atualizarRodizio(@PathVariable Long id, @RequestBody RodizioRequestDTO dto) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletarRodizio(@PathVariable Long id) {
    }
}
