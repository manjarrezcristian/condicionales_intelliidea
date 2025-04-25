import java.util.Scanner;

public class ejercisio6 {
    public static void main(String[] args) {
        /**Ingreso a evento
         Solicita la edad y el valor pagado por un usuario. Si la edad es
         mayor a 18 y pagó al menos
         50000, puede ingresar.**/
        Scanner leer = new Scanner(System.in);
        /**definir variables**/
        double edad =0;
        double valor =0;
        System.out.println("por favor ingrese su edad");
        edad = leer.nextDouble();
        System.out.println("por favor ingrese el valor cancelado");
        valor = leer.nextDouble();
        if (edad > 18 && valor >= 50000) {
            System.out.println("bienvenido, puede ingresar al evento");
        }

}

}
