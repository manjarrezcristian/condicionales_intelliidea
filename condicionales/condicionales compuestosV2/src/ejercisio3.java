import java.util.Scanner;

public class ejercisio3 {
    public static void main(String[] args) {

/**Simulación de compra de divisas
 Pide la cantidad de dólares que desea comprar y la tasa del día.
 o Calcula: valor en pesos, comisión del 3%, valor final con comisión, y cantidad de billetes
 de $100,000 requeridos.
 o Si el total supera $5.000.000, aplica descuento del 2%.**/

        Scanner leer = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese la cantidad de dólares que desea comprar: ");
        double cantidadDolares = leer.nextDouble();

        System.out.print("Ingrese la tasa de cambio del día (pesos por dólar): ");
        double tasaCambio = leer.nextDouble();

        // Cálculo del valor en pesos
        double valorEnPesos = cantidadDolares * tasaCambio;

        // Comisión del 3%
        double comision = valorEnPesos * 0.03;

        // Valor final con comisión
        double valorFinal = valorEnPesos + comision;

        // Aplicar descuento del 2% si el total supera $5.000.000
        double descuento = 0;
        if (valorFinal > 5000000) {
            descuento = valorFinal * 0.02;
            valorFinal -= descuento;
        }


        // Mostrar resultados
        System.out.println("\n--- Detalles de la compra ---");
        System.out.println("Valor en pesos (sin comisión): $" + valorEnPesos);
        System.out.println("Comisión (3%): $" + comision);
        System.out.println("Descuento aplicado (si aplica): $" + descuento);
        System.out.println("Valor final a pagar: $" + valorFinal);


        leer.close();
    }
}





