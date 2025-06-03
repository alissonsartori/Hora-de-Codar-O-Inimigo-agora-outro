package org.example;

import java.util.Scanner;
import java.util.ArrayList;

public class MediaDezValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> valores = new ArrayList<>();
        double soma = 0;

        System.out.println("Informe 10 valores:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            double valor = scanner.nextDouble();
            valores.add(valor);
            soma += valor;
        }

        System.out.println("\nNúmeros informados:");
        for (double valor : valores) {
            System.out.print(valor + " ");
        }

        double media = soma / 10;
        System.out.println("\n\nA média aritmética dos valores é: " + media);
        scanner.close();
    }
}