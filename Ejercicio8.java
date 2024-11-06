import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte num;
        //tabla de edades y sus etapas
        System.out.println("|-----------------------------|");
        System.out.println("|-------Tabla de edades-------|");
        System.out.println("|-----------------------------|");
        System.out.println("|   Años   |      Etapa       |");
        System.out.println("|-----------------------------|");
        System.out.println("|  0 - 5   | Primera infancia |");
        System.out.println("|-----------------------------|");
        System.out.println("|  6 - 11  |     Infancia     |");
        System.out.println("|-----------------------------|");
        System.out.println("| 12 - 17  |   Adolescencia   |");
        System.out.println("|-----------------------------|");
        System.out.println("| 18 - 26  |     Juventud     |");
        System.out.println("|-----------------------------|");
        System.out.println("| 27 - 59  |     Adultez      |");
        System.out.println("|-----------------------------|");
        System.out.println("|   >59    |   Persona mayor  |");
        System.out.println("|-----------------------------|");
        System.out.println("");
        System.out.println("digita tu edad para saber en que etapa entras");
        num = input.nextByte();

        //aqui se dice en que etapa entra la persona que digita su edad
        if (num <= 5) {
            System.out.println("Estas en la etapa de Primera infancia, eres un bebe");
        } else if (num <= 11) {
            System.out.println("Estas en la etapa de Infancia, eres un niño");
        } else if (num <= 17) {
            System.out.println("Estas en la etapa de Adolenecia, eres un adolecente");
        } else if (num <= 26) {
            System.out.println("Estas en la etapa de Jueventud, eres un Joven");
        } else if (num <= 59) {
            System.out.println("Estas en la etapa de Adultez, eres un adulto");
        } else {
            System.out.println("estas en la etapa de Persona mayor, eres un Viejo");
        }
        input.close();
    }
}
