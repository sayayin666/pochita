public class Exc10 {
    public static void main(String[] args) {
        int num = 1000;

        while (num < 1300) {
            System.out.println(num);
            num++;

            if(num == 1234) {
                System.out.println("acceso admitido");
            }
            else {
                System.out.println("acceso denegado");
            }
        }
    }
}
