/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 *
 * Algoritmo para determinar el pago que debe realizar una persona por el consumo de agua */

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int precioPorMetro, metrosConsumidos;

        // Creación del objeto Scanner
        Scanner orlando = new Scanner(System.in);

        // Entrada de datos con validación para el precio por metro
        System.out.print("Ingresa el precio por metro: ");
        precioPorMetro = orlando.nextInt();
        if (precioPorMetro <= 0) {
            System.out.println("Error: El precio por metro debe ser un valor positivo.");
            return;
        }

        // Entrada de datos con validación para los metros consumidos
        System.out.print("Metros consumidos: ");
        metrosConsumidos = orlando.nextInt();
        if (metrosConsumidos < 0) {
            System.out.println("Error: Los metros consumidos deben ser un valor no negativo.");
            return;
        }

        // Cálculo del pago
        int pagoTotal = precioPorMetro * metrosConsumidos;
        System.out.printf("Pago total: $%d%n", pagoTotal);
    }
}

