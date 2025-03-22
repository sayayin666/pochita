import java.util.Scanner;

public class exc4 {
    public static void main(String[] args) {
        Scanner HH = new Scanner(System.in);
        System.out.println("ingrese el valor de su monto");
        int monto = HH.nextInt();
        int descuento1 = (20/100)*monto;
        int descuento2 = (10/100)*monto;
        int totalPagar1 = monto-descuento1;
        int totalPagar2 = monto-descuento2;

        if(monto>=1000) {
            System.out.println("recibe un 20% de descuento");
            System.out.println("su total a pagar es: " + totalPagar1);

        }
        else if(monto>=500 && monto<=999) {
            System.out.println("recibe un 10% de descuento");
            System.out.println("su total a pagar es: " + totalPagar2);
        }
        else if(monto<=500) {
            System.out.println("no recibe descuento");
        }
    }
}
