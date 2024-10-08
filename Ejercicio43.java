/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  28-07-2023
 * Correo: urbanorlando79@gmail.com
 *
 * Ejercicio: Hacer un programa que simule un cajero automatico con un salario inicial de 1000 */

import java.util.Scanner;

public class Ejercicio43{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Saldo = 1000;
        int Dinero = 0;
        int Nuevo_Saldo = 0;

        System.out.println("1) Ingresar dinero");
        System.out.println("2) Retirar dinero");
        System.out.println("3) Salir");

        System.out.print("Elige una opción: ");
        int Opcion = scanner.nextInt();

        if (Opcion == 1) {
            System.out.print("Cuánto dinero vas a ingresar: ");
            Dinero = scanner.nextInt();
            Nuevo_Saldo = Dinero + Saldo;
            System.out.println("Tu nuevo saldo es de: " + Nuevo_Saldo);
        } else if (Opcion == 2) {
            System.out.print("Cuánto dinero vas a retirar: ");
            Dinero = scanner.nextInt();
            if (Dinero < 1000) {
                Nuevo_Saldo = Saldo - Dinero;
                System.out.println("Tu nuevo saldo es de: " + Nuevo_Saldo);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else if (Opcion == 3) {
            System.out.println("Fin del programa");
        } else {
            System.out.println("Opción inválida");
        }

    }
}

