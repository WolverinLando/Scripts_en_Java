/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 *
 * Algoritmo que calcule el sueldo total de un empleado */

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        float horas, sueldoHora;
		// Creacion de objeto
        Scanner orlando = new Scanner(System.in);

        System.out.print("Horas trabajadas: ");
        horas = orlando.nextFloat();
		System.out.print("Sueldo por hora: ");
        sueldoHora = orlando.nextFloat();
        System.out.print("Sueldo total: $" + (sueldoHora * horas) + "\n");
    }
}

