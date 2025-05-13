package com.example.Projeto_Internato.repository;

import com.example.Projeto_Internato.LocalEspecialidade;
import com.example.Projeto_Internato.SemestreLetivo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LocalEspecialidadeRepository extends JpaRepository<LocalEspecialidade, Long> {
    List<LocalEspecialidade> findBySemestreLetivo(SemestreLetivo semestreLetivo);
}