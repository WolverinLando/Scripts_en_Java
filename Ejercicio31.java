/* Autor: Orlando Urbano Trejo (Lando)
 * Fecha: 18-07-2023
 * Correo: urbanoorlando79@gmail.com
 
 * Ejercicio: En la cafetería de Tesji hay una urna con pelotas de colores. verde, roja y amarilla. Cada una aplica un desucento diferente en el total de tu compra. La pelota verde ofrece un 10% de descuento, la amarilla un 5% y la roja un 15%. Con base a esos datos, imprime el monto final a pagar, ya con el descuento. */

import java.util.Scanner;

public class Ejercicio31{
	public static void main(String[] args){
		Scanner Orlando = new Scanner(System.in);
	   int Pelota;
		double Compra = 0, Resultado = 0;
		System.out.print("-----CAFETERIA TESJI-----\n");
		System.out.print("1) Pelota Verde\n");
		System.out.print("2) Pelota Roja\n");
		System.out.print("3) Pelota Amarilla\n");

		System.out.print("Elige una opcion: ");
		Pelota = Orlando.nextInt();

		if(Pelota == 1){
			 System.out.print("Descuento 10%\n");
			 System.out.print("Total de tus compras: ");
			 Compra = Orlando.nextDouble();
			 Resultado = Compra - (Compra * 0.10);
			 System.out.print("Monto total: $" + Resultado + "\n");
		}
		else if(Pelota == 2){
          System.out.print("Descuento 5%\n");
          System.out.print("Total de tus compras: ");
          Compra = Orlando.nextDouble();
          Resultado = Compra - (Compra * 0.05);
          System.out.print("Monto total: $" + Resultado + "\n");
      }
      else if(Pelota == 3){
          System.out.print("Descuento 15%\n");
          System.out.print("Total de tus compras: ");
          Compra = Orlando.nextDouble();
          Resultado = Compra - (Compra * 0.15);
          System.out.print("Monto total: $" + Resultado + "\n");
      }
		else {
			 System.out.print("Opcion no valida");
		}

	}
}
