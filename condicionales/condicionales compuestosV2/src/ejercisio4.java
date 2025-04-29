import java.util.Scanner;

public class ejercisio4 {
    public static void main(String[] args) {
        /**Costo de viaje según distancia y tipo de vehículo
         Pide: tipo de vehículo (1 para carro, 2 para moto), distancia a recorrer (km), y precio por galón.
         o Calcula: consumo estimado (km/galón), galones requeridos, costo total, y si el
         presupuesto alcanza (comparar con valor disponible).
         o Usa if–else para indicar si puede realizar el viaje o no.**/
        Scanner leer = new Scanner(System.in);

        double distancia = 0;
        double precioGalon = 0;
        double presupuesto = 0;
        double galonesRequeridos = 0;
        double costoTotal = 0;

        // Entradas
        System.out.print("Tipo de vehículo (1: carro, 2: moto): ");
        int tipoVehiculo = leer.nextInt();

        System.out.print("Distancia a recorrer (km): ");
        distancia = leer.nextDouble();

        System.out.print("Precio por galón: ");
        precioGalon = leer.nextDouble();

        System.out.print("Presupuesto disponible: ");
        presupuesto = leer.nextDouble();

        // Definir consumo por tipo de vehículo
         double consumoKmPorGalon;
        if (tipoVehiculo == 1) {
            consumoKmPorGalon = 30; // Ejemplo: un carro rinde 30 km/galón
        } else if (tipoVehiculo == 2) {
            consumoKmPorGalon = 90; // Ejemplo: una moto rinde 90 km/galón
        } else {
            System.out.println("Tipo de vehículo inválido.");
            return;
        }

        // Cálculos
         galonesRequeridos = distancia / consumoKmPorGalon;
         costoTotal = galonesRequeridos * precioGalon;

        // Resultados
        System.out.println("Consumo estimado: " + consumoKmPorGalon + " km/galón");
        System.out.println("Galones requeridos: " + galonesRequeridos);
        System.out.println("Costo total estimado del viaje: $" + costoTotal);

        // Verificar si el presupuesto alcanza
        if (presupuesto >= costoTotal) {
            System.out.println("¡Puedes realizar el viaje!");
        } else {
            System.out.println("No tienes suficiente presupuesto para el viaje.");
        }

        leer.close();


    }
}
