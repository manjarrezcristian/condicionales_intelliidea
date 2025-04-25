import java.util.Scanner;

public class ejercisio7 {
    public static void main(String[] args) {
 /**Comparar dos números
  Pide dos números. Si el primero es mayor al segundo,
  imprime la diferencia entre ambos.**/
 Scanner leer = new Scanner(System.in);
 /**definir variables**/
double numerouno =0;
double numerodos = 0;
double diferencia = 0;
        System.out.println("ingrese el primer numero");
        numerouno = leer.nextDouble();
        System.out.println("ingrese el segundo numero");
        numerodos = leer.nextDouble();
        if (numerouno > numerodos){
            diferencia = numerouno-numerodos;
            System.out.println("La diferencia es: "+diferencia);
        }




}
}
