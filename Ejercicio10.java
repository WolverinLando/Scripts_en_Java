/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 *
 * Algoritmo que calcula el saldo de sus clientes para no generar intereses, y dependiendo del año hace un descuento */

import java.util.Scanner;

public class Ejercicio10 {
    private static Scanner orlando = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Número de clientes: ");
        int clientes = orlando.nextInt();

        for (int i = 0; i < clientes; i++) {
            String nombre = obtenerNombreCliente(i + 1);
            double saldoAnterior = obtenerSaldoAnterior();
            double deposito = obtenerDeposito();
            double montoCompras = obtenerMontoCompras();
            double saldoActual = calcularSaldoActual(saldoAnterior, deposito, montoCompras);

            mostrarResultados(nombre, saldoActual);
        }
    }

    // Método para obtener el nombre del cliente
    private static String obtenerNombreCliente(int numero) {
        System.out.print("Nombre del cliente " + numero + ": ");
        return orlando.next();
    }

    // Método para obtener el saldo anterior
    private static double obtenerSaldoAnterior() {
        System.out.print("Saldo anterior: ");
        return orlando.nextDouble();
    }

    // Método para obtener el último depósito
    private static double obtenerDeposito() {
        System.out.print("Último depósito: ");
        return orlando.nextDouble();
    }

    // Método para obtener el monto por ventas
    private static double obtenerMontoCompras() {
        System.out.print("Monto por ventas: ");
        return orlando.nextDouble();
    }

    // Método para calcular el saldo actual
    private static double calcularSaldoActual(double saldoAnterior, double deposito, double montoCompras) {
        return saldoAnterior + montoCompras - deposito;
    }

    // Método para mostrar los resultados de pagos e intereses
    private static void mostrarResultados(String nombre, double saldoActual) {
        double pagoActual = calcularPagoActual(saldoActual);
        double saldoMinimo = calcularSaldoMinimo(saldoActual);
        double pagoInteres = calcularPagoInteres(saldoActual);

        System.out.printf("Tu saldo actual, %s, es de: $%.2f%n", nombre, pagoActual);
        System.out.printf("Tu pago mínimo, %s, es de: $%.2f%n", nombre, saldoMinimo);
        System.out.printf("El pago para no generar intereses, %s, es de: $%.2f%n", nombre, pagoInteres);
    }

    // Método para calcular el pago actual
    private static double calcularPagoActual(double saldoActual) {
        return (saldoActual * 0.12) + 200;
    }

    // Método para calcular el saldo mínimo
    private static double calcularSaldoMinimo(double saldoActual) {
        return saldoActual * 0.15;
    }

    // Método para calcular el pago para no generar intereses
    private static double calcularPagoInteres(double saldoActual) {
        return saldoActual * 0.85;
    }
}

