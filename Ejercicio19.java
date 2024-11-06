import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el número de términos de la sucesión de Fibonacci que desea ver: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, ingrese un número mayor que 0.");
        } else {
            int num1 = 0, num2 = 1;
            
            System.out.print("Sucesión de Fibonacci: ");
            
            for (int i = 1; i <= n; i++) {
                System.out.print(num1 + " ");
                
                int siguiente = num1 + num2;
                num1 = num2;
                num2 = siguiente;
            }
        }

        input.close();
    }
}
    
