/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  28-07-2023
 * Correo: urbanorlando79@gmail.com
 *
 * Ejercicio: Ingresa por teclado el nombre y el signo de cualquier persona e imprima el nombre solo si la persona es signo Aries, caso contrario imprimir "No es signo Aries" */

import java.util.Scanner;

public class Ejercicio57 {
    public static void main(String[] args) {
        String Nombre, Signo;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        Nombre = scanner.nextLine();

        System.out.print("Ingresa tu signo: ");
        Signo = scanner.nextLine();

        if(Signo.equals("Aries")){
            System.out.println("Eres signo Aries, tu nombre es: " + Nombre);
        } 
		  else{
            System.out.println("No eres signo Aries");
        }

    }
}

