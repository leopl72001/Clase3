import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        System.out.println("ingresa un 1er numero");
        num1 = input.nextInt();

        System.out.println("ingresa un 2do numero");
        num2 = input.nextInt();

        System.out.println("ingresa un 3er numero");
        num3 = input.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            if (num2 >= num3) {
                System.out.println(num1 + ", " + num2 + ", " + num3);
            } else {
                System.out.println(num1 + ", " + num3 + "," + num2);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            if (num1 >= num3) {
                System.out.println(num2 + ", " + num1 + ", " + num3);
            } else {
                System.out.println(num2 + ", " + num3 + ", " + num1);
            }
        } else {
            if (num2 >= num1) {
                System.out.println(num3 + ", " + num2 + ", " + num1);
            } else {
                System.out.println(num3 + ", " + num1 + ", " + num2);
            }
        }
        input.close();
    }
}