import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        Scanner FF = new Scanner(System.in);
        System.out.println("ingrese su edad");
        int edad = FF.nextInt();

        if(edad<5) {
            System.out.println("los niños menores a 5 no pueden subir");
        }
        else if(edad>=5 && edad <=12) {
            System.out.println("los niños deben ir acompañado por un adulto");
        }
        else if(edad>12) {
            System.out.println("pueden igresar solos");
        }
    }
}
