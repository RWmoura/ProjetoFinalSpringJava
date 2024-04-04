package com.example.projetospring.controller;

import com.example.projetospring.model.Diretor;
import com.example.projetospring.service.DiretorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diretores")
public class DiretorController {

    @Autowired
    private DiretorService diretorService;

    @GetMapping("/{id}")
    public ResponseEntity<Diretor> getDiretorById(@PathVariable Long id) {
        Diretor diretor = diretorService.getDiretorById(id);
        if (diretor != null) {
            return ResponseEntity.ok(diretor);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Diretor> addDiretor(@RequestBody Diretor diretor) {
        diretorService.addDiretor(diretor);
        return ResponseEntity.status(HttpStatus.CREATED).body(diretor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateDiretor(@PathVariable Long id, @RequestBody Diretor diretor) {
        if (diretorService.getDiretorById(id) != null) {
            diretor.setId((id));
            diretorService.updateDiretor(diretor);
            return ResponseEntity.noContent().build();
        } else {
            String mensagem = "O id informado não existe";
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(mensagem);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDiretor(@PathVariable Long id) {
        if (diretorService.getDiretorById(id) != null) {
            diretorService.deleteDiretor(id);
            return ResponseEntity.noContent().build();
        } else {
            String mensagem = "O id informado não existe";
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(mensagem);
        }
    }

    @GetMapping
    public ResponseEntity<List<Diretor>> getAllDiretores() {
        List<Diretor> diretores = diretorService.getAllDiretores();
        return ResponseEntity.ok(diretores);
    }
}
