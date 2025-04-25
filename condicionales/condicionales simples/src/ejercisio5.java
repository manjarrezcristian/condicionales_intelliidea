import java.util.Scanner;

public class ejercisio5 {
    public static void main(String[] args) {
        /**pide dos numeros , si ambos son pares imprime su suma**/
        Scanner leer = new Scanner(System.in);
        /**definir variables**/
        double numerouno = 0;
        double numerodos = 0;
        double suma =0;

        System.out.println("ingresa el valor del primer numero");
        numerouno =  leer.nextDouble();
        System.out.println("ingresa el valor del segundo numero");
        numerodos = leer.nextDouble();
        if (numerouno % 2 == 0 && numerodos % 2 == 0) {
            suma = numerouno + numerodos;
            System.out.println("Ambos son pares. La suma es: " + suma);
        }


    }
}
