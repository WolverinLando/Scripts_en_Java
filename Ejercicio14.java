/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 *
 * Algoritmo que calcula la cantidad de euros a monedas y viceversa.
 */

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        // Mostrar el menú de opciones
        mostrarMenu();

        // Obtener la opción seleccionada por el usuario
        int opcion = obtenerOpcion();

        // Procesar la conversión según la opción elegida
        procesarConversion(opcion);
    }

    // Método para mostrar el menú de conversiones
    private static void mostrarMenu() {
        System.out.println("-------- MENU DE CONVERSIONES --------");
        System.out.println("1) Euros");
        System.out.println("2) Dólares");
    }

    // Método para obtener la opción seleccionada
    private static int obtenerOpcion() {
        Scanner orlando = new Scanner(System.in);
        System.out.print("Elige una opción: ");
        return orlando.nextInt();
    }

    // Método para procesar la conversión
    private static void procesarConversion(int opcion) {
        Scanner orlando = new Scanner(System.in);
        int dinero;

        if (opcion == 1) {
            // Conversión de euros a dólares
            System.out.print("Dinero en euros: ");
            dinero = orlando.nextInt();
            System.out.printf("Dinero equivalente en dólares: $%.2f%n", dinero * 1 / 16.89);
        } 
        else if (opcion == 2) {
            // Conversión de dólares a euros
            System.out.print("Dinero en dólares: ");
            dinero = orlando.nextInt();
            System.out.printf("Dinero equivalente en euros: €%.2f%n", dinero * 1 / 0.053);
        } 
        else {
            System.out.println("Opción no válida");
        }
    }
}
