public class ejercicio17 {
    public static void main(String[] args) {
        String[] palabras = {"ana", "otto", "oso", "reloj", "reconocer", "temperatura"};
        String[] conclusion = new String[palabras.length];
        String palabra;
        int contador = 0;

        for (int i = 0; i < palabras.length; i++) {
            palabra = palabras[i];
            boolean palindromo = true;

            for (int j = 0; j < palabra.length() / 2; j++) {
                if (palabra.charAt(j) != palabra.charAt(palabra.length() - 1 - j)) {
                    palindromo = false;
                    break;
                }
            }

            if (palindromo) {
                conclusion[contador] = palabras[i];
                contador++;
            }
        }

        // Crear arreglo final del tamaño exacto
        String[] palindromos = new String[contador];
        for (int i = 0; i < contador; i++) {
            palindromos[i] = conclusion[i];
        }

        // Imprimir resultado
        System.out.println();
        System.out.print("Palíndromos: ");
        for (int i = 0; i < palindromos.length; i++) {
            System.out.print(palindromos[i] + " ");
        }
    }
}
