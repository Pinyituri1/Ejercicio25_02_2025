package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int contadorJugador = 0, contadorComputadora = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Elige piedra (0), papel (1) o tijera (2): ");
            int eleccionJugador = scanner.nextInt();
            int eleccionComputadora = random.nextInt(3);

            String eleccionJugadorTexto = "";
            String eleccionComputadoraTexto = "";

            if (eleccionJugador == 0) eleccionJugadorTexto = "piedra";
            else if (eleccionJugador == 1) eleccionJugadorTexto = "papel";
            else if (eleccionJugador == 2) eleccionJugadorTexto = "tijera";

            if (eleccionComputadora == 0) eleccionComputadoraTexto = "piedra";
            else if (eleccionComputadora == 1) eleccionComputadoraTexto = "papel";
            else if (eleccionComputadora == 2) eleccionComputadoraTexto = "tijera";

            System.out.println("Jugador: " + eleccionJugadorTexto + " vs Computadora: " + eleccionComputadoraTexto);

            if (eleccionJugador == eleccionComputadora) {
                System.out.println("Empate!");
            } else if ((eleccionJugador == 0 && eleccionComputadora == 2) ||
                    (eleccionJugador == 1 && eleccionComputadora == 0) ||
                    (eleccionJugador == 2 && eleccionComputadora == 1)) {
                System.out.println("Gana el jugador!");
                contadorJugador++;
            } else {
                System.out.println("Gana la computadora!");
                contadorComputadora++;
            }
        }
        System.out.println("Resultado final - Jugador: " + contadorJugador + " | Computadora: " + contadorComputadora);

        scanner.close();
    }
}
