import java.util.Scanner;

public class Exc1 {
public static void main(String[] args) {
    Scanner DD = new Scanner(System.in);
        System.out.println("ingresa tres numeros a determinar triangulo, se vale repetir.");
	System.out.println();

        System.out.println("1. numero uno");
        System.out.println("2. numero dos");
        System.out.println("3. numero tres");
	System.out.println();

        System.out.print("ingrese primer numero: ");

        int numero1 = DD.nextInt();

        System.out.println("1. numero uno");
        System.out.println("2. numero dos");
        System.out.println("3. numero tres");

        System.out.print("ingrese segundo numero: ");

        int numero2 = DD.nextInt();

        System.out.println("1. numero uno");
        System.out.println("2. numero dos");
        System.out.println("3. numero tres");

        System.out.print("ingrese tercer numero: ");

        int numero3 = DD.nextInt();
	System.out.println();


        if(numero1 == 1  && numero2 == 1  && numero3 == 1 || numero1 == 2 && numero2 == 2 && numero3 == 2 || numero1 == 3 && numero2 == 3 && numero3 == 3) {
            System.out.println("los numeros ingresados determinan triangulo equilatero");
        }
        else if(numero1==1 && numero2==1 && numero3==2 || numero1==1 && numero2==1 && numero3==3 || numero1==2 && numero2==2 && numero3==1 || numero1==2 && numero2==2 && numero3==3 || numero1==3 && numero2==3 && numero3==1 || numero1==3 && numero2==3 && numero3==2) {
            System.out.println("los numeros ingresados determinan triangulo isósceles");
        }
        else if(numero1==1 && numero2==2 && numero3==3 || numero1==1 && numero2==3 && numero3==2 || numero1==2 && numero2==1 && numero3==3 || numero1==2 && numero2==3 && numero3==1 || numero1==3 && numero2==2 && numero3==1 || numero1==3 && numero2==1 && numero3==2) {
            System.out.println("los numeros ingresados determinan triangulo escaleno");
        }
        else {
            System.out.println("por favor ingresar datos validos");
        }
    }
}