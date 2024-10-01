/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 *
 * Algoritmo que calcula el saldo de sus clientes, para no generar intereses y dependiendo del año hacer un descuento */

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
     	double saldoActual = 0, pagoActual = 0, saldoAnterior = 0, saldoMinimo = 0, pagoInteres = 0, montoCompras = 0, deposito = 0;
        int clientes;
        String[] nombres = new String[20];
		// Creacion de objetos
        Scanner orlando = new Scanner(System.in);
		// Datos de entrada
        System.out.print("Número de clientes: ");
        clientes = orlando.nextInt();
		for(int i = 0; i < clientes; i++){
            System.out.print("Nombre del cliente: ");
            nombres[i] = orlando.next();
			System.out.print("Saldo anterior: ");
            saldoAnterior = orlando.nextDouble();
            System.out.print("Último depósito: ");
            deposito = orlando.nextDouble();
			System.out.print("Monto por ventas: ");
            montoCompras = orlando.nextDouble();
			System.out.print("Saldo actual: ");
            saldoActual = orlando.nextFloat();

            pagoActual = (saldoActual * 0.12) + 200;
            saldoMinimo = saldoActual * 0.15;
            pagoInteres = saldoActual * 0.85;
			// Impresion de resultados
            System.out.print("Tu saldo actual " + nombres[i] + ", es de: $" + pagoActual + "\n");
            System.out.print("Tu pago mínimo " + nombres[i] + ", es de: $" + saldoMinimo + "\n");
            System.out.print("El pago para no generar intereses " +nombres[i] + ", es de: $" +  pagoInteres + "\n");
        }
    }
}

