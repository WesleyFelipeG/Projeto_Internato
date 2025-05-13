package com.example.Projeto_Internato.repository;

import com.example.Projeto_Internato.LocalParceiro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LocalParceiroRepository extends JpaRepository<LocalParceiro, Long> {
    Optional<LocalParceiro> findBySigla(String sigla);
}