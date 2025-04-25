import java.util.Scanner;

public class ejercisio3 {
    public static void main(String[] args) {
    /**Validación de pago
     Pide el monto pagado. Si es igual o mayor al valor
     de una entrada ($50.000), imprimir “Pago
     completo”; si no, “Pago insuficiente”.**/
    Scanner leer = new Scanner(System.in);
    /**definir variables**/
    double valor = 0;
    /**solicitar datos**/
        System.out.println("ingrese el valor pagado");
        valor = leer.nextDouble();
        if (valor >= 50000) {
            System.out.println("pago completo");
        }
    else {
            System.out.println("pago insuficiente");


}
}
}