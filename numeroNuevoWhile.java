public class numeroNuevoWhile {
    public static void main(String[] args) {
        int numero = 0;
        int suma = 1;

        while(numero <= 10) {
            suma = suma + numero;
            System.out.println("la suma de los numeros es: " + suma);
            numero = numero + 1;
        }
    }
}
