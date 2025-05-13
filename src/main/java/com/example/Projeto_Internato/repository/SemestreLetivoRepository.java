package com.example.Projeto_Internato.repository;

import com.example.Projeto_Internato.SemestreLetivo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SemestreLetivoRepository extends JpaRepository<SemestreLetivo, Long> {
    List<SemestreLetivo> findByAtivoTrue();
}