import java.util.Scanner;

public class xx {
    public static void main(String[] args) {
        Scanner HH = new Scanner(System.in);
        System.out.println("ingrese el valor de su monto");
        int monto = HH.nextInt();
        int descuento1 = (20/100)*monto;
        int totalPagar1 = monto-descuento1;

        System.out.println("recibe un 20% de descuento"+totalPagar1);
    }
}
