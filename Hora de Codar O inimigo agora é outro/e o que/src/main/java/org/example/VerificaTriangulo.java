package org.example;

import java.util.Scanner;

public class VerificaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a medida do lado A: ");
        double a = scanner.nextDouble();
        System.out.print("Informe a medida do lado B: ");
        double b = scanner.nextDouble();
        System.out.print("Informe a medida do lado C: ");
        double c = scanner.nextDouble();

        if (a > 0 && b > 0 && c > 0 &&
                a < (b + c) &&
                b < (a + c) &&
                c < (a + b)) {
            System.out.println("Os valores informados FORMAM um triângulo.");
        } else {
            System.out.println("Os valores informados NÃO FORMAM um triângulo.");
        }

        scanner.close();
    }
}