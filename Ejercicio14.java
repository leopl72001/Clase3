import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingrese un número para calcular su cubo (número negativo para salir): ");
            numero = input.nextInt();

            if (numero >= 0) {
                int cubo = numero * numero * numero;
                System.out.println("El cubo de " + numero + " es: " + cubo);
            }

        } while (numero >= 0);
        System.out.println("Programa finalizado.");
        input.close();
    }
}
