import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tamaño;

        System.out.print("Ingresa el tamaño del diamante (número impar positivo): ");
        tamaño = input.nextInt();

        if (tamaño <= 0 || tamaño % 2 == 0) {
            System.out.println("El tamaño ingresado no es válido. Debe ser un número entero positivo impar.");
        } else {
            for (int i = 1; i <= tamaño; i += 2) {
                for (int j = 0; j < (tamaño - i) / 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i = tamaño - 2; i >= 1; i -= 2) {
                for (int j = 0; j < (tamaño - i) / 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        input.close();
    }
}
