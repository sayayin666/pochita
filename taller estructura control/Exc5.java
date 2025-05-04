public class Exc5 {
    public static void main(String[] args) {
        int numeros = 0;

        for(numeros = 0; numeros <= 50; numeros = numeros + 1) {
            if(numeros % 5 == 0) {
                System.out.println(numeros);
            }
        }
    }
}
