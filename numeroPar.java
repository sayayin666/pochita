import java.util.Scanner;

public class numeroPar {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("ingrese numero a validar");
        int numero = ss.nextInt();
        int modulo;

        for(numero=0; numero%2==0; numero=numero+1) {
            modulo=numero%2=0;
            System.out.println("el numero es: " + numero);
        }
    }
}
