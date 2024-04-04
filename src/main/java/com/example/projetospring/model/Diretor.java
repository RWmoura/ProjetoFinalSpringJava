package com.example.projetospring.model;

public class Diretor extends Pessoa {
    private String departamento;

    public Diretor(Long id, String nome, String dataNascimento, String cpf, String departamento) {
        super(String.valueOf(id), nome, dataNascimento, cpf);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
