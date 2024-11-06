import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese los números de los dos hermanos que llegaron a tiempo (por ejemplo, 1 2):");

        int hermano1 = input.nextInt();
        int hermano2 = input.nextInt();

        int hermanoTarde = 0;

        // Determinamos cuál es el hermano que falta usando condiciones if
        if ((hermano1 == 1 && hermano2 == 2) || (hermano1 == 2 && hermano2 == 1)) {
            hermanoTarde = 3;
        } else if ((hermano1 == 1 && hermano2 == 3) || (hermano1 == 3 && hermano2 == 1)) {
            hermanoTarde = 2;
        } else if ((hermano1 == 2 && hermano2 == 3) || (hermano1 == 3 && hermano2 == 2)) {
            hermanoTarde = 1;
        }

        System.out.println("El hermano que llegará tarde es el número: " + hermanoTarde);
        input.close();
    }
}
