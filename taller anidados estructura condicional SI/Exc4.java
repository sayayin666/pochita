import java.util.Scanner;

public class Exc4 {
    public static void main(String[] args) {
        Scanner SS = new Scanner(System.in);
        System.out.println("ingrese el valor de su monto su monto: ");
        int monto = SS.nextInt();
        double descuento1 = 0.2 * monto;
        double descuento2 = 0.1 * monto;
        double totalPagar1 = monto-descuento1;
        double totalPagar2 = monto-descuento2;

        if(monto>=1000) {
            System.out.println("recibe un 20% de descuento");
            System.out.println("su total a pagar es de: " + totalPagar1);
        }
        else if(monto>=500 && monto<=999) {
            System.out.println("recibe un 10% de descuento");
            System.out.println("su total a pagar es de: " + totalPagar2);
        }
        else if(monto<500) {
            System.out.println("no recibe descuento");
            System.out.println("su total a pagar es: " + monto);
        }
    }
}
