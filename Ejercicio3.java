/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 *
 * Algoritmo que calcule el total de una caja registradora */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
    	int convertidor = 0;
        double resultado = 0, dinero[]={ 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1, .50, .20, .10};
		// Creacion de objeto
        Scanner orlando = new Scanner (System.in);
        for(int i=0; i<=12; i++){
			// Datos de entrada
	        System.out.print("Cantidad de dinero que tiene $"+ dinero[i] + ":\n");
	        convertidor = orlando.nextInt();
	        resultado += (convertidor * dinero[i]);
		}
	    System.out.print("Total almacenado: $" + resultado + "\n");
	}
}

