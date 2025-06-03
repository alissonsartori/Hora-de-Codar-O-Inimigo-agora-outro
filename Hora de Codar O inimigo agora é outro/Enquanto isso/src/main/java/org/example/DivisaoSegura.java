package org.example;

import java.util.Scanner;

public class DivisaoSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        double valor1 = scanner.nextDouble();
        double valor2;

        do {
            System.out.print("Informe o segundo valor (deve ser positivo): ");
            valor2 = scanner.nextDouble();
            if (valor2 <= 0) {
                System.out.println("Valor inválido. O segundo valor não pode ser zero ou negativo.");
            }
        } while (valor2 <= 0);

        double resultado = valor1 / valor2;
        System.out.println("O resultado da divisão de " + valor1 + " por " + valor2 + " é: " + resultado);
        scanner.close();
    }
}