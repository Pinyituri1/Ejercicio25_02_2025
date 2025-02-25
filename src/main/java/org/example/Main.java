package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Juego de dados
        int victoriasJugador = 0, victoriasComputadora = 0;
        for (int i = 0; i < 5; i++) {
            int dadoJugador = random.nextInt(6) + 1;
            int dadoComputadora = random.nextInt(6) + 1;
            System.out.println("Ronda " + (i + 1) + " - Jugador: " + dadoJugador + " vs Computadora: " + dadoComputadora);
            if (dadoJugador > dadoComputadora) {
                victoriasJugador++;
            } else if (dadoComputadora > dadoJugador) {
                victoriasComputadora++;
            }
        }
        System.out.println("Resultado final - Jugador: " + victoriasJugador + " | Computadora: " + victoriasComputadora);

        scanner.close();
    }
}
