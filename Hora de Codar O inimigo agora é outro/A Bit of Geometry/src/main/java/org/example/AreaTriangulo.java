package org.example;

// Arquivo: AreaTriangulo.java
import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor da base do triângulo: ");
        double base = scanner.nextDouble();
        System.out.print("Informe o valor da altura do triângulo: ");
        double altura = scanner.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("A área do triângulo é: " + area);
        scanner.close();
    }
}