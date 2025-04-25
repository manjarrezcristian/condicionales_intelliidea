import java.util.Scanner;

public class ejercisio1 {
    public static void main(String[] args) {

/**ejecrisio mayor de edad debe solicitar la edad de una persona y
 * decir si es mayor de edad si tiene mas de 18 años**/
        Scanner leer = new Scanner(System.in);
/**definir variables**/
double edad = 0;
/**solicitar datos**/
        System.out.println("ingrese su edad");
        edad = leer.nextDouble();
        if (edad >= 18) {
            System.out.println("mayor de edad");
        }
    }
}