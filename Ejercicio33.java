/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  20-07-2023 
 * Correo: urbanorlando79@gmail.com
 *
 * Ejercicio: Los alumnos de primer semestre de la carrera de Ingeniería en Sistemas Computacionales tienen que organizarse para el desfile del 20 de noviembre. Cada alumno deberá ir vestido de acuerdo al taller en el que está inscrito: Presentaran un espectáculo en la Plaza Manuel Ávila Camacho de Jilotepec (El valor por esta actividades de 1 crédito). Los Alumnos que hayan participado en la carrera tendrán 1 crédito, si logro quedar en uno de los 3 primeros lugares, tendrá 1 crédito más. Imprime el total de créditos. */

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner Orlando = new Scanner(System.in);
        int Carrera, Credito, Lugar;
		  System.out.println("Estás inscrito a un taller (1 = Si y 2 = No): ");
        Credito = Orlando.nextInt();

        if(Credito == 1){
            System.out.println("Tienes un crédito");
            System.out.println("");
            System.out.println("Participaste en la carrera (1 = si y 2 = NO)");
            Carrera = Orlando.nextInt();

            if(Carrera == 1){
                System.out.println("Tienes otro crédito");
                System.out.println("Quedaste en uno de los 3 primeros lugares");
                Lugar = Orlando.nextInt();

                if(Lugar == 1){
                    System.out.println("Genial, tienes tres créditos");
                } 
					 else if(Lugar == 2){
                    System.out.println("Tienes dos créditos");
                }
            } 
				else if(Carrera == 2){
                System.out.println("Tienes solo un crédito");
            }

        } 
		  else if(Credito == 2){
            System.out.println("Inscríbete a un taller por favor");
            System.out.println("Participaste en la carrera (1 = si y 2 = NO)");
            Carrera = Orlando.nextInt();

            if(Carrera == 1){
                System.out.println("Tienes un crédito");
                System.out.println("Quedaste en uno de los 3 primeros lugares");
                Lugar = Orlando.nextInt();

                if(Lugar == 1){
                    System.out.println("Tienes dos créditos");
                } 
					 else if(Lugar == 2){
                    System.out.println("Tienes un crédito");
                }
            }
				else if(Carrera == 2){
					 System.out.println("No tienes creditos");
				}
        } 
		  else{
            System.out.println("Opción Inválida");
        }
    }
}

