/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 * Algoritmo que determina el descuento de un empleado
 */

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        // Crear objeto Scanner para entrada de datos
        Scanner orlando = new Scanner(System.in);

        // Obtener y mostrar información del empleado
        String nombre = obtenerNombre(orlando);
        double salario = obtenerSalario(orlando);

        // Calcular el salario con descuento
        double salarioFinal = calcularSalarioConDescuento(salario);

        // Mostrar el salario final
        mostrarResultado(nombre, salarioFinal);
    }

    // Método para obtener el nombre del empleado
    private static String obtenerNombre(Scanner scanner) {
        System.out.print("Nombre: ");
        return scanner.next();
    }

    // Método para obtener el salario del empleado
    private static double obtenerSalario(Scanner scanner) {
        System.out.print("Salario: ");
        return scanner.nextDouble();
    }

    // Método para calcular el salario después del descuento
    private static double calcularSalarioConDescuento(double salario) {
        return salario - (salario * 0.20);
    }

    // Método para mostrar el resultado final
    private static void mostrarResultado(String nombre, double salarioFinal) {
        System.out.printf("Empleado: %s, su salario es: $%.2f%n", nombre, salarioFinal);
    }
}

