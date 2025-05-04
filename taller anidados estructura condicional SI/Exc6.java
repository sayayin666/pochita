import java.util.Scanner;

public class Exc6 {
    public static void main(String[] args) {
        Scanner FF = new Scanner(System.in);
        System.out.println("ingresa numero a verificar");
        int numero = FF.nextInt();

        if(numero%2 == 0 && numero>50) {
            System.out.println("el numero es par y mayor que 50");
        }
        else if(numero%2 == 0 && numero<50) {
            System.out.println("el numero es par y menor a 50");
        }
        else {
            System.out.println("el numero no es par");
        }
    }
}