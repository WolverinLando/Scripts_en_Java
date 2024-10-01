/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandurbanotrejo@gmail.com
 *
 * Algoritmo que calcula la multiplicacion de dos numeros */

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        double numero1, numero2;
		// Creacion de objeto
        Scanner orlando = new Scanner(System.in);
		// Datos de entrada
        System.out.print("Numero 1: ");
		numero1 = orlando.nextDouble();
        System.out.print("Numero 2: ");
        numero2 = orlando.nextDouble();
        System.out.printf("Resultado: "+ (numero1 * numero2) + "\n" );
    }
}

