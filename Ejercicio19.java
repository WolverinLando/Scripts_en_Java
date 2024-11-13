/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 *
 * Algoritmo que calcule el sueldo total de un empleado.
 */

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        float horas, sueldoHora;

        // Creación de objeto Scanner
        Scanner orlando = new Scanner(System.in);

        // Entrada de datos con validación para horas trabajadas
        System.out.print("Horas trabajadas: ");
        horas = orlando.nextFloat();
        if (horas <= 0) {
            System.out.println("Error: Las horas trabajadas deben ser un valor positivo.");
            return;  // Finaliza la ejecución si el valor no es válido
        }

        // Entrada de datos con validación para sueldo por hora
        System.out.print("Sueldo por hora: ");
        sueldoHora = orlando.nextFloat();
        if (sueldoHora <= 0) {
            System.out.println("Error: El sueldo por hora debe ser un valor positivo.");
            return;  // Finaliza la ejecución si el valor no es válido
        }

        // Cálculo del sueldo total
        float sueldoTotal = horas * sueldoHora;
        System.out.printf("Sueldo total: $%.2f%n", sueldoTotal);  // Imprime el sueldo con dos decimales
    }
}

