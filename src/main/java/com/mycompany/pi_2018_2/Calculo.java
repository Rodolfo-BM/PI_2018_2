package com.mycompany.pi_2018_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculo {

    Scanner ler = new Scanner(System.in);

    public ArrayList<Double> Price() {

        ArrayList<Double> price = new ArrayList();
        double salario;
        double pagando;
        double pv;
        int n;
        double i;
        i = 0.15;
        //System.out.println("Salario");
        //salario = ler.nextDouble();
        //System.out.println("Pagando");
        //pagando = ler.nextDouble();
        System.out.println("Emprestimo");
        pv = ler.nextDouble();
        System.out.println("Parcelas");
        n = ler.nextInt();
        double pmt = pv * ((i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1));
        double si;
        double sf = pv;
        double juros;
        double amort;
        //Calculo por linha
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
}
