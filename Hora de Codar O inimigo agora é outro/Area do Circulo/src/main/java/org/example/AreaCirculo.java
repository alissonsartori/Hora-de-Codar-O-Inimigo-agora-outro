package org.example;

// Arquivo: AreaCirculo.java
import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor do raio do círculo: ");
        double raio = scanner.nextDouble();
        //math igual aos outros maths soq usado no java
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do círculo é: " + area);
        scanner.close();
    }
}