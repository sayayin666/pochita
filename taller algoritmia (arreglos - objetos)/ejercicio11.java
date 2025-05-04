import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner SD = new Scanner(System.in);

        int monto, retiro;
        int saldo = 5000;

        System.out.println();
        System.out.println("bienvenido a su cajero automatico de confianza");
        System.out.println();
        System.out.println("tienes un saldo disponible de 5000 dolares");
        System.out.println();
        System.out.print("cuanto deseas retirar: ");
        monto = SD.nextInt();
        System.out.println("OK");
        System.out.println();

        if (monto > 0 && monto < 5000) {
            retiro = saldo - monto;
            System.out.println("has retirado: " + monto + " dolar(es)");
            System.out.println("tienes disponible: " + retiro + " dolar(es)");
            System.out.println();
        }
        else if (monto < 0) {
            System.out.println("debes ingresar valores positivos");
            System.out.println();
        }
        else {
            System.out.println("no puedes retirar mas de 5000 dolares");
            System.out.println();
        }
    }
}
