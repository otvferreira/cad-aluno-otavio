package com.example.cadastro.controller.dto;

import lombok.Data;

@Data
public class AlunoDto {

    private Long id;
    private String nome;
    private String telefone;
    private String email;

    public AlunoDto(Long id, String nome, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

}
