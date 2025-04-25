import java.util.Scanner;

public class ejercisio4 {
    public static void main(String[] args) {
        /**solicita dos notas, si ambas son mayores a 50
         * imprimir que el estudiante aprobo**/

    Scanner leer = new Scanner(System.in);
            /**definir variables**/
            double notauno = 0;
            double notados = 0;
            /**solicitar datos**/
        System.out.println("ingresar la primera nota");
        notauno = leer.nextDouble();
        System.out.println("ingresar la segunda nota");
        notados = leer.nextDouble();
        if (notauno>=50 && notados >= 50){
            System.out.println("el estudiante ha aprobado");
        }


}
}