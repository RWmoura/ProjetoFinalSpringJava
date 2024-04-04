package com.example.projetospring.service;

import com.example.projetospring.model.Escola;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EscolaService {
    private final List<Escola> escolas;

    public EscolaService() {
        this.escolas = new ArrayList<>();
    }

    public void adicionarEscola(Escola escola) {
        this.escolas.add(escola);
    }

    public List<Escola> listarEscolas() {
        return this.escolas;
    }

    public void atualizarEscola(Escola escolaAtualizada) {
        for (int i = 0; i < escolas.size(); i++) {
            Escola escola = escolas.get(i);
            if (escola.getId().equals(escolaAtualizada.getId())) {
                escolas.set(i, escolaAtualizada);
                break;
            }
        }
    }

    public void excluirEscola(String id) {
        escolas.removeIf(escola -> escola.getId().equals(id));
    }
}

