import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.println("ingresa un numero: ");
        numero = input.nextInt();

        if (numero < 0) {
            System.out.println("el numero es negativo");
        } else {
            System.out.println("el numero es positivo");
        }
        input.close();
    }
}
