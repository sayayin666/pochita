import java.util.Scanner;

public class ejercico2 {
    public static void main(String[] args) {
        Scanner DD = new Scanner(System.in);

        double far;
        double kel;

        System.out.println("Bienvenido al conversionainador 4000 oficial de temperatura de grados Celcius a Fahrenheit y Kelvin");
        System.out.println();

        System.out.print("ingrese por favor una cantidad en grados centigrados: ");
        int grados1 = DD.nextInt();
        System.out.println("OK");

        System.out.println();
        System.out.println(">> indique a que unidad de grados desea convertir: <<");
        System.out.println();
        System.out.println("1. Fahrenheit");
        System.out.println("2. Kelvin");
        System.out.println();
        int grados2 = DD.nextInt();

        switch (grados2) {
            case 1:
            far = 1.8 * grados1 + 32;
            System.out.println();
            System.out.println("la conversión de grados Celcius a grados Fahrenheit da como resultado: " + far + " " + "grados Fahrenheit");
                break;

            case 2:
            kel = grados1 * 2973.15;
            System.out.println();
            System.out.println("la conversion de grados Celcius a grados Kelvin da como resultado: " + kel + " " + "grados Kelvin");
                break;

            default:
            System.out.println();
            System.out.println("debe ingresar cualquiera de ambas opciones");
        }
    }
}
