import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        var counter = 0;

        System.out.println("ingresa solo numeros negativo y cuando quieras terminar "
                + " el programa digita un postivo");

        do {
            System.out.println("ingresa otro numero negativo");
            num = input.nextInt();

            if (num < 0) {
                counter++;
                System.out.println("el numero es: " + num);
            } else {
                System.out.println("digitaste el numero " + num + " para cerrar " +
                        "programa fueron " + counter + " intentos");

            }
        } while (num < 0);
        input.close();
    }
}
