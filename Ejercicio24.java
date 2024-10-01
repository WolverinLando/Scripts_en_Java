/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  17-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 *
 * Algoritmo que calcula la tercera parte de un numero */

import java.util.Scanner;

public class Ejercicio24 {
	public static void main(String[] args){
		 int numero, resultado1 = 0, resultado2 = 0, total = 0;
		 // Creacion  de objeto
 		 Scanner orlando = new Scanner(System.in);
		 // Datos de entrada
		 System.out.print("Ingresa un numero: ");
		 numero = orlando.nextInt();
		 resultado1 = numero * 2;
		 resultado2 = resultado1 / 3;
		 total = resultado2 / 2;
		 System.out.print("La mitad de la tercera parte del doble de " + numero + " es: " + total + "\n");
	}
}

