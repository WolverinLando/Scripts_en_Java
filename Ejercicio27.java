/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  17-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 * Algoritmo que calcula el descuento de 3 tipos de vestidos
 */

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        // Crear objeto Scanner para entrada de datos
        Scanner orlando = new Scanner(System.in);

        // Mostrar opciones de vestidos
        System.out.println("---- VESTIDOS ----");
        System.out.println("1) Grandes $500");
        System.out.println("2) Mediana $400");
        System.out.println("3) Chica $300");

        // Solicitar elección del tipo de vestido
        int tipoVestido = obtenerTipoVestido(orlando);

        // Si la elección es válida, procesar la compra
        if (tipoVestido >= 1 && tipoVestido <= 3) {
            // Solicitar la cantidad de vestidos a comprar
            int cantidad = obtenerCantidad(orlando);

            // Calcular el total y mostrar el resultado
            double total = calcularTotal(tipoVestido, cantidad);
            mostrarTotal(total);
        } else {
            System.out.println("Opción no válida.");
        }
    }

    // Método para obtener el tipo de vestido elegido
    private static int obtenerTipoVestido(Scanner scanner) {
        System.out.print("\nElige el tipo de vestido (1-3): ");
        return scanner.nextInt();
    }

    // Método para obtener la cantidad de vestidos a comprar
    private static int obtenerCantidad(Scanner scanner) {
        System.out.print("Número de vestidos que deseas comprar: ");
        return scanner.nextInt();
    }

    // Método para calcular el total dependiendo del tipo de vestido y cantidad
    private static double calcularTotal(int tipoVestido, int cantidad) {
        double precio = 0;
        switch (tipoVestido) {
            case 1:
                precio = 500;
                break;
            case 2:
                precio = 400;
                break;
            case 3:
                precio = 300;
                break;
        }
        return precio * cantidad;
    }

    // Método para mostrar el total calculado
    private static void mostrarTotal(double total) {
        System.out.println("Monto total de la venta: $" + total);
    }
}

