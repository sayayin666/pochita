import java.util.Scanner;

public class Exc5 {
    public static void main(String[] args) {
        Scanner XX = new Scanner(System.in);
        System.out.println("ingrese la temperatura actual");
        int temperatura = XX.nextInt();

        if(temperatura<10) {
            System.out.println("dia muy frio");
        }
        else if(temperatura>=10 && temperatura<=20) {
            System.out.println("dia fresco");
        }
        else if(temperatura>=21 && temperatura<=30) {
            System.out.println("dia calido");
        }
        else if(temperatura>30) {
            System.out.println("dia muy caluroso");
        }
    }
}
