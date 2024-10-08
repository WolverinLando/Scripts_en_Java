/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  28-07-2023
 * Correo: urbanorlando79@gmail.com
 *
 * Ejercicio: Hacer un programa que considere las siguientes opciones: 1) Cubo de un numero,2) Numero par o impar, 3) Salir */

import java.util.Scanner;

public class Ejercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----MENU DE OPCIONES-----");
        System.out.println("1) Cubo de un número");
        System.out.println("2) Número par o impar");
        System.out.println("3) Salir");
        System.out.print("Elige una opción: ");
        int Opcion = scanner.nextInt();

        if (Opcion == 1) {
            System.out.print("Número: ");
            int Numero = scanner.nextInt();
            int Cubo = Numero * Numero * Numero;
            System.out.println("El cubo de " + Numero + " es " + Cubo);
        } else if (Opcion == 2) {
            System.out.print("Número: ");
            int Numero = scanner.nextInt();
            if (Numero % 2 == 0) {
                System.out.println("Número par");
            } else {
                System.out.println("Número impar");
            }
        } else if (Opcion == 3) {
            System.out.println("Fin del programa");
        } else {
            System.out.println("Opción inválida");
        }

    }
}

