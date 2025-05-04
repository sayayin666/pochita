import java.util.Scanner;
public class Exc2 {
    public static void main(String[] args) {
        Scanner FF = new Scanner(System.in);

	int suscripcion;

	System.out.println();
        System.out.println("seleccione su tipo de suscripcion:");
	System.out.println();

        System.out.println("1. basico");
        System.out.println("2. premium");
        System.out.println("3. gratis");


        suscripcion = FF.nextInt();

        if(suscripcion == 1){
            System.out.println("tienes acceso a funciones limitadas");
        }
        else if(suscripcion == 2) {
            System.out.println("tienes acceso a todas las funciones");
        }
        else if(suscripcion == 3) {
            System.out.println("tienes acceso a contenido gratis");
        }
        else {
            System.out.println("tipo de suscripcion no valida");
        }
    }
}