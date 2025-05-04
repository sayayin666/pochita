import java.util.Scanner;

public class Exc12 {
    public static void main(String[] args) {
        Scanner XX = new Scanner(System.in);

        float suma;
        float promedio;

        System.out.println("aprobacion de nota");
        System.out.println("aprobación de nota");
        System.out.println("aprobación de nota");

        System.out.println();
        System.out.print("ingrese primera nota: ");
        float nota1 = XX.nextFloat();

        System.out.println();
        System.out.print("ingrese segunda nota: ");
        float nota2 = XX.nextFloat();

        System.out.println();
        System.out.print("ingrese tercera nota: ");
        float nota3 = XX.nextFloat();

        System.out.println();
        System.out.print("ingrese cuarta nota: ");
        float nota4 = XX.nextFloat();

        suma = nota1 + nota2 + nota3 + nota4;
        promedio = suma / 4;

        if(promedio >= 3.0) {
            System.out.println();
            System.out.println(promedio + " " + "aprobó la nota");
            System.out.println();
        }
        else {
            System.out.println();
            System.out.println(">><su nota final dió como resultado = " + promedio + " " + "perdió el año,, siga echando celular :V<<<");
            System.out.println();
        }
    }
}
