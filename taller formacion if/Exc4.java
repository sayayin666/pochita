import java.util.Scanner;

public class Exc4 {
    public static void main(String[] args) {
        Scanner SS = new Scanner(System.in);
        System.out.println();
        System.out.println("ingrese 3 numeros a verificar");

        System.out.println();
        System.out.println("ingrese primer numero:");
        int numero1 = SS.nextInt();

        System.out.println();
        System.out.println("ingrese segundo numero:");
        int numero2 = SS.nextInt();

        System.out.println();
        System.out.println("ingrese tercer numero:");
        int numero3 = SS.nextInt();

        System.out.println();


        // el numero mayor es = 1
        if(numero1 > numero2 && numero3 < numero1) {
            System.out.println("el numero mayor es: " + numero1);
            if(numero2 > numero3) {
                System.out.println("el numero menor es: " + numero3);
            }
            else {
                System.out.println("el numero menor es: " + numero2);
            }
        }


        // el numero mayor es = 2
        if(numero1 < numero2 && numero3 < numero2) {
            System.out.println("el numero mayor es: " + numero2);
            if(numero1 > numero3) {
                System.out.println("el numero menor es: " + numero3);
            }
            else {
                System.out.println("el numero menor es: " + numero1);
            }
        }


        // el numero mayor es = 3
        if(numero3 > numero2 && numero3 > numero1) {
            System.out.println("el numero mayor es: " + numero3);
            if(numero1 > numero2) {
                System.out.println("el numero menor es: " + numero2);
            }
            else {
                System.out.println("el numero menor es: " + numero1);
            }
        }


        // repetidos = 1=2 | 2=3 | 1=3
        else if(numero1 == numero2) {
            System.out.println("hay numeros repetidos");
            if(numero1 > numero3) {
                System.out.println("el numero mayor es: " + numero1);
                System.out.println("el numero menor es: " + numero3);
            }
            else {
                System.out.println("el numero mayor es: " + numero3);
                System.out.println("el numero menor es: " + numero1);
            }
        }
        else if(numero2 == numero3) {
            System.out.println("hay numeros repetidos");
            if(numero1 > numero2) {
                System.out.println("el numero mayor es: " + numero1);
                System.out.println("el numero menor es: " + numero2);
            }
            else {
                System.out.println("el numero mayor es: " + numero2);
                System.out.println("el numero menor es: " + numero1);
            }
        }
        else if(numero1 == numero3) {
            System.out.println("hay numeros repetidos");
            if(numero2 > numero1) {
                System.out.println("el numero mayor es: " + numero2);
                System.out.println("el numero menor es: " + numero1);
            }
            else {
                System.out.println("el numero mayor es: " + numero1);
                System.out.println("el numero menor es: " + numero2);
            }
        }
    }
}
