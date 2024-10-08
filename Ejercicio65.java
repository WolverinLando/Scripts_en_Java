/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  28-07-2023
 * Correo: urbanorlando79@gmail.com
 *
 * Ejercicio: Determina si un numero es priemo (Un numero es primo si es divisible entre 1 y entres si mismo */

import java.util.Scanner;

public class Ejercicio65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        int Numero = scanner.nextInt();
        int Contador = 0;

        for (int i = 1; i <= Numero; i++) {
            if (Numero % i == 0) {
                Contador++;
            }
        }

        if (Contador > 2) {
            System.out.println("No es primo");
        } else {
            System.out.println("Es primo");
        }

    }
}

