import java.util.Scanner;

public class Exc6 {
    public static void main(String[] args) {
        int num = 0;
        int suma = 0;

        Scanner GG = new Scanner(System.in);

        System.out.println("digite numero 1: ");
        int num1 = GG.nextInt();
        System.out.println("digite numero 2: ");
        int num2 = GG.nextInt();
        System.out.println("digite numero 3: ");
        int num3 = GG.nextInt();
        System.out.println("digite numero 4: ");
        int num4 = GG.nextInt();
        System.out.println("digite numero 5: ");
        int num5 = GG.nextInt();

        for(num = 0; num <= 5; num = num + 1) {
            suma = suma + num1 + num2 + num3 + num4 + num5;

            System.out.println("la sumatoria de los numeros ingresados son: " + suma);
        }
    }
}
