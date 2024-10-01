/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  17-07-2023
 * Correo: orlandourbanotrejo@gmail.com 
 * Algortimo que calcula el descuento de 3 tipos de vestidos */
 
import java.util.Scanner;

public class Ejercicio27{
	public static void main(String[] args){
		double vestido, cantidad, total = 0;
		// Creacion de objeto
		Scanner orlando = new Scanner(System.in);
		System.out.print("----VESTIDOS----\n1) Grandes $500\n2)Mediana $400\n3) Chica $300");
		// Datos de entrada
		System.out.print("\nElige la marca que deseas comprar (1-3):");
		vestido = orlando.nextInt();
		// Condiciones
		if(vestido == 1){
		 	 System.out.print("Numero de vestidos que deseas comprar: ");
			 cantidad = orlando.nextInt();
			 total = cantidad * 500;
		}
	    else if(vestido == 2){
			System.out.print("Numero de vestidos que deseas comprar: ");
           	cantidad = orlando.nextInt();
           	total = cantidad * 400;
		}
		else if(vestido == 3){
		    System.out.print("Numero de vestidos que deseas comprar: ");
           	cantidad = orlando.nextInt();
           	total = cantidad * 300;
		}
		else{
		    System.out.print("Opcion no valida");
		}
		System.out.print("Monto total de la venta: $" + total + "\n" );
	}
}
