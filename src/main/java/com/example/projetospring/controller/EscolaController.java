package com.example.projetospring.controller;

import com.example.projetospring.model.Escola;
import com.example.projetospring.service.EscolaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/escolas")
public class EscolaController {
    private final EscolaService escolaService;
    @Autowired
    public EscolaController(EscolaService escolaService) {
        this.escolaService = escolaService;
    }

    @PostMapping
    public void adicionarEscola(@RequestBody Escola escola) {
        escolaService.adicionarEscola(escola);
    }

    @GetMapping
    public List<Escola> listarEscolas() {
        return escolaService.listarEscolas();
    }

    @PutMapping("/{id}")
    public void atualizarEscola(@PathVariable String id, @RequestBody Escola escolaAtualizada) {
        escolaAtualizada.setId(id);
        escolaService.atualizarEscola(escolaAtualizada);
    }

    @DeleteMapping("/{id}")
    public void excluirEscola(@PathVariable String id) {
        escolaService.excluirEscola(id);
    }
}


