/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  28-07-2023
 * Correo: urbanorlando79@gmail.com
 *
 * Ejercicio: Escribir un programa que lea un caracter en minuscula e imprima por pantalla, el mismo caracter en mayuscula */

import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Letra_Minuscula;
		  char Letra_Mayuscula;
        System.out.print("Ingresa una letra en minúscula: ");
        Letra_Minuscula = scanner.next();
        Letra_Mayuscula = Character.toUpperCase(Letra_Minuscula.charAt(0));
        System.out.println("La letra " + Letra_Minuscula + " en minúscula es " + Letra_Mayuscula + " en mayúscula.");

    }
}

