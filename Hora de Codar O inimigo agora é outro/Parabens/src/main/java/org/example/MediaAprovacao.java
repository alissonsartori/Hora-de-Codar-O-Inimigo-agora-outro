package org.example;

import java.util.Scanner;

public class MediaAprovacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaNotas = 0;

        System.out.println("Informe as 4 notas do aluno:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
        }

        double media = somaNotas / 4;
        System.out.println("A média do semestre é: " + media);

        if (media >= 6.0) {
            System.out.println("PARABÉNS! Você foi aprovado!");
        }
        scanner.close();
    }
}