import java.util.Scanner;

public class ejercisio5 {
    public static void main(String[] args) {

    /**Inicio de sesión por nombre y clave
     Pide nombre y clave.
     Si ambos coinciden con “admin” y “clave123”, mostrar “Bienvenido”; si no,
     “Datos incorrectos”.
     **/
Scanner leer = new Scanner(System.in);
/**definir variables**/

        System.out.print("Nombre de usuario: ");
        String usuario = leer.nextLine();

        System.out.print("Clave: ");
        String clave = leer.nextLine();
        if (usuario.equals("admin") && clave.equals("123")) {
            System.out.println("Bienvenido");
        } else {
            System.out.println("Datos incorrectos");
        }

}
}
