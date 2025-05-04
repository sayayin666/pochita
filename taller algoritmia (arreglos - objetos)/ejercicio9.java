import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner CC = new Scanner(System.in);

        double distancia, tiempo, velocidad;

        System.out.println();
        System.out.println("ingrese distancia a determinar velocidad");
        System.out.println();
        System.out.print("distancia (kilómetros): ");
        distancia = CC.nextDouble();
        System.out.println("OK");

        System.out.println();
        System.out.println("ingrese tiempo a determinar velocidad");
        System.out.println();
        System.out.print("tiempo (horas): ");
        tiempo = CC.nextDouble();
        System.out.println("OK");
        System.out.println();

        velocidad = distancia / tiempo;

        System.out.println("su velocidad es de: " + velocidad + " km/h");

        if (velocidad > 0.00 && velocidad <= 20.00) {
            System.out.println("su velocidad es: lenta.");
            System.out.println();
        }
        else if(velocidad > 20.00 && velocidad <= 50.00) {
            System.out.println("su velocidad es: regular.");
            System.out.println();
        }
        else if(velocidad > 50.00 && velocidad <=80.00) {
            System.out.println("su velocidad es: rápida.");
            System.out.println();
        }
        else if(velocidad > 80.00) {
            System.out.println("su velocidad es: muy rápida.");
            System.out.println();
        }
        else {
            System.out.println("calcule de nuevo la velocidad");
            System.out.println();
        }
    }
}
