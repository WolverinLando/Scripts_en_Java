/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 *
 * Algoritmo que determina los intereses que tiene una persona con el banco */
 
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        int tiempo, tiempoTranscurrido;
        double prestamo = 10000, interes = 0.27;
		// Creacion de objeto
        Scanner orlando = new Scanner(System.in);
		// Datos de entrada
        System.out.print("¿Año en que solicitó el préstamo?: ");
        tiempo = orlando.nextInt();
        System.out.print("Año actual: ");
        tiempoTranscurrido = orlando.nextInt();
        for(int i = tiempo; i <= tiempoTranscurrido; i++){
            prestamo = prestamo + (prestamo * interes);
            System.out.printf("El interés de " + i + " es de: $" + prestamo + "\n");
        }
    }
}

