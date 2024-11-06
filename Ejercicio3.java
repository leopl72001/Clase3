import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("escribe un numero para determinar si es" +
                " o impar");
        num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("el numero es par");
        } else {
            System.out.println("el numero es impar");
        }
        input.close();
    }
}
