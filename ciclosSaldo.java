public class ciclosSaldo {
    public static void main(String[] args) {
        int saldo = 5;
        int deposito = 360;
        if(deposito>=0) {
            saldo = saldo + deposito;
            System.out.println("el nuevo saldo es: " + saldo);
        }
    }
}