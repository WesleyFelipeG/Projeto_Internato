package com.example.Projeto_Internato;

import com.example.Projeto_Internato.enums.TipoUsuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;

    @Enumerated(EnumType.STRING)
    private TipoUsuario tipo; // COORDENADOR, ALUNO, etc.

    @ManyToOne
    private PeriodoAcademico periodo;

    @ManyToMany
    private List<Especialidade> especialidades;
}
