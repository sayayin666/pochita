import java.util.Scanner;

public class clasificacionTriangulos {
    public static void main(String[] args) {
        Scanner AA = new Scanner(System.in);
        System.out.println();
        System.out.println("ingrese valores enteros a determinar forma del triangulo");
        System.out.println();
        System.out.println("ingrese primer valor:");
        int numero1 = AA.nextInt();
        System.out.println();
        System.out.println("ingrese segundo valor:");
        int numero2 = AA.nextInt();
        System.out.println();
        System.out.println("ingrese tercer valor:");
        int numero3 = AA.nextInt();

        System.out.println();

        if(numero1==numero2 && numero3==numero1) {
            System.out.println(" basados los valores su triangulo es equilatero");
        }
        else if(numero1 != numero2 && numero3 == numero2 || numero1 != numero2 && numero3 == numero1 || numero1 == numero2 && numero3 != numero1) {
            System.out.println("basados los valores su triangulo es isosceles");
        }
        else if(numero1 != numero2 && numero3 != numero1) {
            System.out.println("basados los valores su triangulo es escaleno");
        }
        else {
            System.out.println("por favor ingresar valores enteros");
        }
    }
}