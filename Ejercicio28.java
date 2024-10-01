/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  17-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 * Algoritmo que imprima un arbol de navidad */

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
		int altura, espacios, tronco;
		// Creacion de objeto
		Scanner orlando = new Scanner(System.in);
		// Datos de entrada
        System.out.print("Altura del árbol: ");
        altura = orlando.nextInt();
		for(int i = 1; i <= altura; i++){
        	espacios = altura - i;
            // Imprimir espacios en blanco
            for(int j = 1; j <= espacios; j++){
                System.out.print(" ");
            }  
			// Imprimir asteriscos
            for(int j = 1; j <= (2 * i - 1); j++){
                System.out.print("*");
            }
				System.out.println();
        }

        tronco = altura - 1;
        // Imprimir el tronco del árbol
        for(int i = 1; i <= 2; i++){
            for(int j = 1; j <= tronco; j++){
                System.out.print(" ");
            }
            System.out.println("**");
        }
    }
}

