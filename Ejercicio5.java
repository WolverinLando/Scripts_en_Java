/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 *
 * Algoritmo que calcula la cantidad de ventas que realiza un vendedor y de acuerdo a esas ventas aplicar un descuento */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int ventas;
        int[] cantidad = new int[40];
        float totalFinal = 0, total = 0;
		// Creacion de objeto
        Scanner orlando = new Scanner(System.in);
		// Datos de entrada
        System.out.print("Numero de ventas: ");
        ventas = orlando.nextInt();
        for(int i = 0; i < ventas; i++){
			System.out.print("Precio de la venta " + (i + 1) + ": ");
        	cantidad[i] = orlando.nextInt();
        	totalFinal += cantidad[i];
			if(cantidad[i] < 1000){
           		total += cantidad[i];
            }
      		else if(cantidad[i] > 1000 && cantidad[i] < 2000){
                total += cantidad[i];
            }
        }
        System.out.print("Total final: " + totalFinal + "\n");
    }
}

