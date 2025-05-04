import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner FF = new Scanner(System.in);

        int nacionalidad, edad;

        System.out.println();
        System.out.println("seleccione su nacionalidad:");
        System.out.println("1. Paises Bajos");
        System.out.println("2. Alemania");
        System.out.println("3. Estados Enidos");
        System.out.println();
        System.out.print("opción: ");
        nacionalidad = FF.nextInt();
        System.out.println("OK");
        System.out.println();

        switch (nacionalidad) {
            case 1:
                System.out.print("ingrese su edad: ");
                edad = FF.nextInt();
                System.out.println("OK");
                System.out.println();

                if(edad > 16) {
                    System.out.println("tienes: " + edad + " años");
                    System.out.println("eres mayor de edad");
                    System.out.println();
                }
                else {
                    System.out.println("tienes: " + edad + " años");
                    System.out.println("no eres mayor de edad");
                    System.out.println();
                }
            break;

            case 2:
                System.out.print("ingrese su edad: ");
                edad = FF.nextInt();
                System.out.println("OK");
                System.out.println();

                if(edad > 18) {
                    System.out.println("tienes: " + edad + " años");
                    System.out.println("eres mayor de edad");
                    System.out.println();
                }
                else {
                    System.out.println("tienes: " + edad + " años");
                    System.out.println("no eres mayor de edad");
                    System.out.println();
                }
            break;

            case 3:
                System.out.print("ingrese su edad: ");
                edad = FF.nextInt();
                System.out.println("OK");
                System.out.println();

                if(edad > 21) {
                    System.out.println("tienes: " + edad + " años");
                    System.out.println("eres mayor de edad");
                    System.out.println();
                }
                else {
                    System.out.println("tienes: " + edad + " años");
                    System.out.println("no eres mayor de edad");
                    System.out.println();
                }
            break;
        
            default:
                System.out.println("seleccione una de las tres opciones de nacionalidad");
                System.out.println();
            break;
        }
    }
}
