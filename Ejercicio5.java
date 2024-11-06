import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una letra: ");
        String entrada = scanner.nextLine();

        if (entrada.length() == 1) {
            char letra = Character.toLowerCase(entrada.charAt(0)); // Convertimos a minúscula

            if (Character.isLetter(letra)) {
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    System.out.println(letra + " es una vocal.");
                } else {
                    System.out.println(letra + " es una consonante.");
                }
            } else {
                System.out.println("Por favor, ingresa solo una letra.");
            }
        } else {
            System.out.println("Por favor, ingresa solo una letra.");
        }

        scanner.close();
    }
}
