public class ejercicio14 {
    public static void main(String[] args) {
        int mas = 0;
        int[] numeros = {1,2,7,4};

        for(int i = 0; i < numeros.length; i = i+1) {
            if(numeros[i] > mas) {
                mas = numeros[i];
            }
        }
        System.out.println("el numero mayor es: " + mas);
    }
}
