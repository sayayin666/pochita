import java.util.Scanner;

public class comparacionTresNumeros {
        public static void main(String[] args) {
        Scanner SS = new Scanner(System.in);
        System.out.println("ingrese numeros a verificar");

        System.out.println();
        System.out.println("ingrese primer numero:");
        int numero1 = SS.nextInt();

        System.out.println();
        System.out.println("ingrese segundo numero:");
        int numero2 = SS.nextInt();

        System.out.println();
        System.out.println("ingrese tercer numero:");
        int numero3 = SS.nextInt();

        System.out.println();
        if(numero1>numero2 && numero3<numero1 || numero1<numero2 && numero3>numero1) {
            System.out.println("aaaaal numero mayor es: " + numero1);
            if(numero2>numero3) {
                System.out.println("aaaaal numero menor es: " + numero3);
            }
            else {
                System.out.println("aaaaal numero menor es: " + numero2);
            }
        }
        else if(numero1<numero2 && numero2<numero3) {
            System.out.println("el numero mayor es: " + numero3);
            System.out.println("el numero menor es: " + numero1);
        }
        else if(numero1>numero2 && numero1<numero3) {
            System.out.println("eeeeel numero mayor es: " + numero3);
            System.out.println("eeeeel numero menor es: " + numero2);
        }
        else if(numero1<numero2 && numero1>numero3) {
            System.out.println("iiiiiil numero mayor es: " + numero2);
            System.out.println("iiiiiil numero menor es: " + numero3);
        }
        else {
            System.out.println("chupame este penko");
        }
    }
}
