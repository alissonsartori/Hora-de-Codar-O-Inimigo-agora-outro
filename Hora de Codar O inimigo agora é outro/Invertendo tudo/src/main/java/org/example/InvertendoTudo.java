package org.example;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InvertendoTudo {

    public static boolean isNumeric(String str) {
        if (str == null) {
            return false;
        }
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            try {
                Integer.parseInt(str);
                return true;
            } catch (NumberFormatException e2) {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] entradas = new String[12];

        System.out.println("Informe doze elementos (podem ser números ou letras/palavras):");
        for (int i = 0; i < 12; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            entradas[i] = scanner.next();
        }
        scanner.nextLine();

        System.out.println("\nSaída 1: Elementos na ordem invertida da entrada:");
        for (int i = entradas.length - 1; i >= 0; i--) {
            System.out.print(entradas[i] + (i == 0 ? "" : ", "));
        }
        System.out.println();

        List<String> numeros = new ArrayList<>();
        List<String> naoNumeros = new ArrayList<>();

        for (String s : entradas) {
            if (isNumeric(s)) {
                numeros.add(s);
            } else {
                naoNumeros.add(s);
            }
        }
        Collections.reverse(numeros);
        Collections.reverse(naoNumeros);

        System.out.println("\nSaída 2: Elementos invertidos e separados por tipo (números primeiro, depois não-números):");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i) + (i == numeros.size() - 1 && naoNumeros.isEmpty() ? "" : ", "));
        }

        if (!numeros.isEmpty() && !naoNumeros.isEmpty()) {
            System.out.print(" - ");
        }

        for (int i = 0; i < naoNumeros.size(); i++) {
            System.out.print(naoNumeros.get(i) + (i == naoNumeros.size() - 1 ? "" : ", "));
        }
        System.out.println();
        scanner.close();
    }
}