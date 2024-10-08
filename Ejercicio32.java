/* Autor: Orlando Urbano Trejo (Lando)
 * Fecha: 18-07-2023
 * Correo: urbanoorlando79@gmail.com
 
 * Ejercicio: Haciendo uso de arreglos bidimensionales, solicita la calificación de las siguientes materias:
→ Cálculo Diferencial.
→ Fundamentos de programación.
→ Química.
→ Fundamentos de investigación.
→ Matemáticas Discretas.
→ Desarrollo Sustentable.
Recuerda que cada materia tiene 5 unidades, una vez obtenida cada calificación por unidad, calcula el promedio de cada materia. Finalmente, calcula el promedio general.*/

import java.util.Scanner;

public class Ejercicio32{
	public static void main(String[] args){
	    Scanner Orlando = new Scanner(System.in);
		 String[] Materia = {
			  "Calculo Diferencial",
			  "Fundamentos de Programacion",
			  "Quimica",
			  "Fundamentos de Investigación",
			  "Matemáticas Discretas",
			  "Desarrollo Sustentable"};
		 float[][] Calificaciones = new float[6][5];
		 float[] Promedio_Materias = new float[6];
		 float Promedio_Final = 0;

		 for(int i = 0; i < 6; i++){
		 	  System.out.print("Calificacion: " + Materia[i] + "\n");
			  for(int j = 0; j < 5; j++){
			  		System.out.print("Unidad " + (j+1) + ": \n");
					Calificaciones[i][j] = Orlando.nextFloat();
					Promedio_Materias[i] += Calificaciones[i][j];
			  }
			  Promedio_Materias[i] /= 5;
			  Promedio_Final += Promedio_Materias[i];
			  System.out.println();
		}
		Promedio_Final /= 6;
		System.out.println("Unidad 1\tUnidad 2\tUnidad 3\tUnidad 4\tUnidad 5\tPromedio\n");
		for(int i = 0; i < 6; i++){
			 for(int j = 0; j < 5; j++){
				  System.out.print(Calificaciones[i][j] + "\t\t");
			 }
			 System.out.println(Promedio_Materias[i]);
		}
		System.out.println("\nPromedio General: " + Promedio_Final + "\n");
	}
}
