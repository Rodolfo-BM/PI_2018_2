/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pi_2018_2;

/**
 *
 * @author rodol
 */
class Conta {
    
    private int id;
    private String cpf;
    private String senha;
    private double renda;
    private double divida;
    private String condicao;

    public Conta() {
    }

    public Conta(String cpf, String senha, double renda, double divida, String condicao) {
        this.cpf = cpf;
        this.senha = senha;
        this.renda = renda;
        this.divida = divida;
        this.condicao = condicao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public double getDivida() {
        return divida;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    @Override
    public String toString() {
        return "Conta{" + "id=" + id + ", cpf=" + cpf + ", senha=" + senha + ", renda=" + renda + ", divida=" + divida + ", condicao=" + condicao + '}';
    }
    
}
