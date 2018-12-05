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
    
    private String cpf;
    private String senha;
    private String renda;

    public Conta() {
    }

    public Conta(String cpf, String senha, String renda) {
        this.cpf = cpf;
        this.senha = senha;
        this.renda = renda;
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

    public String getRenda() {
        return renda;
    }

    public void setRenda(String renda) {
        this.renda = renda;
    }

    @Override
    public String toString() {
        return "Conta{" + "cpf=" + cpf + ", senha=" + senha + ", renda=" + renda + '}';
    }
    
    
    
}
