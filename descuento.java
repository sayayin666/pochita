import java.util.Scanner;
public class descuento {
    public static void main(String[] args) {
        Scanner SS = new Scanner(System.in);
        System.out.println("ingrese su edad");
        int edad = SS.nextInt();

        if(edad<5) {
            System.out.println("entrada gratuita");
        }
        else if(edad>=5 && edad<=17) {
            
                System.out.println("su boleto cuesta 5 dolares");
            }
            else if(edad>=18 && edad<=60) {
                System.out.println("el boleto cuesta 10 dolares");
    
        }
        else if(edad>60) {
            System.out.println("su boleto cuesta 7 dolares(descuento para adultos mayores)");
        }        
        }
        }