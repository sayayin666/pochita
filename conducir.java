public class conducir {
    public static void main(String[] args) {
        int edad = 25;
        boolean tieneLicencia = true;
        boolean tomoAlcohol = true;

        if(edad>18 && tieneLicencia == true && tomoAlcohol == false) {
            System.out.println("puede conducir");
        }
        else {
            System.out.println("no puede conducir");
        }
    }
}
