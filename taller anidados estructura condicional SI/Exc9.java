import java.util.Scanner;

public class Exc9 {
    public static void main(String[] args) {
        Scanner DD = new Scanner(System.in);
        System.out.println("saldo actual = 5000");
        System.out.println();
        System.out.println("ingrese monto a retirar:");
        int monto = DD.nextInt();
        int resto = 5000 - monto;

        if(monto >5000) {
            System.out.println();
            System.out.println("fondos insuficientes");
            System.out.println();
            System.out.println("no puede retirar mas de su saldo actual");
        }
        else if(monto > 1000 && monto < 5000) {
            System.out.println("limite de retiro potr transaccion: 1000");
        }
        else if(monto <= 1000) {
            System.out.println("retiro exitoso");
            System.out.println();
            System.out.println("su saldo actual es " + resto);
        }
    }
}
