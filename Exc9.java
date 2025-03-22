import java.util.Scanner;

public class Exc9 {
    public static void main(String[] args) {
        Scanner SS = new Scanner(System.in);
        System.out.println("ingrese su monto");
        int cantidad = SS.nextInt();

        if(cantidad>5000) {
            System.out.println("fondos insuficientes");
        }
        else if(cantidad>1000 && cantidad<5000) {
            System.out.println("limite de retiro por transaccion: 1000");
        }
        
        }
    }
