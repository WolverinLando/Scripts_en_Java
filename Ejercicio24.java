/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  17-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 *
 * Algoritmo que calcula la tercera parte de un número y realiza otras operaciones.
 */

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        // Crear objeto Scanner para entrada de datos
        Scanner orlando = new Scanner(System.in);

        // Obtener el número ingresado por el usuario
        int numero = obtenerNumero(orlando);

        // Calcular la mitad de la tercera parte del doble del número
        int resultado = calcularResultado(numero);

        // Mostrar el resultado
        mostrarResultado(numero, resultado);
    }

    // Método para obtener el número ingresado por el usuario
    private static int obtenerNumero(Scanner scanner) {
        System.out.print("Ingresa un numero: ");
        return scanner.nextInt();
    }

    // Método para calcular la mitad de la tercera parte del doble de un número
    private static int calcularResultado(int numero) {
        int resultado1 = numero * 2;
        int resultado2 = resultado1 / 3;
        return resultado2 / 2;
    }

    // Método para mostrar el resultado
    private static void mostrarResultado(int numero, int resultado) {
        System.out.println("La mitad de la tercera parte del doble de " + numero + " es: " + resultado);
    }
}

