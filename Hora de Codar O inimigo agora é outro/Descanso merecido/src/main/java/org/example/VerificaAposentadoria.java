package org.example;

import java.util.Scanner;
import java.time.Year;

public class VerificaAposentadoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anoAtual = Year.now().getValue();

        System.out.print("Informe o código do empregado: ");
        int codigoEmpregado = scanner.nextInt();

        System.out.print("Informe o ano de nascimento do empregado: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Informe o ano de ingresso do empregado na empresa: ");
        int anoIngresso = scanner.nextInt();

        int idade = anoAtual - anoNascimento;
        int tempoTrabalho = anoAtual - anoIngresso;

        System.out.println("\n--- Dados do Empregado ---");
        System.out.println("Código: " + codigoEmpregado);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Tempo de trabalho na empresa: " + tempoTrabalho + " anos");

        boolean qualificado = false;

        if (idade >= 65) {
            qualificado = true;
        } else if (tempoTrabalho >= 30) {
            qualificado = true;
        } else if (idade >= 60 && tempoTrabalho >= 25) {
            qualificado = true;
        }

        if (qualificado) {
            System.out.println("Situação: Requerer aposentadoria");
        } else {
            System.out.println("Situação: Não requerer aposentadoria");
        }

        scanner.close();
    }
}