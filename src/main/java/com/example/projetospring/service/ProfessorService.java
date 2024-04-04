package com.example.projetospring.service;

import com.example.projetospring.model.Professor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProfessorService {
    private List<Professor> professores;

    public ProfessorService() {
        this.professores = new ArrayList<>();
    }

    public List<Professor> getAllProfessores() {
        return this.professores;
    }

    public Professor getProfessorById(Long id) {
        for (Professor professor : professores) {
            if (professor.getId().equals(id)) {
                return professor;
            }
        }
        return null;
    }

    public void addProfessor(Professor professor) {
        professores.add(professor);
    }

    public void updateProfessor(Professor professor) {
        for (int i = 0; i < professores.size(); i++) {
            if (professores.get(i).getId().equals(professor.getId())) {
                professores.set(i, professor);
                return;
            }
        }
    }

    public void deleteProfessor(Long id) {
        professores.removeIf(professor -> professor.getId().equals(id));
    }
}

