package org.example;

import java.util.Scanner;
import java.util.Arrays;

public class SomaDoisMaioresCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[5];

        System.out.print("Informe o primeiro valor: ");
        valores[0] = scanner.nextDouble();
        System.out.print("Informe o segundo valor: ");
        valores[1] = scanner.nextDouble();
        System.out.print("Informe o terceiro valor: ");
        valores[2] = scanner.nextDouble();
        System.out.print("Informe o quarto valor: ");
        valores[3] = scanner.nextDouble();
        System.out.print("Informe o quinto valor: ");
        valores[4] = scanner.nextDouble();

        Arrays.sort(valores);

        double somaDosMaiores = valores[3] + valores[4];

        System.out.println("A soma dos dois maiores valores é: " + somaDosMaiores);
        scanner.close();
    }
}