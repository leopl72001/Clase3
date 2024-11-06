public class Ejercicio20 {
    public static void main(String[] args) {
        int size = 8;  // Tamaño del tablero de ajedrez (8x8)

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                
                if ((row + col) % 2 == 0) {
                    System.out.print("| B ");
                } else {
                    System.out.print("| N ");
                }
            }
            System.out.println("|");  
        }
    }
}