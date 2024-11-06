import java.util.Scanner;
import java.util.Random;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        String[] opciones = { "Piedra", "Papel", "Tijera" };
        int intentosRestantes = 3;
        int puntosUsuario = 0;
        int puntosPC = 0;

        do {
            System.out.println("\n¡Bienvenido al juego Piedra, Papel o Tijera!");
            System.out.println("¡Tienes 3 intentos!");

            puntosUsuario = 0;
            puntosPC = 0;

            for (int i = 0; i < intentosRestantes; i++) {
                System.out.println("\nIntento #" + (i + 1));

                System.out.println("Escribe: 0 para Piedra, 1 para Papel, 2 para Tijera");
                int eleccionUsuario = input.nextInt();

                if (eleccionUsuario < 0 || eleccionUsuario > 2) {
                    System.out.println("Entrada no válida, por favor ingresa un número entre 0 y 2.");
                    i--;
                    continue;
                }

                int eleccionPC = rand.nextInt(3);
                System.out.println("La computadora eligió: " + opciones[eleccionPC]);

                if (eleccionUsuario == eleccionPC) {
                    System.out.println("Empate!");
                } else if ((eleccionUsuario == 0 && eleccionPC == 2) ||
                        (eleccionUsuario == 1 && eleccionPC == 0) ||
                        (eleccionUsuario == 2 && eleccionPC == 1)) {
                    System.out.println("¡Ganaste esta ronda!");
                    puntosUsuario++;
                } else {
                    System.out.println("¡Perdiste esta ronda!");
                    puntosPC++;
                }
            }

            System.out.println("\nResultados finales:");
            System.out.println("Puntos del usuario: " + puntosUsuario);
            System.out.println("Puntos de la computadora: " + puntosPC);

            if (puntosUsuario > puntosPC) {
                System.out.println("¡Felicidades! Ganaste el juego.");
            } else if (puntosUsuario < puntosPC) {
                System.out.println("Lo siento, perdiste el juego.");
            } else {
                System.out.println("El juego terminó en empate.");
            }

            System.out.println("\n¿Quieres jugar de nuevo? (s/n): ");
            String respuesta = input.next();
            if (respuesta.equalsIgnoreCase("n")) {
                System.out.println("Gracias por jugar. ¡Hasta luego!");
                break;
            }

        } while (true);

        input.close();
    }
}