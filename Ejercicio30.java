/* Autor: Orlando Urbano Trejo (Lando)
 * Fecha: 18-07-2023
 * Correo: urbanoorlando79@gmail.com
 
 * Ejercicio: Haciendo uso de 2 arreglos, almacena 5 números en cada arreglo, posteriormente vas a multiplicar los arreglos */

import java.util.Scanner;

public class Ejercicio30{
	public static void main(String[] args){
		Scanner Orlando = new Scanner(System.in);
		int[] Primero = new int[5];
		int[] Segundo = new int[5];
		int[] Resultado = new int[5];
		int Suma;
		
		for(int i = 0; i < 5; i++){
			 System.out.print(" Valor " + (i+1) + ": ");
		    Primero[i] = Orlando.nextInt();
      }
		for(int i = 4; i >= 0; i-- ){
			 Suma = i + 2;
		    System.out.print(" Valor " + (Suma-1) + ": ");
			 Segundo[i] = Orlando.nextInt();

		}
		for(int i = 0; i < 5; i++){
			 Resultado[i] = Primero[i] + Segundo[i];
		}
      for(int i = 0; i < 5; i++){
		    System.out.print(" " + Resultado[i]);
		}

	}
}
