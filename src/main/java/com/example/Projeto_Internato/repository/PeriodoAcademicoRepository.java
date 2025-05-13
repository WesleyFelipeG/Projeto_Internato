package com.example.Projeto_Internato.repository;

import com.example.Projeto_Internato.PeriodoAcademico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PeriodoAcademicoRepository extends JpaRepository<PeriodoAcademico, Long> {
    Optional<PeriodoAcademico> findByNome(String nome);
}