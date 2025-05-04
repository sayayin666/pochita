import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner DD = new Scanner(System.in);
        System.out.print("ingrese su edad:");
        int edad = DD.nextInt();

        if(edad >= 18) {
            System.out.println("puede votar");
        }
        else {
            System.out.println("NO puede votar");
        }
    }
}
