/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  17-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 * Algoritmo que calcula la calificación de N alumnos y obtiene el promedio general
 */

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        // Crear objeto Scanner para entrada de datos
        Scanner orlando = new Scanner(System.in);

        // Obtener la cantidad de alumnos
        int numAlumnos = obtenerNumeroAlumnos(orlando);

        // Calcular el promedio de las edades de los alumnos
        double promedio = calcularPromedioEdades(orlando, numAlumnos);

        // Mostrar el resultado
        mostrarPromedio(promedio);
    }

    // Método para obtener el número de alumnos
    private static int obtenerNumeroAlumnos(Scanner scanner) {
        System.out.print("¿Cuántos alumnos hay en el salón?: ");
        return scanner.nextInt();
    }

    // Método para calcular el promedio de las edades de los alumnos
    private static double calcularPromedioEdades(Scanner scanner, int numAlumnos) {
        double sumaEdades = 0;
        for (int i = 1; i <= numAlumnos; i++) {
            System.out.print("Edad del alumno " + i + ": ");
            int edad = scanner.nextInt();
            sumaEdades += edad;
        }
        return sumaEdades / numAlumnos;
    }

    // Método para mostrar el promedio calculado
    private static void mostrarPromedio(double promedio) {
        System.out.println("El promedio de las edades de los alumnos es: " + promedio);
    }
}

