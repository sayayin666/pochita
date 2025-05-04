import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner CC = new Scanner(System.in);
        System.out.print("ingrese su edad: ");
        int edad = CC.nextInt();

        if(edad >= 16) {
            System.out.println("puede conducir");
        }
        else {
            System.out.println("NO puede conducir");
        }
    }
}
