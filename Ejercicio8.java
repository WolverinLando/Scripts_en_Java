/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 *
 * Algoritmo para determinar el pago que debe realizar una persona por el consumo de agua */

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
   		int precioMetros, metros;
        // Creacion de objeto
		Scanner orlando = new Scanner(System.in);
		// Datos de entrada
		System.out.print("Ingresa el precio por metro: ");
        precioMetros = orlando.nextInt();
        System.out.print("Metros trabajados: ");
        metros = orlando.nextInt();
		System.out.printf("Pago: $" + (precioMetros * metros) + "\n");
    }
}

