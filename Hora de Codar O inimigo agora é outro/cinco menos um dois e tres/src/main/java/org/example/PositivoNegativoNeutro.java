package org.example;

import java.util.Scanner;

public class PositivoNegativoNeutro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um valor: ");
        double valor = scanner.nextDouble();

        if (valor > 0) {
            System.out.println("O valor informado é positivo.");
        } else if (valor < 0) {
            System.out.println("O valor informado é negativo.");
        } else {
            System.out.println("O valor informado é neutro.");
        }
        scanner.close();
    }
}