/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  28-07-2023
 * Correo: urbanorlando79@gmail.com
 *
 * Ejercicio: Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de seis caras y muestre por pantalla el numero en letras (dato cadena) de la cara opuesta al resultado obtenido.
Nota 1: En las caras opuestas de un dado de seis caras estan los numeros: 1-6, 2-5 y 3-4.
Nota 2: Si el numero del dado introducido es menor que 1 o mayor que 6, se mostrara el mensaje: ERROR: numero incorrecto */

import java.util.Scanner;

public class Ejercicio62 {
    public static void main(String[] args) {
        Scanner Orlando = new Scanner(System.in);

        System.out.print("Ingresa la cara del dado: ");
        int Cara = Orlando.nextInt();

        switch (Cara) {
            case 1:
                System.out.println("El valor contrario de la cara es: SEIS");
                break;
            case 2:
                System.out.println("El valor contrario de la cara es: CINCO");
                break;
            case 3:
                System.out.println("El valor contrario de la cara es: CUATRO");
                break;
            case 4:
                System.out.println("El valor contrario de la cara es: TRES");
                break;
            case 5:
                System.out.println("El valor contrario de la cara es: DOS");
                break;
            case 6:
                System.out.println("El valor contrario de la cara es: UNO");
                break;
            default:
                System.out.println("ERROR: Número incorrecto");
        }

    }
}

