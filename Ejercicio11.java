import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        // se piden tres numeros para ordenarlos de formar ascendete
        System.out.println("digita 3 numeros para ordenarlos de forma ascendente");
        System.out.println("Digita el 1er numero");
        num1 = input.nextInt();
        System.out.println("Digita el 2do numero");
        num2 = input.nextInt();
        System.out.println("Digita el 3er numero");
        num3 = input.nextInt();

        // se ordenan lo numero de menor a mayor sin importar el odern de digitacion
        if (num1 < num2 && num1 < num3) {
            if (num2 < num3) {
                System.out.println("El orden es " + num1 + ", " +
                        num2 + ", " + num3);
            } else {
                System.out.println("El orden es " + num1 + ", " + num3 + ", " + num2);
            }
        } else if (num2 < num1 && num2 < num3) {
            if (num1 < num3) {
                System.out.println("El orden es " + num2 + ", " + num1 + ", " + num3);
            } else {
                System.out.println("El orden es " + num2 + ", " + num3 + ", " + num1);
            }

        } else {
            if (num1 < num2) {
                System.out.println("El orden es " + num3 + ", " + num1 + ", " + num2);
            } else {
                System.out.println("El orden es " + num3 + ", " + num2 + ", " + num1);
            }
        }
        input.close();
    }
}
