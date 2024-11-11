/* Autor: Orlando Urbano Trejo @Lando
 * Fecha: 14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 *
 * Algoritmo para calcular el tiempo que tarda una persona en hacer un recorrido */

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        double velocidad, distancia, tiempo;

        // Creación de objeto Scanner
        Scanner orlando = new Scanner(System.in);

        // Datos de entrada
        System.out.println("Velocidad en (km/h):");
        velocidad = orlando.nextDouble();
        System.out.println("Distancia recorrida (en km):");
        distancia = orlando.nextDouble();

        // Cálculo del tiempo
        if (velocidad > 0) {
            tiempo = distancia / velocidad;  // Fórmula correcta para el tiempo en horas
            System.out.printf("Tiempo: %.2f horas\n", tiempo);
        } else {
            System.out.println("La velocidad debe ser mayor que cero.");
        }
    }
}

