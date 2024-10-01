/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 *
 * Algoritmo para calcular el tiempo que tarda un persona en hacer un recorrido */
 
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
    	double velocidad, distancia;
		// Creacion de objeto
        Scanner orlando = new Scanner(System.in);
        // Datos en entrada
		System.out.println("Velocidad en (km/h):");
        velocidad = orlando.nextDouble();
        System.out.println("Distancia recorrida:");
        distancia = orlando.nextDouble();
        System.out.print("Tiempo: " + (velocidad * distancia) / 60 + " horas\n");
    }
}
