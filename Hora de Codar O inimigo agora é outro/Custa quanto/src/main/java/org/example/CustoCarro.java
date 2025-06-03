package org.example;

import java.util.Scanner;

public class CustoCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PERCENTUAL_DISTRIBUIDOR = 0.28;
        final double PERCENTUAL_IMPOSTOS = 0.45;

        System.out.print("Informe o custo de fábrica do carro: R$ ");
        double custoFabrica = scanner.nextDouble();

        double valorDistribuidor = custoFabrica * PERCENTUAL_DISTRIBUIDOR;
        double valorImpostos = custoFabrica * PERCENTUAL_IMPOSTOS;
        double custoFinalConsumidor = custoFabrica + valorDistribuidor + valorImpostos;

        System.out.println("\n--- Detalhamento do Custo ---");
        System.out.printf("Custo de Fábrica: R$ %.2f\n", custoFabrica);
        System.out.printf("Percentual do Distribuidor (28%%): R$ %.2f\n", valorDistribuidor);
        System.out.printf("Impostos (45%% sobre fábrica): R$ %.2f\n", valorImpostos);
        System.out.printf("Custo Final ao Consumidor: R$ %.2f\n", custoFinalConsumidor);

        scanner.close();
    }
}