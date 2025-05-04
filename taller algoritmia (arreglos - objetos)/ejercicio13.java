public class ejercicio13 {
    public static void main(String[] args) {
        int conteo_pares = 0, conteo_impares = 0;
        int[] numeros = {12,2,14,8,10,2,18,20,7};

        for(int i = 0; i < 9; i++) {
            if (numeros[i] % 2 == 0) {
                conteo_pares++;
            }
            else {
                conteo_impares++;
            }
        }
        System.out.println("numeros pares: " + conteo_pares);
        System.out.println("numeros impares: " + conteo_impares);
    }
}
