/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 *
 * Algoritmo que determina el precio del boleto de un viaje en función de los kilómetros a recorrer.
 */

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        // Solicitar al usuario la cantidad de kilómetros a recorrer
        double numKilometros = obtenerKilometros();

        // Calcular y mostrar el precio del boleto
        calcularPrecioBoleto(numKilometros);
    }

    // Método para obtener los kilómetros a recorrer desde el usuario
    private static double obtenerKilometros() {
        Scanner orlando = new Scanner(System.in);
        System.out.print("Número de kilómetros a recorrer: ");
        return orlando.nextDouble();
    }

    // Método para calcular y mostrar el precio del boleto
    private static void calcularPrecioBoleto(double kilometros) {
        double precioBoleto = kilometros * 20.50;
        System.out.printf("Precio del boleto: $%.2f%n", precioBoleto);
    }
}

