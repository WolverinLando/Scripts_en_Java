/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 *
 * Algoritmo que determina el precio del boleto de un viaje */
 
import java.util.Scanner;

public class Ejercicio13 {
   public static void main(String[] args){
       double numKilometros;
	   // Creacion de objeto
       Scanner orlando = new Scanner(System.in);
	   // Entrada de datos
       System.out.print("Numero de kilometros a recorre: ");
       numKilometros = orlando.nextDouble();
       System.out.print("Precio del boleto: $" + (numKilometros * 20.50) + "\n");
   }
}
