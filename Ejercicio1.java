/* Autor: Orlando Urbano Trejo @Lando
 * Fecha: 14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 *
 * Algoritmo que calcula la letra que te corresponde dependiendo de la calificacion */

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
    Scanner orlando = new Scanner(System.in);
	// Datos de entrada
    System.out.println("Ingresa la calificacion obtenida: (0-10)");
    int calificacion = orlando.nextInt();
	// Evaluamos el valor de entrada
    switch (calificacion) {
		case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
	     System.out.println("Tu calificacion es: F");
        break;
        case 6:
        case 7:
        System.out.println("Tu calificacion es: D");
        break;
        case 8:
        System.out.println("Tu calificacion es: C");
        break;
        case 9:
        System.out.println("Tu calificacion es: B");
        break;
        case 10:
        System.out.println("Tu calificacion es: A");
        break;
        default:
        System.out.println("Calificacion invalida");
        break;
        }
    }
}





