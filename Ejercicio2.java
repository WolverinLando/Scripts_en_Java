/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 *
 * Algoritmo que calcula el precio total de una persona */

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
		float precioKilometro, distancia;
        // Creacion de objeto 
		Scanner orlando = new Scanner(System.in);
		// Datos de entrada
        System.out.println("Precio por kilometro: ");
		precioKilometro = orlando.nextFloat();
  		System.out.println("Cantidad de kilómetros a recorrer:");
        distancia = orlando.nextFloat();
		System.out.println("Precio del boleto: $" + precioKilometro * distancia + "\n");
    }
}
