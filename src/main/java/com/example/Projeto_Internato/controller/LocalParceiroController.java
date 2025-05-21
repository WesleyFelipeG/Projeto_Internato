package com.example.Projeto_Internato.controller;

import com.example.Projeto_Internato.dto.LocalParceiroRequestDTO;
import com.example.Projeto_Internato.dto.LocalParceiroResponseDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/locais-parceiros")
public class LocalParceiroController {

    @PostMapping
    public LocalParceiroResponseDTO criarLocalParceiro(@RequestBody LocalParceiroRequestDTO dto) {
        return null;
    }

    @GetMapping
    public List<LocalParceiroResponseDTO> listarLocaisParceiros() {
        return List.of();
    }

    @GetMapping("/{id}")
    public LocalParceiroResponseDTO buscarLocalParceiro(@PathVariable Long id) {
        return null;
    }

    @PutMapping("/{id}")
    public LocalParceiroResponseDTO atualizarLocalParceiro(@PathVariable Long id, @RequestBody LocalParceiroRequestDTO dto) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletarLocalParceiro(@PathVariable Long id) {
    }
}
