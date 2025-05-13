package com.example.Projeto_Internato.repository;

import com.example.Projeto_Internato.Usuario;
import com.example.Projeto_Internato.enums.TipoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByEmail(String email);
    List<Usuario> findByTipo(TipoUsuario tipo);
}