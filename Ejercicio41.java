/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  28-07-2023
 * Correo: urbanorlando79@gmail.com
 *
 * Ejercicio: Realiza un codigo que calcule la siguiente suma (1-2+3-4+5-6 hasta n) donde n sea ingresada por el usuario */

import java.util.Scanner;

public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner Orlando = new Scanner(System.in);
		  int Numero, Suma = 0, Pares = 0, Impares = 0, Negativos = 0;
        System.out.print("Ingresa un numero: ");
        Numero = Orlando.nextInt();
        for (int i = 1; i <= Numero; i++) {
            if (i % 2 == 0) {
                Negativos = i * -1;
                Pares += Negativos;
            } else {
                Impares += i;
            }
        }
        Suma = Pares + Impares;
        System.out.println("Suma: " + Suma);
    }
}

