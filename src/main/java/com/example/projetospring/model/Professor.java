package com.example.projetospring.model;

public class Professor extends Pessoa {
    private String disciplina;
    private double salario;
    private Escola escola;

    // Construtor
    public Professor(String id, String nome, String dataNascimento, String cpf, String disciplina, double salario, Escola escola) {
        super(id, nome, dataNascimento, cpf);
        this.disciplina = disciplina;
        this.salario = salario;
        this.escola = escola;
    }
    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }
}

