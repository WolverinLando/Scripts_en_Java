/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 * Algoritmo que suma tres números
 */

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        // Crear objeto Scanner para entrada de datos
        Scanner orlando = new Scanner(System.in);

        // Obtener los tres números
        int numero1 = obtenerNumero(orlando, 1);
        int numero2 = obtenerNumero(orlando, 2);
        int numero3 = obtenerNumero(orlando, 3);

        // Sumar los tres números
        int sumaTotal = sumarNumeros(numero1, numero2, numero3);

        // Mostrar el resultado de la suma
        mostrarResultado(sumaTotal);
    }

    // Método para obtener un número del usuario
    private static int obtenerNumero(Scanner scanner, int numero) {
        System.out.print("Número " + numero + ": ");
        return scanner.nextInt();
    }

    // Método para sumar los tres números
    private static int sumarNumeros(int numero1, int numero2, int numero3) {
        return numero1 + numero2 + numero3;
    }

    // Método para mostrar el resultado de la suma
    private static void mostrarResultado(int sumaTotal) {
        System.out.println("Suma total: " + sumaTotal);
    }
}

