import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cantidad;

        //tabla de precios
        System.out.println("|-------------------------------- |");
        System.out.println("|       Tienda de camisas         |");
        System.out.println("|---------------------------------|");
        System.out.println("| Unidades  |  precio por unidad  |");
        System.out.println("|---------------------------------|");
        System.out.println("| [1 - 50]  |      $50.000        |");
        System.out.println("|---------------------------------|");
        System.out.println("|[51 - 100] |      $45.000        |");
        System.out.println("|---------------------------------|");
        System.out.println("|[101 - 150]|      $40.000        |");
        System.out.println("|---------------------------------|");
        System.out.println("|[151 - 200]|      $35.000        |");
        System.out.println("|---------------------------------|");
        System.out.println("|   > 200   |      $25.000        |");
        System.out.println("|---------------------------------|");
        System.out.println("");
        System.out.println("digita el valor de cuantas camisas quieres "
                + "comprar para calculuar cuantas te saldrian por unidad "
                + "dependiendo del la cantidad");
        cantidad = input.nextInt();

        //para hacer la cotizacion 
        if (cantidad <= 50) {
            cantidad *= 50000;
            System.out.println("por la cantida que digitaste por unidad te salen a 50.000"
                    + " para un total de: " + cantidad);
        } else if (cantidad <= 100) {
            cantidad *= 45000;
            System.out.println("por la cantida que digitaste por unidad te salen a 45.000"
                    + " para un total de: " + cantidad);
        } else if (cantidad <= 150) {
            cantidad *= 40000;
            System.out.println("por la cantida que digitaste por unidad te salen a 40.000"
                    + " para un total de: " + cantidad);
        } else if (cantidad <= 200) {
            cantidad *= 35000;
            System.out.println("por la cantida que digitaste por unidad te salen a 35.000"
                    + " para un total de: " + cantidad);
        } else {
            cantidad *= 25000;
            System.out.println("por la cantida que digitaste por unidad te salen a 25.000"
                    + " para un total de: " + cantidad);
        }
        input.close();
    }
}
