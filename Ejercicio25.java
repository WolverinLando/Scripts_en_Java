/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  17-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 * Algoritmo para calcular el factorial de un número
 */

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        // Crear objeto Scanner para entrada de datos
        Scanner orlando = new Scanner(System.in);

        // Obtener el número ingresado por el usuario
        int numero = obtenerNumero(orlando);

        // Calcular el factorial del número
        long factorial = calcularFactorial(numero);

        // Mostrar el resultado
        mostrarResultado(numero, factorial);
    }

    // Método para obtener el número ingresado por el usuario
    private static int obtenerNumero(Scanner scanner) {
        System.out.print("Ingresa un numero: ");
        return scanner.nextInt();
    }

    // Método para calcular el factorial de un número
    private static long calcularFactorial(int numero) {
        long resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Método para mostrar el resultado
    private static void mostrarResultado(int numero, long resultado) {
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }
}

