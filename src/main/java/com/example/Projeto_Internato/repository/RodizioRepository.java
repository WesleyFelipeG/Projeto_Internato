package com.example.Projeto_Internato.repository;

import com.example.Projeto_Internato.Rodizio;
import com.example.Projeto_Internato.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RodizioRepository extends JpaRepository<Rodizio, Long> {
    List<Rodizio> findByPreceptor(Usuario preceptor);
}
