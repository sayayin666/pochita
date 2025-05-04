public class ejercicio15 {
    public static void main(String[] args) {
        String[] palabras = {"hola", "mundo", "como", "está", "tu", "dia"};
        String[] producto = new String[palabras.length];
        int contador = 0;

        // Filtrar palabras de 3 letras o menos
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() <= 3) {
                producto[contador] = palabras[i];
                contador++;
            }
        }

        // Crear nuevo arreglo con tamaño exacto
        String[] productoFinal = new String[contador];
        for (int i = 0; i < contador; i++) {
            productoFinal[i] = producto[i];
        }

        System.out.println();
        System.out.println("Palabras de 3 letras o menos: ");
        for (int i = 0; i < productoFinal.length; i++) {
            System.out.print("palabra: ");
            System.out.print(productoFinal[i]);
            System.out.println();
        }
    }
}