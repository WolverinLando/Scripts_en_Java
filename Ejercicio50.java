/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  28-07-2023
 * Correo: urbanorlando79@gmail.com
 *
 * Ejercicio: Escribir una cadena y ver cuanto mide */

import java.util.Scanner;

public class Ejercicio50 {
    public static void main(String[] args) {
        Scanner Orlando = new Scanner(System.in);
        String Palabra;
		  int Longitud;
		  System.out.print("Palabra: ");
        Palabra  = Orlando.next();

        Longitud = Palabra.length();
        System.out.println("Longitud: " + Longitud);

    }
}


