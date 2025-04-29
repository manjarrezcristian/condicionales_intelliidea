import java.util.Scanner;

public class ejerc3 {
    public static void main(String[] args) {
        /**Control de stock y utilidad en ventas
         Pide el precio de compra, precio de venta y cantidad de productos vendidos.
         Calcula: ingreso total, costo total, utilidad total, porcentaje de ganancia, y compara si la
         utilidad fue mayor a $300.000.
         oUsa if–else para evaluar si fue una buena venta.
         **/
        Scanner leer = new Scanner(System.in);

        double precio_de_compra = 0;
        double precio_de_venta = 0;
        double cantidad = 0;
        double ingreso_total = 0;
        double costo_total = 0;
        double utilidad_total = 0;
        double porcentaje_de_ganancia = 0;

        System.out.println("ingrese por favor el precio de compra");
        precio_de_compra = leer.nextDouble();
        System.out.println("ingrese por favor el precio de venta");
        precio_de_venta = leer.nextDouble();
        System.out.println("ingrese los productos vendidos");
        cantidad = leer.nextDouble();

        ingreso_total = precio_de_venta * cantidad;
        utilidad_total = (precio_de_venta * cantidad) - (precio_de_compra * cantidad);
        costo_total = precio_de_compra * cantidad;
        porcentaje_de_ganancia = (utilidad_total / costo_total) * 100;

        System.out.println("\n--- Resultados ---");
        System.out.println("Ingreso total: $" + ingreso_total);
        System.out.println("Costo total: $" + costo_total);
        System.out.println("Utilidad total: $" + utilidad_total);
        System.out.printf("Porcentaje de ganancia: %.2f%%\n", porcentaje_de_ganancia);

        // Evaluar si fue una buena venta
        if (utilidad_total > 300000) {
            System.out.println("¡Fue una buena venta! Ganancia mayor a $300.000.");
        } else {
            System.out.println("La venta no generó suficiente ganancia.");
        }

        leer.close();


    }
}