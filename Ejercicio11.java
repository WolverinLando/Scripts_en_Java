/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 *
 * Algoritmo que calcula la multiplicación de dos números.
 */

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        // Creación del objeto Scanner
        Scanner orlando = new Scanner(System.in);

        // Solicitar y capturar los números de entrada
        double numero1 = obtenerNumero(orlando, 1);
        double numero2 = obtenerNumero(orlando, 2);

        // Calcular y mostrar el resultado
        double resultado = multiplicar(numero1, numero2);
        mostrarResultado(resultado);
    }

    // Método para solicitar un número y capturarlo
    private static double obtenerNumero(Scanner scanner, int numeroOrden) {
        System.out.print("Número " + numeroOrden + ": ");
        return scanner.nextDouble();
    }

    // Método para multiplicar dos números
    private static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    // Método para mostrar el resultado de la multiplicación
    private static void mostrarResultado(double resultado) {
        System.out.printf("Resultado: %.2f%n", resultado);
    }
}

