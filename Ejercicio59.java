/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  28-07-2023
 * Correo: urbanorlando79@gmail.com
 *
 * Ejercicio:Realiza un programa que calcule la aceptacion de una solicitud en base a los siguientes parametros: edad, nota y sexo.
* Minimo: Nota (5), edad (18), sexo M -> POSIBLE
* Minimo: Nota (5), edad (18), sexo F -> ACEPTADA
* Otros casos -> NO ACEPTADA */

import java.util.Scanner;

public class Ejercicio59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu calificación obtenida: ");
        String Nota = scanner.next();

        System.out.print("Ingresa tu edad: ");
        String Edad = scanner.next();

        System.out.print("Ingresa sexo: ");
        String Sexo = scanner.next();

        if (Nota.equals("5") && Edad.equals("18") && Sexo.equals("M")) {
            System.out.println("Solicitud (" + Nota + "), Edad (" + Edad + "), sexo (" + Sexo + ") ---> SOLICITUD POSIBLE");
        } else if (Nota.equals("5") && Edad.equals("18") && Sexo.equals("F")) {
            System.out.println("Solicitud (" + Nota + "), Edad (" + Edad + "), sexo (" + Sexo + ") ---> SOLICITUD ACEPTADA");
        } else {
            System.out.println("SOLICITUD NO ACEPTADA");
        }

        
    }
}

