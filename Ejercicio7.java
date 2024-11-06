import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        System.out.println("------------------------------------------");
        System.out.println("          Forma un triangulo");
        System.out.println("------------------------------------------");
        System.out.println("Digita 3 numeros para formar un triangulo");
        System.out.print("Digita un 1er numero:");
        num1 = input.nextInt();
        System.out.print("Digita un 2do numero:");
        num2 = input.nextInt();
        System.out.print("Digita un 3er numero:");
        num3 = input.nextInt();

        input.nextLine();

        if (num1 == num2 && num1 == num3) {
            System.out.println("¡¡los 3 numeros forman un triangulo¡¡");
            System.out.println("                                          ");
            System.out.println("                  *                       ");
            System.out.println("                 ***                       ");
            System.out.println("                *****                       ");
            System.out.println("               *******                       ");
            System.out.println("              *********                      ");
            System.out.println("             ***********                      ");
            System.out.println("            *************                      ");
        } else {
            System.out.println("tus 3 numero no forman un triangulo F");
        } input.close();

    }
}
