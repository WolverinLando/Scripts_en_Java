/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 *
 * Algoritmo para leer calificaciones de N alumnos y determinar el numero aprobados y reprobados */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int alumnos;
        double calificacion;
        // Creacion de objeto
		Scanner orlando = new Scanner(System.in);
		// Datos de entrada
  		System.out.print("Cantidad de alumnos: ");
        alumnos = orlando.nextInt();
        for(int i = 0; i < alumnos; i++){
			// Recabar calificaciones de alumnos
         	System.out.printf("Calificacion del alumno " + (i + 1) + "(1-100):\n");
         	calificacion = orlando.nextDouble();
				if(calificacion > 70){
         			System.out.println("APROBADO");
            } 
            else{
        		System.out.println("REPROBADO");
            }
        }
    }
}


