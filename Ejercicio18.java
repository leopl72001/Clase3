public class Ejercicio18 {
    public static void main(String[] args) {
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;

        // Generación de 120 números aleatorios entre -100 y 100
        for (int i = 0; i < 120; i++) {
            int numero = (int) (Math.random() * 201) - 100; // Genera un número entre -100 y 100

            if (numero > 0) {
                sumaPositivos += numero;
                contadorPositivos++;
            } else if (numero < 0) {
                sumaNegativos += numero;
                contadorNegativos++;
            } else {
                contadorCeros++;
            }
        }

        double mediaPositivos;
        if (contadorPositivos > 0) {
            mediaPositivos = (double) sumaPositivos / contadorPositivos;
        } else {
            mediaPositivos = 0;
        }

        double mediaNegativos;
        if (contadorNegativos > 0) {
            mediaNegativos = (double) sumaNegativos / contadorNegativos;
        } else {
            mediaNegativos = 0;
        }

        System.out.println("Suma de los valores positivos: " + sumaPositivos);
        System.out.println("Suma de los valores negativos: " + sumaNegativos);
        System.out.println("Media de los números positivos: " + mediaPositivos);
        System.out.println("Media de los números negativos: " + mediaNegativos);
        System.out.println("Cantidad de ceros: " + contadorCeros);
    }
}
