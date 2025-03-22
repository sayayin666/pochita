public class usuario {
    public static void main(String[] args) {
        boolean cuenta = true;
        String contraseña = "clave123";

        if(cuenta == true && contraseña == "clave123") {
            System.out.println("acceso permitido");
        }
        else if(cuenta == false && contraseña == "clave123") {
            System.out.println("cuenta inactiva");
        }
        else if(cuenta == true || contraseña != "clave123") {
            System.out.println("contraseña incorrecta");
        }
    }
}
