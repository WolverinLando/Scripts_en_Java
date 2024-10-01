/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 * Algoritmo que calcula la edad de una persona en meses */

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        int edad, meses, resultado = 0;
		// Creacion de objetos
        Scanner orlando = new Scanner(System.in);
		// Datos de entrada
        System.out.print("Edad en años: ");
        edad = orlando.nextInt();
		System.out.print("¿Cuántos meses adicionales?: ");
        meses = orlando.nextInt();	
		resultado = (edad * 12) + meses;
        System.out.printf("Edad: " + resultado + " meses\n");
    }
}

