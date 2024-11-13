/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com 
 *
 * Algoritmo que calcula el presupuesto anual en tres áreas de un hospital.
 */

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        // Obtener el presupuesto anual
        double presupuesto = obtenerPresupuestoAnual();

        // Calcular y mostrar los presupuestos para cada área
        mostrarPresupuesto("Urgencias", presupuesto * 0.37);
        mostrarPresupuesto("Pediatría", presupuesto * 0.42);
        mostrarPresupuesto("Traumatología", presupuesto * 0.21);
    }

    // Método para obtener el presupuesto anual
    private static double obtenerPresupuestoAnual() {
        Scanner orlando = new Scanner(System.in);
        System.out.print("Presupuesto anual: ");
        return orlando.nextDouble();
    }

    // Método para mostrar el presupuesto de una área
    private static void mostrarPresupuesto(String area, double presupuestoArea) {
        System.out.printf("Presupuesto %s: $%.2f%n", area, presupuestoArea);
    }
}

