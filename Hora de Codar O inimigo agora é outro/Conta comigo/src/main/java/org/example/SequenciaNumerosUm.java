package org.example;

public class SequenciaNumerosUm {
    public static void main(String[] args) {
        int inicioNumeroSequencia = 1;
        for (int i = 1; i <= 20; i++) {
            System.out.print("(" + i + ", ");
            for (int j = 0; j < 10; j++) {
                System.out.print(inicioNumeroSequencia + j);
                if (j < 9) {
                    System.out.print(" ");
                }
            }
            System.out.println(")");
            inicioNumeroSequencia += 10;
        }
    }
}