public class switchCase {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 2;
        int resultado = 0;
        String operacion = "+";
        switch (operacion) {
            case "+":
            resultado = num1 + num2;
            System.out.println(resultado);
            break;

            case "-":
            resultado = num1 - num2;
            System.out.println(resultado);
            break;

            case "*":
            resultado = num1 * num2;
            System.out.println(resultado);
            break;

            case "/":
            resultado = num1 / num2;
            System.out.println(resultado);
            break;

        }
    }    
}
