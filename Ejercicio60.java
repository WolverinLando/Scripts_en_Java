/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  28-07-2023
 * Correo: urbanorlando79@gmail.com
 *
 * Ejercicio: Realiza un programa que clasifique un triangulo tras recibir el tamano de sus lados. Se debe clasificar como: triangulo rectangulo, isosceles, equilatero o escaleno */

import java.util.Scanner;

public class Ejercicio60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Lado_1, Lado_2, Lado_3;
        System.out.print("Ingresa el tamaño del lado 1: ");
        Lado_1 = scanner.nextInt();

        System.out.print("Ingresa el tamaño del lado 2: ");
        Lado_2 = scanner.nextInt();

        System.out.print("Ingresa el tamaño del lado 3: ");
        Lado_3 = scanner.nextInt();

        if (Lado_1 > Lado_2 && Lado_1 > Lado_3) {
            if (Lado_1 * Lado_1 == Lado_2 * Lado_2 + Lado_3 * Lado_3) {
                System.out.println("ES UN TRIÁNGULO RECTÁNGULO");
            }
        } else if (Lado_2 > Lado_1 && Lado_2 > Lado_3) {
            if (Lado_2 * Lado_2 == Lado_1 * Lado_1 + Lado_3 * Lado_3) {
                System.out.println("ES UN TRIÁNGULO RECTÁNGULO");
            }
        } else if (Lado_3 > Lado_1 && Lado_3 > Lado_2) {
            if (Lado_3 * Lado_3 == Lado_1 * Lado_1 + Lado_2 * Lado_2) {
                System.out.println("ES UN TRIÁNGULO RECTÁNGULO");
            }
        } else if ((Lado_1 == Lado_2 && Lado_1 != Lado_3) || (Lado_1 == Lado_3 && Lado_1 != Lado_2) || (Lado_2 == Lado_3 && Lado_2 != Lado_1)) {
            System.out.println("ES UN TRIÁNGULO ISÓSCELES");
        } else if (Lado_1 == Lado_2 && Lado_3 == Lado_2) {
            System.out.println("ES UN TRIÁNGULO EQUILÁTERO");
        } else {
            System.out.println("ES UN TRIÁNGULO ESCALENO");
        }

    }
}

