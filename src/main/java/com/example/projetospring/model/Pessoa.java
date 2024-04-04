package com.example.projetospring.model;

public class Pessoa {
    private Long id;
    private String nome;
    private String dataNascimento;
    private String cpf;

    public Pessoa(String id, String nome, String dataNascimento, String cpf) {
        if (nome == null) {
            throw new IllegalArgumentException("O nome não pode ser nulo.");
        }
        this.nome = nome;
        this.id = Long.valueOf(id);
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

