package org.example;

public class SequenciaNumerosDois {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.print("(" + i + ", ");
            for (int j = 1; j <= 10; j++) {
                System.out.print(j);
                if (j < 10) {
                    System.out.print(" ");
                }
            }
            System.out.println(")");
        }
    }
}