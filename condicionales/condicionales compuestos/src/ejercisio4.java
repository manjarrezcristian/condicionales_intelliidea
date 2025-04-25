import java.util.Scanner;

public class ejercisio4 {
    public static void main(String[] args) {

/**¿Se puede viajar o no?
 Pide la edad y si tiene pasaporte
 (1 para sí, 0 para no). Si tiene más de 18 y tiene pasaporte,
 puede viajar. Si no, no.**/
        Scanner leer = new Scanner(System.in);
/**definir variables**/
        double edad = 0;
        double pasaporte = 0;
/**solicitar datos**/
        System.out.println("ingresa tu edad");
        edad = leer.nextDouble();
        System.out.print("¿Tienes pasaporte? (1 para sí, 0 para no): ");
        pasaporte = leer.nextDouble();
        if (edad >= 18 && pasaporte == 1) {
            System.out.println("puedes viajar");
        }
        else {
            System.out.println("no puedes viajar");

        }

    }
}