package org.example;

import java.util.Scanner;
import java.util.ArrayList;

public class MediaEntreNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o primeiro número inteiro (menor): ");
        int num1 = scanner.nextInt();
        System.out.print("Informe o segundo número inteiro (maior): ");
        int num2 = scanner.nextInt();

        if (num1 >= num2) {
            System.out.println("Erro: O primeiro número deve ser menor que o segundo.");
        } else {
            ArrayList<Integer> numeros = new ArrayList<>();
            numeros.add(num1);

            long soma = num1;
            int contador = 1;

            System.out.print("Números inteiros entre " + num1 + " e " + num2 + " (inclusive): " + num1);

            for (int i = num1 + 1; i <= num2; i++) {
                System.out.print(", " + i);
                numeros.add(i);
                soma += i;
                contador++;
            }
            numeros.add(num2);

            System.out.println(); // Nova linha

            soma = 0;
            for (int num : numeros) {
                soma += num;
            }
            contador = numeros.size();


            if (contador > 0) {
                double media = (double) soma / contador;
                System.out.println("A média aritmética dos números (incluindo os informados e os entre eles) é: " + media);
            } else {
                System.out.println("Não há números para calcular a média ou os números são iguais.");
            }
        }
        scanner.close();
    }
}