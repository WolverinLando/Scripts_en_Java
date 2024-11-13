/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 *
 * Algoritmo para calcular el descuento de un medicamento.
 */

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        // Mostrar mensaje de bienvenida
        mostrarBienvenida();

        // Obtener los datos del cliente y el precio del medicamento
        String nombre = obtenerNombreCliente();
        double precio = obtenerPrecioMedicamento();

        // Calcular el total con el descuento
        double total = calcularDescuento(precio);

        // Mostrar el resultado final
        mostrarResultado(nombre, total);
    }

    // Método para mostrar un mensaje de bienvenida
    private static void mostrarBienvenida() {
        System.out.println("Bienvenido al sistema de cálculo de descuento para medicamentos.");
    }

    // Método para obtener el nombre del cliente
    private static String obtenerNombreCliente() {
        Scanner orlando = new Scanner(System.in);
        System.out.print("Nombre del cliente: ");
        return orlando.next();
    }

    // Método para obtener el precio del medicamento
    private static double obtenerPrecioMedicamento() {
        Scanner orlando = new Scanner(System.in);
        System.out.print("Precio del medicamento: ");
        return orlando.nextDouble();
    }

    // Método para calcular el total con el descuento del 35%
    private static double calcularDescuento(double precio) {
        return precio - (precio * 0.35);
    }

    // Método para mostrar el resultado final con el nombre del cliente y el total
    private static void mostrarResultado(String nombre, double total) {
        System.out.printf("Cliente: %s, el total a pagar es: $%.2f%n", nombre, total);
    }
}

