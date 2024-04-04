package com.example.projetospring.service;

import com.example.projetospring.model.Aluno;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AlunoService {
    private List<Aluno> alunos;

    public AlunoService() {
        this.alunos = new ArrayList<>();
    }

    public List<Aluno> getAllAlunos() {
        return this.alunos;
    }

    public Aluno getAlunoById(Long id) {
        for (Aluno aluno : alunos) {
            if (aluno.getId().equals(id)) {
                return aluno;
            }
        }
        return null;
    }

    public void addAluno(Aluno aluno) {
        aluno.setId((long) (alunos.size() + 1));
        alunos.add(aluno);
    }

    public void updateAluno(Aluno aluno) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getId().equals(aluno.getId())) {
                alunos.set(i, aluno);
                return;
            }
        }
    }

    public void deleteAluno(Long id) {
        alunos.removeIf(aluno -> aluno.getId().equals(id));
    }
}


