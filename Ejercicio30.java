/* Autor: Orlando Urbano Trejo (Lando)
* Fecha: 18-07-2023
* Correo: urbanoorlando79@gmail.com
* Ejercicio: Haciendo uso de 2 arreglos, almacena 5 números en cada arreglo,
posteriormente vas a multiplicar los arreglo
*/

import java.util.Scanner;

public class Ejercicio30 {
	public static void main(String[] args) {
		// Crear objeto Scanner para la entrada de datos
		Scanner Orlando = new Scanner(System.in)

		// Crear 3 arreglosde tamaño 3
		int[] Primero = new int[5];
		int[] Segundo = new int[5];
		int[] Resultado = new int[5];

		// Llenar el primer arreglo
		for (int i = 0; i < 5; i++) {
			System.out.print("Valor " + (i + 1) + " para el primer arreglo: ");
			Primero[i] = Orlando.nextInt();
		}

		// Llenar el segundo arreglo (en orden inverso)
		for (int i = 4; i >= 0; i--) {
			System.out.print("Valor " + (i + 1) + " para el segundo arreglo (orden inverso): ");
			Segundo[i] = Orlando.nextInt();
