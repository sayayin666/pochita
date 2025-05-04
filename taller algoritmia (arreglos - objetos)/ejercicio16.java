public class ejercicio16 {
    public static void main(String[] args) {
        String[] palabras = {"porque", "existen", "obejas", "negras", "en", "el", "mundo?"};
        String palabra;
        int contador = 0;

        for (int i = 0; i < palabras.length; i++) {
            palabra = palabras[i];
            for (int j = 0; j < palabra.length(); j++) {
                char d = palabra.charAt(j);
                if (d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u') {
                    contador++;
                }
            }
        }
        System.out.println();
        System.out.println("en total de vocales hay: " + contador);
        System.out.println();
    }
}
