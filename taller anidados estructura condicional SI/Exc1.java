import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        int numero;
        Scanner DD = new Scanner(System.in);
        System.out.println("ingrese numero: ");
        numero = DD.nextInt();

        if(numero%3==0 && numero%5==0) {
            System.out.println("el numero ingresado es multiplo de 3 y de 5");
        }
        else if(numero%3==0) {
            System.out.println("el numero ingresado solo es multiplo de 3");
        }
        else if(numero%5==0) {
            System.out.println("el numero ingresado solo es multiplo de 5");
        }else {
            System.out.println("el numero ingresado no es multiplo de ningun numero");
        }
    }
}