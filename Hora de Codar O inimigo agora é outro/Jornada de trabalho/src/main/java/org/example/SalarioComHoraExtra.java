package org.example;

import java.util.Scanner;

public class SalarioComHoraExtra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int horasSemanaisRegulares = 40;
        final int semanasNoMes = 4;
        final double adicionalHoraExtra = 0.50;

        System.out.print("Informe o número total de horas trabalhadas no mês: ");
        double horasTrabalhadasMes = scanner.nextDouble();

        System.out.print("Informe o salário por hora regular: R$ ");
        double salarioPorHoraRegular = scanner.nextDouble();

        double horasRegularesNoMes = horasSemanaisRegulares * semanasNoMes;
        double horasExtrasTrabalhadas = 0;
        double salarioHorasRegulares;
        double salarioHorasExtras = 0;

        if (horasTrabalhadasMes > horasRegularesNoMes) {
            horasExtrasTrabalhadas = horasTrabalhadasMes - horasRegularesNoMes;
            salarioHorasRegulares = horasRegularesNoMes * salarioPorHoraRegular;
            double valorHoraExtra = salarioPorHoraRegular * (1 + adicionalHoraExtra);
            salarioHorasExtras = horasExtrasTrabalhadas * valorHoraExtra;
        } else {
            salarioHorasRegulares = horasTrabalhadasMes * salarioPorHoraRegular;
        }

        double salarioTotal = salarioHorasRegulares + salarioHorasExtras;

        System.out.println("\n--- Cálculo do Salário ---");
        System.out.printf("Horas regulares no mês (base): %.2f horas\n", horasRegularesNoMes);
        System.out.printf("Total de horas trabalhadas no mês: %.2f horas\n", horasTrabalhadasMes);
        System.out.printf("Salário por hora regular: R$ %.2f\n", salarioPorHoraRegular);
        System.out.printf("Horas extras trabalhadas: %.2f horas\n", horasExtrasTrabalhadas);
        if (horasExtrasTrabalhadas > 0) {
            System.out.printf("Valor da hora extra: R$ %.2f\n", salarioPorHoraRegular * (1 + adicionalHoraExtra));
        }
        System.out.println("-----------------------------");
        System.out.printf("Salário referente às horas regulares: R$ %.2f\n", salarioHorasRegulares);
        System.out.printf("Salário referente às horas extras: R$ %.2f\n", salarioHorasExtras);
        System.out.printf("Salário Total do Funcionário: R$ %.2f\n", salarioTotal);

        scanner.close();
    }
}