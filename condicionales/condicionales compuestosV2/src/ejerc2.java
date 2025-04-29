import java.util.Scanner;

public class ejerc2 {
    public static void main(String[] args) {

/**Cálculo de salario semanal
 Pide al usuario las horas trabajadas en una semana y el valor por hora.
 o Calcula: salario base (horas * valor), descuento del 4% por pensión,bonificación del
 10% si trabajó más de 48 horas, y retención del 8% si el salario es mayor a $1.000.000.
 o Usa if–else para decidir si aplica bonificación o no.**/

        Scanner leer = new Scanner(System.in);
/**definir variables**/
        double horas = 0;
        double valor_hora = 0;
        double salario_base = 0;
        double salarioTotal = 0;
        double salario_sin_pension = 0;
        double bonificacion = 0;
        double retencion = 0;
        double descuento_pension = 0;

/**solicitar datos**/
        System.out.println("ingrese las horas laboradas de esta semana");
        horas = leer.nextDouble();
        System.out.println("ingrese el valor hora");
        valor_hora = leer.nextDouble();
        /**empezamos a hacer las operaciones**/

        salario_base = valor_hora * horas;
        descuento_pension = salario_base * 0.04;

        salario_sin_pension = salario_base - descuento_pension;


        if (horas >= 48) {
            bonificacion = salario_sin_pension * 0.10;

        }
        if (salario_sin_pension >= 1000000) {
            retencion = salario_sin_pension * 0.08;

        }
        salarioTotal = salario_sin_pension + bonificacion - retencion;

        System.out.println("usted se gana" + salario_base);
        System.out.println("usted se gana" + salario_sin_pension);
        System.out.println("usted se gana" + salarioTotal);
    }
}