/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  28-07-2023
 * Correo: urbanorlando79@gmail.com
 *
 * Ejercicio: Convertir de grados Celcius a Fahrenheit */

import java.util.Scanner;

public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		  float Grados = 0, Conversion = 0;
        System.out.print("Grados a convertir: ");
        Grados = scanner.nextFloat();
        Conversion = (Grados * 1.8f) + 32;
        System.out.println("Conversion: " + Conversion);
    }
}

