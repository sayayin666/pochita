import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner SS = new Scanner(System.in);
        float peso;
        float estatura;
        float multi;
        float imc;

        System.out.println();
        System.out.println("clasificación de IMC (índice de masa corporal)");

        System.out.println();
        System.out.print("ingrese su peso: ");
        peso = SS.nextFloat();
        System.out.println("OK");

        System.out.println();
        System.out.print("ingrese su estatura: ");
        estatura = SS.nextFloat();
        System.out.println("OK");

        multi = estatura * estatura;
        imc = peso / multi;

        System.out.println();
        System.out.println("su indice de masa corporal es igual a: " + imc);

        if (imc < 18.5) {
            System.out.println("bajo peso");
            System.out.println();
        }
        else if(imc >= 18.5 && imc <= 24.9) {
            System.out.println("peso normal");
            System.out.println();
        }
        else if(imc >= 25.0 && imc <= 29.9) {
            System.out.println("pre-obesidad o sobrepeso");
            System.out.println();
        }
        else if(imc >= 30.0 && imc <= 34.9) {
            System.out.println("obesidad clase I");
            System.out.println();
        }
        else if(imc >= 35.0 && imc <= 39.9) {
            System.out.println("obesidad clase II");
            System.out.println();
        }
        else if(imc > 40.0) {
            System.out.println("obesidad clase III");
            System.out.println();
        }
    }
}
