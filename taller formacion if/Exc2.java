import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Scanner XX = new Scanner(System.in);
        System.out.println("ingrese año a determinar si es bisiesto");
        int año = XX.nextInt();

        if(año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
            System.out.println("año bisiesto");
        }
        else {
            System.out.println("año no bisiesto");
        }
    }
}