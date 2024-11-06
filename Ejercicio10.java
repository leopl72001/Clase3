import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte mes;

        // tabla de los meses
        System.out.println("|-------------------------------- |");
        System.out.println("|          Meses del año          |");
        System.out.println("|---------------------------------|");
        System.out.println("|           Mes          |  Dias  |");
        System.out.println("|---------------------------------|");
        System.out.println("| 1, 3, 5, 7, 8, 10 y 12 |   31   |");
        System.out.println("|---------------------------------|");
        System.out.println("|       4, 6, 9, 11      |   30   |");
        System.out.println("|---------------------------------|");
        System.out.println("|            2           |   28   |");
        System.out.println("|---------------------------------|");
        System.out.println("");
        System.out.println("ingresa un número entero entre 1 y 12."
                + " Este número corresponde con un mes "
                + "(1 enero, 2 febrero, ..., 12 diciembre).");
        mes = input.nextByte();

        // donde se define cuantos dias tiene el mes digitado
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8
                || mes == 10 || mes == 12) {
            System.out.print("El mes " + mes + " tiene 31 dias");
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            System.out.print("El mes " + mes + " tiene 30 dias");
        } else if (mes == 2) {
            System.out.print("El mes " + mes + " tiene 28 dias");
        } else {
            System.out.println("El numero ingresado supera los 12");
        } input.close();
    }
}
