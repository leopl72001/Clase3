import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        do {
            System.out.println("Ingrese un número para saber si es positivo o negativo (ingrese 0 para terminar):");
            num = input.nextInt();

            if (num > 0) {
                System.out.println("El número es positivo.");
            } else if (num < 0) {
                System.out.println("El número es negativo.");
            } else {
                System.out.println("Se terminó el programa.");
            }

        } while (num != 0); 

        input.close();
    }
}
