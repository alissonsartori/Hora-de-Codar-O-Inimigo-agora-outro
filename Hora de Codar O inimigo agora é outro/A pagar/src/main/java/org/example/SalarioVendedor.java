package org.example;

import java.util.Scanner;

public class SalarioVendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de carros vendidos: ");
        int numCarrosVendidos = scanner.nextInt();

        System.out.print("Informe o valor total das vendas: R$ ");
        double valorTotalVendas = scanner.nextDouble();

        System.out.print("Informe o salário fixo mensal do vendedor: R$ ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Informe a comissão fixa por carro vendido: R$ ");
        double comissaoFixaPorCarro = scanner.nextDouble();

        double comissaoTotalFixa = numCarrosVendidos * comissaoFixaPorCarro;
        double comissaoPercentualVendas = valorTotalVendas * 0.05;
        double salarioFinal = salarioFixo + comissaoTotalFixa + comissaoPercentualVendas;

        System.out.println("\n--- Detalhamento do Salário do Vendedor ---");
        System.out.printf("Salário Fixo Mensal: R$ %.2f\n", salarioFixo);
        System.out.printf("Número de Carros Vendidos: %d\n", numCarrosVendidos);
        System.out.printf("Comissão Fixa por Carro: R$ %.2f\n", comissaoFixaPorCarro);
        System.out.printf("Comissão Total Fixa (Carros Vendidos): R$ %.2f\n", comissaoTotalFixa);
        System.out.printf("Valor Total das Vendas: R$ %.2f\n", valorTotalVendas);
        System.out.printf("Comissão Percentual sobre Vendas (5%%): R$ %.2f\n", comissaoPercentualVendas);
        System.out.println("---------------------------------------------");
        System.out.printf("Salário Final do Vendedor: R$ %.2f\n", salarioFinal);

        if (numCarrosVendidos > 0) {
            System.out.println("\nDetalhamento da comissão por carro (exemplo, assumindo valor igual por carro para esta comissão):");
            for (int i = 1; i <= numCarrosVendidos; i++) {
                System.out.printf("Comissão fixa Carro %d: R$ %.2f\n", i, comissaoFixaPorCarro);
            }
        }


        scanner.close();
    }
}