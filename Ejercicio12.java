/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 *
 * Algoritmo que determina los intereses acumulados de un préstamo bancario.
 */

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        // Variables iniciales
        int añoPrestamo, añoActual;
        double prestamoInicial = 10000, tasaInteres = 0.27;

        // Creación del objeto Scanner
        Scanner orlando = new Scanner(System.in);

        // Solicitar el año de inicio del préstamo
        añoPrestamo = solicitarAnio(orlando, "¿Año en que solicitó el préstamo?: ");

        // Solicitar el año actual
        añoActual = solicitarAnio(orlando, "Año actual: ");

        // Calcular y mostrar el interés anual acumulado
        calcularInteresAnual(prestamoInicial, tasaInteres, añoPrestamo, añoActual);
    }

    // Método para solicitar el año y capturarlo
    private static int solicitarAnio(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    // Método para calcular el interés anual acumulado y mostrar el resultado
    private static void calcularInteresAnual(double prestamo, double tasaInteres, int añoInicio, int añoFin) {
        for (int año = añoInicio; año <= añoFin; año++) {
            prestamo += prestamo * tasaInteres;
            System.out.printf("El interés acumulado en el año %d es de: $%.2f%n", año, prestamo);
        }
    }
}

