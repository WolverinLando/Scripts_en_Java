/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  17-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 * Algoritmo que imprime un árbol de navidad
 */

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        // Crear objeto Scanner para entrada de datos
        Scanner orlando = new Scanner(System.in);

        // Solicitar la altura del árbol
        System.out.print("Altura del árbol: ");
        int altura = orlando.nextInt();
        
        // Imprimir la parte superior del árbol (hojas)
        for (int i = 1; i <= altura; i++) {
            // Calcular los espacios antes de los asteriscos
            int espacios = altura - i;

            // Imprimir los espacios
            for (int j = 1; j <= espacios; j++) {
                System.out.print(" ");
            }

            // Imprimir los asteriscos
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            // Salto de línea después de cada fila del árbol
            System.out.println();
        }

        // Imprimir el tronco del árbol
        int tronco = altura - 1;
        for (int i = 1; i <= 2; i++) {
            // Imprimir espacios antes del tronco
            for (int j = 1; j <= tronco; j++) {
                System.out.print(" ");
            }

            // Imprimir el tronco (dos asteriscos)
            System.out.println("**");
        }
    }
}

