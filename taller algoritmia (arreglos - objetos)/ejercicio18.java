public class ejercicio18 {
    public static void main(String[] args) {
        int[] numeros = new int[9];
        int repeat = 0;

        numeros[0] = 8;
        numeros[1] = 12;
        numeros[2] = 33;
        numeros[3] = 122;
        numeros[4] = 33;
        numeros[5] = 41;
        numeros[6] = 8;
        numeros[7] = 12;
        numeros[8] = 1198;

        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i] < repeat) {
                repeat = numeros[i];
            }
            System.out.println("numeros: " + repeat);
        }
    }
}
