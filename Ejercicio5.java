/* Autor: Orlando Urbano Trejo @Lando
 * Fecha: 14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 *
 * Algoritmo que calcula la cantidad de ventas que realiza un vendedor y de acuerdo a esas ventas aplicar un descuento */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int ventas;
        int[] cantidad = new int[40];
        float totalFinal = 0, total = 0, descuento = 0;

        // Creación de objeto Scanner
        Scanner orlando = new Scanner(System.in);

        // Datos de entrada
        System.out.print("Número de ventas: ");
        ventas = orlando.nextInt();

        // Recoger los precios de las ventas
        for (int i = 0; i < ventas; i++) {
            System.out.print("Precio de la venta " + (i + 1) + ": ");
            cantidad[i] = orlando.nextInt();
            totalFinal += cantidad[i];

            // Sumar el total de las ventas para aplicar el descuento
            if (cantidad[i] < 1000) {
                total += cantidad[i];
            } else if (cantidad[i] >= 1000 && cantidad[i] <= 2000) {
                total += cantidad[i];
            } else if (cantidad[i] > 2000) {
                total += cantidad[i];
            }
        }

        // Aplicar un descuento según el total de ventas
        if (total > 5000) {
            descuento = total * 0.10f; // 10% de descuento
        } else if (total > 2000) {
            descuento = total * 0.05f; // 5% de descuento
        }

        // Calcular el total después de aplicar el descuento
        float totalConDescuento = total - descuento;

        // Mostrar el total final de las ventas y el descuento aplicado
        System.out.println("Total de las ventas (sin descuento): $" + totalFinal);
        System.out.println("Total con descuento: $" + totalConDescuento);
        System.out.println("Descuento aplicado: $" + descuento);
    }
}

