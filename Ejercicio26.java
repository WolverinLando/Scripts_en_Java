/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  17-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 * Algoritmo que calcula la calificacion de N alumnos y obtiene el promedio general */

import java.util.Scanner;

public class Ejercicio26{
	public static void main(String[] args){
		int alumno, edad;
		double suma = 0, promedio = 0;
		// Creacion de objeto
		Scanner orlando = new Scanner(System.in);
		// Datos de entrada
		System.out.print("Cuantos alumnos hay en el salon: ");
		alumno = orlando.nextInt();
		for(int i = 1; i <= alumno; i++){
			System.out.print("Edad del alumno " + i +": " );
			edad = orlando.nextInt();
			suma += edad;
		}
		// Operaciones
		promedio = suma / alumno;
		System.out.print("El promedio de las edades de los alumnos es: " + promedio + "\n");
	}
}
