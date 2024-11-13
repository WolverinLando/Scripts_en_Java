/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 *
 * Algoritmo para leer calificaciones de N alumnos y determinar el número de aprobados y reprobados */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int alumnos, aprobados = 0, reprobados = 0;
        double calificacion;

        // Creación del objeto Scanner
        Scanner orlando = new Scanner(System.in);

        // Datos de entrada para la cantidad de alumnos con validación
        System.out.print("Cantidad de alumnos: ");
        alumnos = orlando.nextInt();
        if (alumnos <= 0) {
            System.out.println("Error: La cantidad de alumnos debe ser un número positivo.");
            return;
        }

        // Ciclo para ingresar y evaluar cada calificación
        for (int i = 0; i < alumnos; i++) {
            System.out.printf("Calificación del alumno %d (1-100): ", i + 1);
            calificacion = orlando.nextDouble();

            // Validación de la calificación
            if (calificacion < 1 || calificacion > 100) {
                System.out.println("Error: La calificación debe estar entre 1 y 100.");
                i--;  // Repetir la entrada para el mismo alumno
                continue;
            }

            // Evaluación de la calificación
            if (calificacion >= 70) {
                System.out.println("APROBADO");
                aprobados++;
            } else {
                System.out.println("REPROBADO");
                reprobados++;
            }
        }

        // Resultados finales
        System.out.printf("Total de aprobados: %d%n", aprobados);
        System.out.printf("Total de reprobados: %d%n", reprobados);
    }
}

