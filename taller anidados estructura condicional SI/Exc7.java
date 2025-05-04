import java.util.Scanner;

public class Exc7 {
   public static void main(String[] args) {
    Scanner SS = new Scanner(System.in);
    System.out.println("ingrese su numero");
    int numero = SS.nextInt();

    if(numero >= 10 && numero <= 50) {
        System.out.println("el numero está dentro del rango");
    }
    else {
        System.out.println("el numero está fuera del rango");
    }
   }
}
