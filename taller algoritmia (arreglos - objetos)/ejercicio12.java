public class ejercicio12 {
    public static void main(String[] args) {
        int suma = 0;
        int promedio;
        int[] numeros = new int[6];
        numeros[0] = 8;
        numeros[1] = 22;
        numeros[2] = 37;
        numeros[3] = 92;
        numeros[4] = 44;
        numeros[5] = 10;

        for(int i = 0; i < 6; i = i+1) {
            suma = suma + numeros[i];
            System.out.println(suma);
        }

        promedio = suma / 6;
        System.out.println("el promedio es: " + promedio);
    }
}
