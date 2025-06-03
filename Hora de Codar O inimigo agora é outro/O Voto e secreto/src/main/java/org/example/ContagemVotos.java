package org.example;

import java.util.Scanner;

public class ContagemVotos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número total de eleitores do município: ");
        int totalEleitores = scanner.nextInt();

        System.out.print("Informe o percentual de votos BRANCOS (ex: 10 para 10%): ");
        double percentualBrancos = scanner.nextDouble();

        System.out.print("Informe o percentual de votos VÁLIDOS (ex: 75 para 75%): ");
        double percentualValidos = scanner.nextDouble();

        System.out.print("Informe o percentual de votos NULOS (ex: 15 para 15%): ");
        double percentualNulos = scanner.nextDouble();

        if ((percentualBrancos + percentualValidos + percentualNulos) > 100.01 ||
                percentualBrancos < 0 || percentualValidos < 0 || percentualNulos < 0) {
            System.out.println("Os percentuais informados são inválidos (soma excede 100% ou são negativos).");
        } else {
            int votosBrancos = (int) Math.round((percentualBrancos / 100.0) * totalEleitores);
            int votosValidos = (int) Math.round((percentualValidos / 100.0) * totalEleitores);
            int votosNulos = (int) Math.round((percentualNulos / 100.0) * totalEleitores);

            System.out.println("\nResultados da Votação:");
            System.out.println("Total de eleitores: " + totalEleitores);
            System.out.println("-------------------------------------------------");
            System.out.println("Votos Brancos: " + votosBrancos + " (Representa " + String.format("%.2f", percentualBrancos) + "% do total)");
            System.out.println("Votos Válidos: " + votosValidos + " (Representa " + String.format("%.2f", percentualValidos) + "% do total)");
            System.out.println("Votos Nulos: " + votosNulos + " (Representa " + String.format("%.2f", percentualNulos) + "% do total)");
            System.out.println("-------------------------------------------------");


        }
        scanner.close();
    }
}