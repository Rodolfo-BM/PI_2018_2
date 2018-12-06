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

    public Conta() {
    }

    public Conta(String cpf, String senha, double renda) {
        this.cpf = cpf;
        this.senha = senha;
        this.renda = renda;
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

    @Override
    public String toString() {
        return "Conta{" + "id=" + id + ", cpf=" + cpf + ", senha=" + senha + ", renda=" + renda + '}';
    }
    
}
