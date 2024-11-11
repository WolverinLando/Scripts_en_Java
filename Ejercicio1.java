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
        System.out.println("Ingresa la calificación obtenida: (0-10)");
        int calificacion = orlando.nextInt();

        // Evaluamos el valor de entrada
        if (calificacion >= 0 && calificacion <= 5) {
            System.out.println("Tu calificación es: F");
        } else if (calificacion == 6 || calificacion == 7) {
            System.out.println("Tu calificación es: D");
        } else if (calificacion == 8) {
            System.out.println("Tu calificación es: C");
        } else if (calificacion == 9) {
            System.out.println("Tu calificación es: B");
        } else if (calificacion == 10) {
            System.out.println("Tu calificación es: A");
        } else {
            System.out.println("Calificación inválida");
        }
    }
}


