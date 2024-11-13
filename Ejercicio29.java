/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  18-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 * Algoritmo que almacena calificaciones de alumnos y calcula su promedio
 */

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        // Crear objeto Scanner para entrada de datos
        Scanner orlando = new Scanner(System.in);

        // Declaración de variables
        int[] calificacion = new int[5];
        String materia;
        double suma = 0, promedio;

        // Solicitar el nombre de la materia
        System.out.print("Materia: ");
        materia = orlando.nextLine();

        // Solicitar las calificaciones para cada unidad
        for (int i = 0; i < 5; i++) {
            System.out.print("Calificación de la unidad " + (i + 1) + ": ");
            calificacion[i] = orlando.nextInt();
            suma += calificacion[i]; // Acumulando la suma de las calificaciones
        }

        // Imprimir los resultados
        System.out.println("\nAsignatura: " + materia);
        System.out.println("Unidad 1\tUnidad 2\tUnidad 3\tUnidad 4\tUnidad 5\tPromedio");

        // Mostrar las calificaciones de las 5 unidades
        for (int i = 0; i < 5; i++) {
            System.out.printf("%8d\t", calificacion[i]);
        }

        // Calcular el promedio
        promedio = suma / 5;

        // Mostrar el promedio
        System.out.printf("\nPromedio: %.2f\n", promedio);
    }
}

