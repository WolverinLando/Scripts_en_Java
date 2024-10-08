/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  28-07-2023
 * Correo: urbanorlando79@gmail.com
 *
 * Ejercicio: Realizar la serie Fibonacci */ 

import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner Orlando = new Scanner(System.in);
        int Numero, x = 0, y = 1, z = 1;
        System.out.print("Ingresa un numero: ");
        Numero = Orlando.nextInt();
         System.out.print("1, ");

        for (int i = 1; i <= Numero; i++) {
            z = x + y;
            x = y;
            y = z;
            System.out.print(z);
            if (i < Numero) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

