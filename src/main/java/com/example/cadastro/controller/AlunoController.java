package com.example.cadastro.controller;

import com.example.cadastro.controller.dto.AlunoDto;
import com.example.cadastro.model.AlunoEntity;
import com.example.cadastro.repository.AlunoRepository;
import com.example.cadastro.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoService service;

    @Autowired
    private AlunoRepository alunoRepository;

    @PostMapping("/novo_aluno")
    private ResponseEntity<Object> salvar(@RequestBody AlunoDto aluno){
        service.salvar(aluno);
        return ResponseEntity.ok("Aluno criado com sucesso");

    }

    @GetMapping("/todos_alunos")
    public ResponseEntity<List<AlunoDto>> listarAlunos() {
        List<AlunoEntity> alunos = alunoRepository.findAll();
        List<AlunoDto> alunosResponse = alunos.stream()
                .map(aluno -> new AlunoDto(aluno.getId(), aluno.getNome(), aluno.getTelefone(), aluno.getEmail()))
                .collect(Collectors.toList());
        return ResponseEntity.ok(alunosResponse);
    }

}
