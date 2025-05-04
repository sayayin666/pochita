import java.util.Scanner;

public class Exc11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero;
        boolean pasa = true;

        System.out.println("Ingresa números positivos (0 para terminar):");

        while (pasa) {
            numero = scanner.nextInt();

            if (numero == 0) {
                break; // termina el ciclo si se ingresa 0
            }

            if (numero > 0) {
                suma += numero;
            }
            // Los números negativos se ignoran
        }

        System.out.println("La suma de los números positivos es: " + suma);
        scanner.close();
    }
}
