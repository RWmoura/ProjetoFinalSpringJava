package com.example.projetospring.service;

import com.example.projetospring.model.Diretor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class DiretorService {
    private List<Diretor> diretores;

    public DiretorService() {
        this.diretores = new ArrayList<>();
    }

    public List<Diretor> getAllDiretores() {
        return this.diretores;
    }

    public Diretor getDiretorById(Long id) {
        for (Diretor diretor : diretores) {
            if (diretor.getId().equals(id)) {
                return diretor;
            }
        }
        return null;
    }

    public void addDiretor(Diretor diretor) {
        diretores.add(diretor);
    }

    public void updateDiretor(Diretor diretor) {
        for (int i = 0; i < diretores.size(); i++) {
            if (diretores.get(i).getId().equals(diretor.getId())) {
                diretores.set(i, diretor);
                return;
            }
        }
    }

    public void deleteDiretor(Long id) {
        diretores.removeIf(diretor -> diretor.getId().equals(id));
    }
}