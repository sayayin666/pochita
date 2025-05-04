import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner YY = new Scanner(System.in);

        int edad, añoNacimiento;
        int añoActual = 2025;

        System.out.println();
        System.out.print("ingrese su fecha de nacimiento por favor: ");
        añoNacimiento = YY.nextInt();
        System.out.println("OK");
        System.out.println();

        edad = añoActual - añoNacimiento;

        System.out.println("usted tiene: " + edad + " años.");
        System.out.println();
    }
}
