import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char letra;

        System.out.println("ingresa una letra para saber si es mayuscula " +
                "o minuscula");
        letra = input.next().charAt(0);
        if (Character.isUpperCase(letra)) {
            System.out.println("la letra es mayuscula");
        } else if (Character.isLowerCase(letra)) {
            System.out.println("la letra es minuscula");
        } else {
            System.out.println("el caracter ingresado no es una letra");
        }
        input.close();
    }
}
