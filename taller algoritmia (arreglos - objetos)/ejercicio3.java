import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner AA = new Scanner(System.in);
        System.out.println();
        System.out.println("verificador de año bisiesto");

        System.out.println();
        System.out.print("ingresa año a determinar: ");
        int año = AA.nextInt();
        System.out.println("OK");

        /*
        Detalles de la rega:
        
        1. años comunes: duran 365 dias.
        2. años bisiestos: duran 366 dias y se producen en los años multiplos de 4, excepto en los años seculares.
        3. años seculares: terminan en 00 y generalmente son años comunes, a menos que sean multipos de 400, en cuyo caso son bisiestos.

        ejemplo:

        2024 es un año bisiesto (multiplo de 4)
        2000 fue un año bisiesto (multiplo de 400)
        2100 no será un año bisisesto (año secular no multiplo de 400)
         */

        System.out.println();
        if(año % 4 == 0 && año % 100 != 0 || año % 400 == 00) {
            System.out.println("el año ingresado es año bisiesto");
        }
        else {
            System.out.println("el año ingresado no es año bisiesto");
        }
        }
    }