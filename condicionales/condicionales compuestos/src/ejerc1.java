import java.util.Scanner;

public class ejerc1 {
    public static void main(String[] args) {

/**Número positivo o negativo
 Pide un número e imprime si es positivo o negativo (considera el 0 como positivo).**/
        Scanner leer = new Scanner(System.in);
/**definir variables**/
        double numero = 0;
/**solicitar datos**/
        System.out.println("ingrese un numero");
        numero = leer.nextDouble();
        if (numero >= 0) {
            System.out.println("numero positivo");
        }
        else {
            System.out.println("numero negativo");
    }
}
}