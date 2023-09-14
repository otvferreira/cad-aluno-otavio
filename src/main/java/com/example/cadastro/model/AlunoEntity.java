package com.example.cadastro.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table(name = "tb_aluno")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AlunoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String telefone;

    @Column(nullable = false)
    @Email
    private String email;
}
