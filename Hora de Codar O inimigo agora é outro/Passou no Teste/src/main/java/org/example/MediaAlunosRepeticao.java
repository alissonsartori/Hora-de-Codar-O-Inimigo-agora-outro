package org.example;

import java.util.Scanner;

public class MediaAlunosRepeticao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alunosAprovados = 0;
        String continuar;

        do {
            double somaNotas = 0;
            System.out.println("\nCalculando média do aluno:");
            for (int i = 0; i < 6; i++) {
                System.out.print("Informe a nota " + (i + 1) + ": ");
                somaNotas += scanner.nextDouble();
            }
            scanner.nextLine();

            double mediaFinal = somaNotas / 6;
            System.out.printf("Média final do aluno: %.2f\n", mediaFinal);

            if (mediaFinal >= 6.5) {
                System.out.println("Aluno APROVADO!");
                alunosAprovados++;
            } else {
                System.out.println("Aluno REPROVADO.");
            }

            System.out.print("Calcular a média de outro aluno (Sim/Não)? ");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("S") || continuar.equalsIgnoreCase("Sim"));

        System.out.println("\nPrograma encerrado.");
        System.out.println("Total de alunos aprovados: " + alunosAprovados);
        scanner.close();
    }
}