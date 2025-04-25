import java.util.Scanner;

public class ejercisio6 {
    public static void main(String[] args) {
        /**Compra con o sin descuento
         Si la compra supera los $200.000, se aplica un 15% de descuento.
         Si no, no se aplica descuento.**/
        Scanner leer = new Scanner(System.in);
        /**definir variables**/
        double valor = 0;
        double descuento = 0;
        double totalConDescuento = 0;
        /**solicitar datos**/
        System.out.println("ingrese el valor del producto");
        valor = leer.nextDouble();
        if (valor >= 200000) {
            descuento = valor * 0.15;
            totalConDescuento = valor - descuento;
            System.out.println("Se aplica un 15% de descuento.");
            System.out.println("Total a pagar con descuento: $" + totalConDescuento);
        } else {
            System.out.println("No se aplica descuento.");
            System.out.println("Total a pagar: $" + valor);
        }



}
}
