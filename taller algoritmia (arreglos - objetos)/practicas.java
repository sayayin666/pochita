import java.util.Scanner;

public class practicas {
    public static void main(String[] args) {
        Scanner EE = new Scanner(System.in);

        double propina, monto, total;

        System.out.print("escoja su monto: ");
        monto = EE.nextDouble();
        System.out.println("OK");

        propina = 0.05;
        total = propina * monto;

        System.out.println("1");
        System.out.println(total);
    }
}
