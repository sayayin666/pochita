import java.util.Scanner;
public class Exc3 {
    public static void main(String[] args) {
        Scanner verdad = new Scanner(System.in);
        System.out.println("ingrese su edad: ");
        int edad = verdad.nextInt();

        if(edad<5) {
            System.out.println("entrada gratuita");
        }
         else if(edad >= 5 && edad<=17) {
            System.out.println("el boleto cuesta 5");
        }
         else if(edad>=18 && edad <=60) {
            System.out.println("el boleto cuesta 10");
        }
         else if(edad>60) {
            System.out.println("el boleto cuesta 7 dolares (descuento para adultos mayores)");
        }
    }
}
