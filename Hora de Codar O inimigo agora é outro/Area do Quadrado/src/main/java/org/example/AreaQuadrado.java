package org.example;

// Arquivo: AreaQuadrado.java
import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor do lado do quadrado: ");
        double lado = scanner.nextDouble();
        double area = lado * lado;
        System.out.println("A área do quadrado é: " + area);
        scanner.close();
    }
}