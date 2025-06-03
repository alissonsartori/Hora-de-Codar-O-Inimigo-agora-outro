package org.example;
import java.util.Scanner;

public class HelloClarice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o seu nome: ");
        String nomeDoUsuario = scanner.nextLine();
        System.out.println("Olá, " + nomeDoUsuario);
        scanner.close();
    }
}