package org.example;

import java.util.Scanner;

public class MaiorDeQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o primeiro valor: ");
        double valor1 = scanner.nextDouble();
        System.out.print("Informe o segundo valor: ");
        double valor2 = scanner.nextDouble();
        System.out.print("Informe o terceiro valor: ");
        double valor3 = scanner.nextDouble();
        System.out.print("Informe o quarto valor: ");
        double valor4 = scanner.nextDouble();

        double maior = valor1;

        if (valor2 > maior) {
            maior = valor2;
        }
        if (valor3 > maior) {
            maior = valor3;
        }
        if (valor4 > maior) {
            maior = valor4;
        }

        System.out.println("O maior valor é: " + maior);
        scanner.close();
    }
}