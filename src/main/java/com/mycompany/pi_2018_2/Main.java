package com.mycompany.pi_2018_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("1-Price\n2-SAC");
        Calculo calculo = new Calculo();
        int a = ler.nextInt();
        if(a==1) calculo.Price();
        else calculo.Sac();
    }
    
}
