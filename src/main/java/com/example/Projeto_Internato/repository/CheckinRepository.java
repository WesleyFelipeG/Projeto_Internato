package com.example.Projeto_Internato.repository;

import com.example.Projeto_Internato.Checkin;
import com.example.Projeto_Internato.Usuario;
import com.example.Projeto_Internato.Rodizio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CheckinRepository extends JpaRepository<Checkin, Long> {
    List<Checkin> findByUsuario(Usuario usuario);
    List<Checkin> findByRodizio(Rodizio rodizio);
}