package com.task4_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Введите массу");
        double M = scan.nextDouble();
        System.out.println("Введите высоту");
        double H = scan.nextDouble();

        PotentialEnergy E = new PotentialEnergy();
        E.setH(H);
        E.setM(M);
        PotentialEnergy.Show(E);
    }
}
