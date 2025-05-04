import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner EE = new Scanner(System.in);
        System.out.print("ingrese numero: ");
        int numero = EE.nextInt();

        if(numero != 0) {
            System.out.println("el numero ingresado es distinto de '0'");
        }
        else {
            System.out.println("el numero ingresado NO es distinto de '0'");
        }
    }
}
