package com.example.Projeto_Internato.repository;

import com.example.Projeto_Internato.PeriodoAcademicoEspecialidade;
import com.example.Projeto_Internato.PeriodoAcademico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PeriodoAcademicoEspecialidadeRepository extends JpaRepository<PeriodoAcademicoEspecialidade, Long> {
    List<PeriodoAcademicoEspecialidade> findByPeriodo(PeriodoAcademico periodo);
}