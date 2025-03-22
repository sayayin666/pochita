import java.util.Scanner;

public class Exc8 {
    public static void main(String[] args) {
        Scanner SS = new Scanner(System.in);
        System.out.println("ingrese nombre de usuario: ");
        String usuario = SS.nextLine();
        System.out.println("ingrese contraseña: ");
        int contraseña = SS.nextInt();

        if(usuario == "admin" && contraseña == 1234) {
            System.out.println("acceso concedido");
        }
    }
}
