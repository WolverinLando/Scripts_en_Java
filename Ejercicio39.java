/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  28-07-2023
 * Correo: urbanorlando79@gmail.com
 *
 * Ejercicio: Realizar las tablas de multiplicar */

import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner Orlando = new Scanner(System.in);
        int Filas, Columnas;
        System.out.print("Numero de filas: ");
        Filas = Orlando.nextInt();

        System.out.print("Numero de columnas: ");
        Columnas = Orlando.nextInt();

        for (int i = 1; i <= Filas; i++) {
            System.out.println("\t");
            for (int j = 1; j <= Columnas; j++) {
                System.out.print(i * j + "\t");
            }
        }
        System.out.println();
    }
}

