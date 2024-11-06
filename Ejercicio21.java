import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cantidad;
        int opcion;
        double millas = 1.60934;
        double kilometro = 0.621371;

        do {
            System.out.println("\nconvertidor de distacia");
            System.out.println("1. convertir km a mll");
            System.out.println("2. convertir mll a km");
            System.out.println("3. salir del programa");
            System.out.print("seleccione una opcion: ");

            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("digita la cantidad que quieres convertir a mll");
                    cantidad = input.nextDouble();
                    cantidad *= kilometro;
                    System.out.println("son: " + cantidad + " millas");
                    break;
                case 2:
                    System.out.println("digita la cantidad que quieres convertir a km");
                    cantidad = input.nextDouble();
                    cantidad *= millas;
                    System.out.println("son: " + cantidad + " kilometros");
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("digite solo numeros entero");
                    break;
            }
        } while (opcion != 3);
        input.close();
    }

}
