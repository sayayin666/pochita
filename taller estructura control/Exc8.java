import java.util.Scanner;

public class Exc8 {
    public static void main(String[] args) {
        Scanner CC = new Scanner(System.in);
        System.out.println("ingrese su edad:");
        int edad = CC.nextInt();

        if(edad >= 18) {
            System.out.println("eres mayor de edad");
        }
        else {
            System.out.println("eres menor de edad");
        }
    }
}
