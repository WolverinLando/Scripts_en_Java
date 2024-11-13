/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 *
 * Algoritmo que calcula la cantidad total de dinero que tienes.
 */

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        // Denominaciones de las monedas y billetes
        double[] cajero = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1, 0.50};
        double cantidadTotal = 0, dinero;

        // Creación de objeto Scanner
        Scanner orlando = new Scanner(System.in);

        // Solicitar al usuario la cantidad de cada denominación
        for(int i = 0; i < cajero.length; i++) {
            System.out.printf("Cantidad de $%.2f que tiene: ", cajero[i]);
            dinero = orlando.nextDouble();
            cantidadTotal += (dinero * cajero[i]);
        }

        // Mostrar el total de dinero al final
        System.out.printf("Total de dinero que tienes: $%.2f%n", cantidadTotal);
    }
}

