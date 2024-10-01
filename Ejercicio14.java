/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 *
 * Algoritmo que calcula la cantidad de euros a monedas y viceversa */

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        System.out.println("-------- MENU DE CONVERSIONES --------\n1) Euros\n2) Dolares" );
        int opcion, dinero;
		// Creacion de objeto  
		Scanner orlando = new Scanner(System.in);
		// Entrada de datos
        System.out.print("Elige una opción: ");
        opcion = orlando.nextInt();
		// Condicionales
        if(opcion == 1){
            System.out.print("Dinero: ");
            dinero = orlando.nextInt();
            System.out.print("Dinero: " + (dinero / 16.89) + " dolares\n");
        }
		else if(opcion == 2){
            System.out.print("Dinero: ");
            dinero = orlando.nextInt();
            System.out.print("Dinero: " + (dinero / 0.053) + "Euros\n");
        } 
		else{
            System.out.println("Opción no válida");
        }
    }
}

