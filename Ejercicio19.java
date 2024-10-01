/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 * Algoritmo que determina el descuento de un empleado */

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        String nombre;
        double salario, total = 0;
		// Creacion de objeto
        Scanner orlando = new Scanner(System.in);
		// Datos de entrada
        System.out.print("Nombre: ");
        nombre = orlando.next();
		System.out.print("Salario: ");
        salario = orlando.nextFloat();
		// Operaciones
		total = salario - (salario * 0.20);
		System.out.print("Empleado: " + nombre + " su salario es: $"+ total + "\n" );
    }
}

