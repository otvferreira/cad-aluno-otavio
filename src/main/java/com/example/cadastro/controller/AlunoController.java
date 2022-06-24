package com.example.cadastro.controller;

import com.example.cadastro.controller.dto.AlunoDto;
import com.example.cadastro.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("aluno")
public class AlunoController {

    @Autowired
    private AlunoService service;

    @PostMapping
    private ResponseEntity<Object> salvar(@RequestBody AlunoDto aluno){
        service.salvar(aluno);
        return ResponseEntity.ok("Aluno criado com sucesso");

    }
}
