package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int votosCandidato1 = 0, votosCandidato2 = 0, votosCandidato3 = 0;
        int costoCandidato1 = 0, costoCandidato2 = 0, costoCandidato3 = 0;
        int totalVotos = 0;

        int costoInternet = 700000;
        int costoRadio = 200000;
        int costoTelevision = 600000;

        while (true) {
            System.out.println("\nElija una opción:");
            System.out.println("1. Votar por un candidato");
            System.out.println("2. Mostrar resultados");
            System.out.println("3. Vaciar urnas");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("Elija un candidato (1, 2, 3): ");
                int candidato = scanner.nextInt();
                int medioPublicidad = random.nextInt(3) + 1; // 1: Internet, 2: Radio, 3: Televisión
                int costo = 0;

                if (medioPublicidad == 1) costo = costoInternet;
                else if (medioPublicidad == 2) costo = costoRadio;
                else if (medioPublicidad == 3) costo = costoTelevision;

                if (candidato == 1) {
                    votosCandidato1++;
                    costoCandidato1 += costo;
                } else if (candidato == 2) {
                    votosCandidato2++;
                    costoCandidato2 += costo;
                } else if (candidato == 3) {
                    votosCandidato3++;
                    costoCandidato3 += costo;
                }
                totalVotos++;
                System.out.println("Voto registrado correctamente.");

            } else if (opcion == 2) {
                if (totalVotos == 0) {
                    System.out.println("No hay votos registrados.");
                    continue;
                }
                System.out.println("\nResultados de la elección:");
                System.out.println("Candidato 1: " + votosCandidato1 + " votos - Costo: $" + costoCandidato1);
                System.out.println("Candidato 2: " + votosCandidato2 + " votos - Costo: $" + costoCandidato2);
                System.out.println("Candidato 3: " + votosCandidato3 + " votos - Costo: $" + costoCandidato3);
                System.out.println("Total de votos: " + totalVotos);

                System.out.println("Porcentaje de votos:");
                System.out.println("Candidato 1: " + (votosCandidato1 * 100.0 / totalVotos) + "%");
                System.out.println("Candidato 2: " + (votosCandidato2 * 100.0 / totalVotos) + "%");
                System.out.println("Candidato 3: " + (votosCandidato3 * 100.0 / totalVotos) + "%");

                int costoTotal = costoCandidato1 + costoCandidato2 + costoCandidato3;
                System.out.println("Costo promedio de campaña: $" + (costoTotal / (double) totalVotos));

            } else if (opcion == 3) {
                votosCandidato1 = votosCandidato2 = votosCandidato3 = 0;
                costoCandidato1 = costoCandidato2 = costoCandidato3 = 0;
                totalVotos = 0;
                System.out.println("Urnas vaciadas correctamente.");

            } else if (opcion == 4) {
                System.out.println("Saliendo...");
                break;
            } else {
                System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}