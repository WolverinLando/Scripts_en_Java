/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  17-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 * Algoritmo para calcular el factorial de un numero */

import java.util.Scanner;

public class Ejercicio25{
	public static void main(String[] args){
		 int numero, resultado = 1;
		 // Creacion de objeto
		 Scanner orlando = new Scanner(System.in);
		 // Datos de entrada
		 System.out.print("Ingresa un numero: ");
		 numero = orlando.nextInt();
		 for(int i = 1; i <= numero; i++){
		 	  resultado *= i;
		 }
		 System.out.print("El factorial de " + numero + " es: " + resultado + "\n");
	}
}
