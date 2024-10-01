/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 *
 * Algoritmo para determinar el costo que tendra realizar una llamada telefonica */

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int tiempo, costo;
		//Creacion de objeto
        Scanner orlando = new Scanner(System.in);
		// Datos de entrada
        System.out.print("Tiempo de la llamada en minutos: ");
        tiempo = orlando.nextInt();
        System.out.print("Costo por minuto en pesos: ");
        costo = orlando.nextInt();
        System.out.print("Costo de la llamada: $" + (tiempo * costo) + "\n");
    }
}

