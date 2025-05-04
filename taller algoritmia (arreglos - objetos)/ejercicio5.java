import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner TT = new Scanner(System.in);

        int segundos, minutos, horas;

        System.out.println();
        System.out.println("ingrese una cantidad de segundos a determinar");
        segundos = TT.nextInt();
        System.out.println("OK");

        horas = segundos / 3600;
        minutos = segundos / 60;

        System.out.println();
        System.out.println("horas: " + horas + ", minutos: " + minutos + ", segundos: " + segundos);
        System.out.println();
    }
}
