/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 * Algoritmo para determinar si eres mayor de edad
 */

import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {
        // Crear objeto Scanner para entrada de datos
        Scanner orlando = new Scanner(System.in);

        // Obtener la edad
        int edad = obtenerEdad(orlando);

        // Verificar si la persona es mayor de edad
        verificarMayorDeEdad(edad);
    }

    // Método para obtener la edad
    private static int obtenerEdad(Scanner scanner) {
        System.out.print("Edad: ");
        return scanner.nextInt();
    }

    // Método para verificar si la persona es mayor de edad
    private static void verificarMayorDeEdad(int edad) {
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}

