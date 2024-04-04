package com.example.projetospring.model;

import java.util.List;
import java.util.UUID;

public class Escola {
    private String id;
    private String nome;
    private Diretor diretor;
    private List<Professor> professores;
    private List<Aluno> alunos;

    public Escola(String nome, Diretor diretor, List<Professor> professores, List<Aluno> alunos) {
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.diretor = diretor;
        this.professores = professores;
        this.alunos = alunos;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Diretor getDiretores() {
        return diretor;
    }

    public void setDiretores(Diretor diretor) {
        this.diretor = diretor;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }


}
