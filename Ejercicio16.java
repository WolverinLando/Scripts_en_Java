/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com 
 *
 * Algoritmo que calcula el presupuesto anual en tres areas de un hospital */

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        double presupuesto;
		// Creacion de objeto
        Scanner orlando = new Scanner(System.in);
		// Datos de entrada
        System.out.print("Presupuesto anual: ");
        presupuesto = orlando.nextInt();
        System.out.print("Presupuesto Urgencias: $" + (presupuesto * 0.37) + "\n");
        System.out.print("Presupuesto Pediatria: $" + (presupuesto * 0.42) + "\n");
        System.out.print("Presupuesto Traumatologia: $" + (presupuesto * 0.21) + "\n");
    }
}

