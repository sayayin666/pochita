import java.util.Scanner;

public class Exc10 {
    public static void main(String[] args) {
        Scanner SS = new Scanner(System.in);
        System.out.println("ingrese contraseña a evaluar:");
        String contraseña = SS.nextLine();

        if(contraseña.length() < 6) {
            System.out.println("debil");
        }
        else if(contraseña.length() >= 6 && contraseña.length() <=10) {
            System.out.println("moderada");
        }
        else if(contraseña.length() > 10) {
            System.out.println("fuerte");
        }
    }
}
