import java.util.Scanner;

public class Exc9 {
    public static void main(String[] args) {
        Scanner XX = new Scanner(System.in);
        System.out.println("ingrese la opcion correspondiente");
        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3.");
        int opcion = XX.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("saludar");
                    break;

                case 2:
                    System.out.println("despedirse");
                    break;

                case 3:
                    System.out.println("salir");
                    break;
        }
    }
}
