package org.example;

import java.util.Scanner;
import java.util.Arrays;

public class SomaDoisMaioresTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[3];

        System.out.print("Informe o primeiro valor: ");
        valores[0] = scanner.nextDouble();
        System.out.print("Informe o segundo valor: ");
        valores[1] = scanner.nextDouble();
        System.out.print("Informe o terceiro valor: ");
        valores[2] = scanner.nextDouble();

        Arrays.sort(valores);

        double somaDosMaiores = valores[1] + valores[2];

        System.out.println("A soma dos dois maiores valores é: " + somaDosMaiores);
        scanner.close();
    }
}