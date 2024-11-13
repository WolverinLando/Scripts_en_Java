/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 *
 * Algoritmo para determinar el costo que tendrá realizar una llamada telefónica */

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int tiempo;
        double costo;

        // Creación del objeto Scanner
        Scanner orlando = new Scanner(System.in);

        // Entrada para el tiempo de la llamada con validación
        System.out.print("Tiempo de la llamada en minutos: ");
        tiempo = orlando.nextInt();
        if (tiempo <= 0) {
            System.out.println("Error: El tiempo de la llamada debe ser un valor positivo.");
            return;
        }

        // Entrada para el costo por minuto con validación
        System.out.print("Costo por minuto en pesos: ");
        costo = orlando.nextDouble();
        if (costo <= 0) {
            System.out.println("Error: El costo por minuto debe ser un valor positivo.");
            return;
        }

        // Cálculo del costo total
        double costoTotal = tiempo * costo;

        // Salida del resultado con formato
        System.out.printf("Costo total de la llamada: $%.2f%n", costoTotal);
    }
}

