import java.util.Scanner;

public class ejerc2 {
    public static void main(String[] args) {

/**pide un numero al usuario e imprime si el numero es positivo**/
        Scanner leer = new Scanner(System.in);
/**definir variables**/
        double numero = 0;
/**solicitar datos**/
        System.out.println("ingrese un numero");
        numero = leer.nextDouble();
        if (numero >= 0) {
            System.out.println("numero positivo");
        }
    }
}