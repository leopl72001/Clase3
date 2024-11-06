import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("digita un numero para saber si es divisible por 2 o 7");
        num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("el numero es divisible de 2");
        } else if (num % 7 == 0) {
            System.out.println("el numero es divisible de 7");
        } else if (num % 2 == 0 && num % 7 == 0) {
            System.out.println("el numero es divisble de 7 y 2");
        } else {
            System.out.println("el numero no es divisible de 2 ni de 7");
        } input.close();
    }
}
