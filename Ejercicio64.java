/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  28-07-2023
 * Correo: urbanorlando79@gmail.com
 *
 * Ejercicio: Escribir en lenguaje C un programa que:
1) Pida por teclado una hora en tres variables: horas, minutos y segundos (datos enteros).
2) Muestre por pantalla:
"HORA CORRECTA", en el caso de que la hora sea valida.
"HORA INCORRECTA", en el caso de que la hora no sea valida.
Nota: para que una hora sea valida, se tiene que cumplir que:
    Las horas deben ser mayor o igual que 0 y menor o igual que 23.
    Los minutos deben ser mayor o igual que 0 y menor o igual que 59.
    Los segundos deben ser mayor o igual que 0 y menor o igual que 59. */

import java.util.Scanner;

public class Ejercicio64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa las horas: ");
        int Horas = scanner.nextInt();
        System.out.print("Ingresa los minutos: ");
        int Minutos = scanner.nextInt();
        System.out.print("Ingresa los segundos: ");
        int Segundos = scanner.nextInt();

        if (Horas >= 0 && Horas <= 23 && Minutos >= 0 && Minutos <= 59 && Segundos >= 0 && Segundos <= 59) {
            System.out.println("HORA CORRECTA");
        } else {
            System.out.println("HORA INCORRECTA");
        }

        scanner.close();
    }
}

