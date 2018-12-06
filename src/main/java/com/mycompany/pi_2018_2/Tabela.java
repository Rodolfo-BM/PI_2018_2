/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pi_2018_2;

import java.util.ArrayList;

/**
 *
 * @author rodol
 */
public class Tabela {

    Conta conta;
    String tipo;
    
    double pv;
    int n;
    double i;
    
    ArrayList<Double> si = new ArrayList<>();
    ArrayList<Double> juros = new ArrayList<>();
    ArrayList<Double> amort = new ArrayList<>();
    ArrayList<Double> pmt = new ArrayList<>();
    ArrayList<Double> sf = new ArrayList<>();

    public Tabela() {
        
    }

    public Tabela(Conta cona, String tipo, double pv, int n, double i, 
            ArrayList<Double> si, ArrayList<Double> juros, ArrayList<Double> amort,
            ArrayList<Double> pmt, ArrayList<Double> sf) {
        this.conta = cona;
        this.tipo = tipo;
        this.pv = pv;
        this.n = n;
        this.i = i;
        this.si = si;
        this.juros = juros;
        this.amort = amort;
        this.pmt = pmt;
        this.sf = sf;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta cona) {
        this.conta = cona;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPv() {
        return pv;
    }

    public void setPv(double pv) {
        this.pv = pv;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
    }

    public ArrayList<Double> getSi() {
        return si;
    }

    public void setSi(ArrayList<Double> si) {
        this.si = si;
    }

    public ArrayList<Double> getJuros() {
        return juros;
    }

    public void setJuros(ArrayList<Double> juros) {
        this.juros = juros;
    }

    public ArrayList<Double> getAmort() {
        return amort;
    }

    public void setAmort(ArrayList<Double> amort) {
        this.amort = amort;
    }

    public ArrayList<Double> getPmt() {
        return pmt;
    }

    public void setPmt(ArrayList<Double> pmt) {
        this.pmt = pmt;
    }

    public ArrayList<Double> getSf() {
        return sf;
    }

    public void setSf(ArrayList<Double> sf) {
        this.sf = sf;
    }

    @Override
    public String toString() {
        return "Tabela{" + "conta=" + conta + ", tipo=" + tipo + ", pv=" + pv + ", n=" + n + ", i=" + i + ", si=" + si + ", juros=" + juros + ", amort=" + amort + ", pmt=" + pmt + ", sf=" + sf + '}';
    }

    
    
    
    
    
}
