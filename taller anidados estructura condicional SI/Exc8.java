import java.util.Scanner;

public class Exc8 {
    public static void main(String[] args) {
        Scanner AA = new Scanner(System.in);
        System.out.println("nombre de usuario: ");
        String usuario = AA.nextLine();
        System.out.println("contraseña: ");
        int contraseña = AA.nextInt();

        if(usuario.equals("admin") && contraseña == 1234) {
            System.out.println("acceso concedido");
        }
        else if(usuario.equals("admin") && contraseña != 1234) {
            System.out.println("contraseña incorrecta");
        }
        else {
            System.out.println("usuario y contraseña no encontrados");
        }
    }
}
