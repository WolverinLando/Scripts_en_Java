/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 *
 * Algoritmo para determinar el pago que debe realizar una persona por el consumo de agua */

import java.util.Scanner;

public class Ejercicio8 {
    private static Scanner orlando = new Scanner(System.in);

    public static void main(String[] args) {
        int precioPorMetro = obtenerPrecioPorMetro();
        int metrosConsumidos = obtenerMetrosConsumidos();
        
        if (precioPorMetro > 0 && metrosConsumidos >= 0) {
            int pagoTotal = calcularPago(precioPorMetro, metrosConsumidos);
            mostrarPagoTotal(pagoTotal);
        }
    }

    // Método para obtener el precio por metro con validación
    private static int obtenerPrecioPorMetro() {
        System.out.print("Ingresa el precio por metro: ");
        int precio = orlando.nextInt();
        if (precio <= 0) {
            System.out.println("Error: El precio por metro debe ser un valor positivo.");
        }
        return precio;
    }

    // Método para obtener los metros consumidos con validación
    private static int obtenerMetrosConsumidos() {
        System.out.print("Metros consumidos: ");
        int metros = orlando.nextInt();
        if (metros < 0) {
            System.out.println("Error: Los metros consumidos deben ser un valor no negativo.");
        }
        return metros;
    }

    // Método para calcular el pago total
    private static int calcularPago(int precioPorMetro, int metrosConsumidos) {
        return precioPorMetro * metrosConsumidos;
    }

    // Método para mostrar el pago total
    private static void mostrarPagoTotal(int pagoTotal) {
        System.out.printf("Pago total: $%d%n", pagoTotal);
    }
}

