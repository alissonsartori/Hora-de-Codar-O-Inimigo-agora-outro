package org.example;

import java.util.Scanner;

public class NotaFiscal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Informe a quantidade adquirida: ");
        int quantidade = scanner.nextInt();

        System.out.print("Informe o preço unitário do produto: R$ ");
        double precoUnitario = scanner.nextDouble();

        double valorVenda = quantidade * precoUnitario;
        double percentualDesconto;
        double valorDesconto;

        if (quantidade <= 5) {
            percentualDesconto = 0.02;
        } else if (quantidade <= 10) {
            percentualDesconto = 0.03;
        } else {
            percentualDesconto = 0.05;
        }

        valorDesconto = valorVenda * percentualDesconto;
        double valorComDesconto = valorVenda - valorDesconto;
        double valorImposto = valorVenda * 0.20;
        double totalAPagar = valorVenda - valorDesconto;

        System.out.println("\n--- RECIBO / NOTA FISCAL ---");
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Quantidade: " + quantidade);
        System.out.printf("Preço Unitário: R$ %.2f\n", precoUnitario);
        System.out.println("---------------------------------");
        System.out.printf("Valor da Venda Bruto: R$ %.2f\n", valorVenda);
        System.out.printf("Percentual de Desconto Aplicado: %.0f%%\n", percentualDesconto * 100);
        System.out.printf("Valor do Desconto: R$ %.2f\n", valorDesconto);
        System.out.printf("Valor da Venda com Desconto: R$ %.2f\n", valorComDesconto);
        System.out.println("---------------------------------");
        System.out.printf("Imposto (20%% sobre valor bruto): R$ %.2f\n", valorImposto);
        System.out.println("---------------------------------");
        System.out.printf("Total a Pagar (Valor da Venda - Desconto): R$ %.2f\n", totalAPagar);
        System.out.println("---------------------------------");
        System.out.println("Obrigado pela compra!");

        scanner.close();
    }
}