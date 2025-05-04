import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner SS = new Scanner(System.in);

        double nota;
        System.out.println();
        System.out.println("ingrese calificación a determinar");
        System.out.println();
        System.out.print("calificación: ");
        nota = SS.nextDouble();
        System.out.println("OK");
        System.out.println();

        if (nota > 1.00 && nota <= 2.00) {
            System.out.println("su calificación es: 'F' ");
            System.out.println();
        }
        else if (nota > 2.00 && nota <= 3.00 ) {
            System.out.println("su calificación es: 'D'");
            System.out.println();
        }
        else if (nota > 3.00 && nota <= 4.00) {
            System.out.println("su calificación es: 'C'");
            System.out.println();
        }
        else if (nota > 4.00 && nota <= 4.99) {
            System.out.println("su calificación es: 'B'");
            System.out.println();
        }
        else if (nota >= 5.00) {
            System.out.println("su calificación es 'A'");
            System.out.println();
        }
        else {
            System.out.println("ingrese calificación nuevamente a determinar");
            System.out.println();
        }
    }
}
