import java.util.Scanner;

public class Exc5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un carácter: ");

        String texto = entrada.next(); // leer el texto del usuario
        char caracter = texto.charAt(0); // ahora sí puedes usar charAt

        // para vocal
        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' ||
            caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
            System.out.println("Es una vocal.");
        }
        // para consonante
        else if ((caracter >= 'a' && caracter <= 'z') || (caracter >= 'A' && caracter <= 'Z')) {
            System.out.println("Es una consonante.");
        }
        // para número
        else if (caracter >= '0' && caracter <= '9') {
            System.out.println("Es un número.");
        }
        // otro símbolo
        else {
            System.out.println("Es otro símbolo.");
        }
    }
}