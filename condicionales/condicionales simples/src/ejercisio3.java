import java.util.Scanner;

public class ejercisio3 {

    public static void main(String[] args) {
/**si el valor de una compra supera los cien mil debe aplicar
 * un 10% de descuento mostrar el valor con descuento si aplica**/
Scanner leer = new Scanner(System.in);
/**definir variables**/
double precio = 0;
double valorfinal = 0;
/**solicitar datos**/
        System.out.println("cual es el precio del producto que compro?");
precio = leer.nextDouble();
if(precio>=100.000){
    double preciodescuento = precio * 0.10;
    valorfinal = precio - preciodescuento;
    System.out.println("el precio del producto es : "+ valorfinal);
}


    }

}
