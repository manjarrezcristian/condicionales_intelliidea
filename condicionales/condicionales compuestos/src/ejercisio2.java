import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ejercisio2 {
    public static void main(String[] args) {

/**¿Mayor o menor número?
 Pide dos números y determina cuál es mayor. Si son iguales, indícalo también
 (aunque sea con
 un solo else usando == antes).
 **/
Scanner leer = new Scanner(System.in);
/**definir variables**/
double numerouno = 0;
double numerodos = 0;
/**ejecutar ejercisio**/
        System.out.println("digite el primer numero");
numerouno = leer.nextDouble();
        System.out.println("digite el segundo numero");
        numerodos = leer.nextDouble();
        if(numerouno==numerodos){
            System.out.println("los numeros son iguales");
        }
        else if(numerouno>numerodos){
            System.out.println("el primer numero el mayor al segundo numero");
        }
else {
            System.out.println("el primer numero es menor al segundo numero");
        }
}
}
