/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  18-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 * Algoritmo que almacena calificaciones de alumnos y calcula su promedio */

import java.util.Scanner;

public class Ejercicio29{
	public static void main (String[] args){
		int[] calificacion = new int[5];
		String materia; 
		double suma = 0, promedio = 0;
		// Creacion de objeto
		Scanner orlando = new Scanner(System.in);
		// Entrada de datos
		System.out.print("Materia: ");
		materia = orlando.nextLine();

		for(int i =0; i<5; i++){
			// Solcitar datos
			System.out.print("Calificacion de la unidad " + (i+1) + ": " );
			calificacion[i] = orlando.nextInt();
			suma += calificacion[i];
		}
		System.out.print("\nAsignatura: " + materia + "\n");
	   	System.out.print("Unidad 1\tUnidad 2\tUnidad 3\tUnidad 4\tUnidad 5\t Promedio\n");

	   for(int i = 0; i < 5; i++){
			 System.out.printf("%8d\t", calificacion[i]);
		}
   		// Operaciones	   
		promedio = suma / 5;
      System.out.print("Promedio: " + promedio + "\n");
	}
}
