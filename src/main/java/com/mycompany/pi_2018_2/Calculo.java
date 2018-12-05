package com.mycompany.pi_2018_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculo {

    Scanner ler = new Scanner(System.in);
    //Declaração

    double salario;
    double pagando;
    double pv;
    int n;
    double i;

    double pmt;
    double si;
    double sf;
    double juros;
    double amort;

    //Metodo Price
    public ArrayList<Double> Price() {
        System.out.println("PRICE");
        ArrayList<Double> price = new ArrayList();

        //System.out.println("Salario");
        //salario = ler.nextDouble();
        //System.out.println("Pagando");
        //pagando = ler.nextDouble();
        System.out.println("Emprestimo");
        pv = ler.nextDouble();
        System.out.println("Parcelas");
        n = ler.nextInt();
        System.out.println("Taxa");
        i = ler.nextDouble()/100;
        //Calculo PMT
        pmt = pv * ((i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1));

        //Calculo por linha
        sf = pv;
        for (int j = n; j > 0; j--) {
            price.clear();
            si = sf;
            juros = si * i;
            amort = pmt - juros;
            sf = si - amort;
            price.add(si);
            price.add(juros);
            price.add(amort);
            price.add(pmt);
            price.add(sf);

            //Saida de Array formatada
            for (double d : price) {
                System.out.printf("%6.2f ", d);
            }
            System.out.println();
        }

        return price;
    }

    public Tabela tabelaPrice(double emprestimo, int parcelas, double taxa) {
        Tabela price = new Tabela();
        price.setTipo("price");

        price.setPv(emprestimo);
        price.setN(parcelas);
        price.setI(taxa/100);
        
        //Calculo PMT
        pmt = pv * ((i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1));

        //Calculo por linha
        sf = pv;
        for (int j = n; j > 0; j--) {
            si = sf;
            juros = si * i;
            amort = pmt - juros;
            sf = si - amort;
            
            price.getSi().add(si);
            price.getSi().add(juros);
            price.getSi().add(amort);
            price.getSi().add(pmt);
            price.getSi().add(sf);
        }
        return price;
    }
    
    //Metodo SAC
    public ArrayList<Double> Sac() {
        System.out.println("SAC");
        ArrayList<Double> sac = new ArrayList();
        //Entrada
        System.out.println("Emprestimo");
        pv = ler.nextDouble();
        System.out.println("Parcelas");
        n = ler.nextInt();
        System.out.println("Taxa");
        i = ler.nextDouble()/100;

        //Calculo da Amortização
        amort = pv / n;

        //Calculo por Linha
        sf = pv;
        for (int j = n; j > 0; j--) {
            sac.clear();
            si = sf;
            juros = si * i;
            pmt = juros + amort;
            sf = si - amort;
            sac.add(si);
            sac.add(juros);
            sac.add(amort);
            sac.add(pmt);
            sac.add(sf);

            //Saida de Array formatada
            for (double d : sac) {
                System.out.printf("%6.2f ", d);
            }
            System.out.println();
        }
        return sac;
    }
    
    public Tabela tabelaSac(double emprestimo, int parcelas, double taxa) {
        Tabela sac = new Tabela();
        sac.setTipo("sac");
        
        sac.setPv(emprestimo);
        sac.setN(parcelas);
        sac.setI(taxa);

        //Calculo da Amortização
        amort = pv / n;

        //Calculo por Linha
        sf = pv;
        for (int j = n; j > 0; j--) {
            si = sf;
            juros = si * i;
            pmt = juros + amort;
            sf = si - amort;
            
            sac.getSi().add(si);
            sac.getJuros().add(juros);
            sac.getAmort().add(amort);
            sac.getPmt().add(pmt);
            sac.getSf().add(sf);
        }
        
        return sac;
    }
}
