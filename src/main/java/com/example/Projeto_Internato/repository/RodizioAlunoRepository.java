package com.example.Projeto_Internato.repository;

import com.example.Projeto_Internato.RodizioAluno;
import com.example.Projeto_Internato.RodizioAlunoId;
import com.example.Projeto_Internato.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RodizioAlunoRepository extends JpaRepository<RodizioAluno, RodizioAlunoId> {
    List<RodizioAluno> findByAluno(Usuario aluno);
}