package com.Unimpact.Unimpact.models;

public class Usuario {
    private String nome;
    private String cpf;
    private String rg;
    private String telefone1;
    private String telefone2;
    private Endereco endereco;
    private Login login;

    // Construtor
    public Usuario(String nome, String cpf, String rg, String telefone1, String telefone2, Endereco endereco, Login login) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.endereco = endereco;
        this.login = login;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
}
