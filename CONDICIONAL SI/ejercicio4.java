import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner SS = new Scanner(System.in);
        System.out.print("ingrese numero: ");
        int numero = SS.nextInt();

        if(numero <= 50) {
            System.out.println("OK");
        }
        else {
            System.out.println("NO es menor a 50");
        }
    }
}
