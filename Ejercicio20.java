/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 * Algoritmo que suma tres numeros */

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args){
    	int numero1, numero2, numero3;
		// Creacion de objetos
	    Scanner orlando = new Scanner(System.in);
	    // Datos de entrada
		System.out.print("Numero 1: ");
	    numero1 = orlando.nextInt();
       	System.out.print("Numero 2: ");
       	numero2 = orlando.nextInt();
       	System.out.print("Numero 3: ");
       	numero3 = orlando.nextInt();
       	System.out.print("Concatenacion: " + (numero1 + numero2 + numero3) + "\n");
    }
	
}
