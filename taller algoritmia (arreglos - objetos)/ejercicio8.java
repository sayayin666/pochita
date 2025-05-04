import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner FF = new Scanner(System.in);

        int menu;
        double dolar, conver;

        System.out.println();
        System.out.println("ingrese opción a determinar cambio de divisas de dolares USD).");
        System.out.println();
        System.out.println("1. Euro (EUR).");
        System.out.println("2. Yen Japones (JPY).");
        System.out.println("3. Peso Colombiano (COP).");
        System.out.println();
        System.out.print("opcion: ");
        menu = FF.nextInt();
        System.out.println("OK");
        System.out.println();

        switch (menu) {
            case 1:
                System.out.println("ingrese cantidad a determinar");
                System.out.println();
                System.out.print("cantidad: ");
                dolar = FF.nextDouble();
                System.out.println("OK");
                System.out.println();

                conver = dolar * 0.8789;

                System.out.println("tienes en total: " + conver + " Eruo(s).");
                System.out.println();
                break;

            case 2:
                System.out.println("ingrese cantidad a determinar");
                System.out.println();
                System.out.print("cantidad: ");
                dolar = FF.nextDouble();
                System.out.println("OK");
                System.out.println();

                conver = dolar * 142.74;

                System.out.println("tienes en total: " + conver + " Yen(es).");
                System.out.println();
                break;

            case 3:
                System.out.println("ingrese cantidad a determinar");
                System.out.println();
                System.out.print("cantidad: ");
                dolar = FF.nextDouble();
                System.out.println("OK");
                System.out.println();

                conver = dolar * 4261.5;

                System.out.println("tienes en total: " + conver + " Peso(s) Colombianos.");
                System.out.println();
                break;
        
            default:
                System.out.println("ingrese una de las tres opciones a determinar cambio de divisa");
                System.out.println();
                break;
        }
    }
}
