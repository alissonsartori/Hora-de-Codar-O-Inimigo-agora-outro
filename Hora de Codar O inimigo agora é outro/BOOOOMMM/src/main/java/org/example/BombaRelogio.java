package org.example;

public class BombaRelogio {
    public static void main(String[] args) {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // Pausa por 1 segundo (1000 milissegundos)
            } catch (InterruptedException e) {
                System.err.println("Contagem interrompida: " + e.getMessage());
            }
        }
        System.out.println("EXPLOSÃO");
    }
}