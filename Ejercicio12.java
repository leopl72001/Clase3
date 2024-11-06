import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int peso;

        System.out.println("ingresa el peso de la sandida para saber si se puede " +
                "dividir en parte iguales");
        peso = input.nextInt();

        if (peso % 2 == 0) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
        input.close();
    }
}