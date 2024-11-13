/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 *
 * Algoritmo para determinar el sueldo semanal de N trabajadores y aplicar descuentos dependiendo de las horas trabajadas */

import java.util.Scanner;

public class Ejercicio9 {
    private static Scanner orlando = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Número de trabajadores: ");
        int trabajadores = orlando.nextInt();

        for (int i = 0; i < trabajadores; i++) {
            String nombre = obtenerNombreTrabajador(i + 1);
            double horasTrabajadas = obtenerHorasTrabajadas();
            double sueldoHora = obtenerSueldoPorHora();

            double salarioInicial = calcularSalarioInicial(horasTrabajadas, sueldoHora);
            double salarioFinal = calcularSalarioFinal(salarioInicial);

            mostrarSalario(nombre, salarioFinal);
        }
    }

    // Método para obtener el nombre del trabajador
    private static String obtenerNombreTrabajador(int numero) {
        System.out.print("Nombre del trabajador " + numero + ": ");
        return orlando.next();
    }

    // Método para obtener las horas trabajadas
    private static double obtenerHorasTrabajadas() {
        System.out.print("Horas trabajadas: ");
        return orlando.nextDouble();
    }

    // Método para obtener el sueldo por hora
    private static double obtenerSueldoPorHora() {
        System.out.print("Sueldo por hora: ");
        return orlando.nextDouble();
    }

    // Método para calcular el salario inicial
    private static double calcularSalarioInicial(double horasTrabajadas, double sueldoHora) {
        return horasTrabajadas * sueldoHora;
    }

    // Método para calcular el salario final con descuentos
    private static double calcularSalarioFinal(double salarioInicial) {
        double descuento;

        if (salarioInicial >= 0 && salarioInicial <= 150) {
            descuento = salarioInicial * 0.5;
        } else if (salarioInicial > 150 && salarioInicial <= 300) {
            descuento = salarioInicial * 0.3;
        } else if (salarioInicial > 300 && salarioInicial <= 450) {
            descuento = salarioInicial * 0.1;
        } else {
            descuento = salarioInicial; // Salario no válido
        }

        return salarioInicial - descuento;
    }

    // Método para mostrar el salario final
    private static void mostrarSalario(String nombre, double salarioFinal) {
        System.out.println("Trabajador: " + nombre);
        System.out.println("Salario final: $" + salarioFinal);
    }
}

