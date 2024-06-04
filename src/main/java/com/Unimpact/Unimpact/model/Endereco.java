package com.Unimpact.Unimpact.model;

public class Endereco {
    private String cep;
    private String rua;
    private String estado;
    private String bairro;
    private String numero;
    private String complemento;

    // Construtor
    public Endereco(String cep, String rua, String estado, String bairro, String numero, String complemento) {
        this.cep = cep;
        this.rua = rua;
        this.estado = estado;
        this.bairro = bairro;
        this.numero = numero;
        this.complemento = complemento;
    }

    // Getters e Setters
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}

