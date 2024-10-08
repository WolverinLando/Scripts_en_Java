/* Autor:  Orlando Urbano Trejo (Lando)
 *  Fecha:  28-07-2023 
 * Correo: urbanorlando79@gmail.com
 *
 * Ejercicio: Regresa el restante de la cadena a partir de la primera aparicion del caracter indicado */

import java.util.Scanner;

public class Ejercicio52 {
    public static void main(String[] args) {
        String Abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char Corte;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Letra donde quieres realizar el corte: ");
        Corte = scanner.next().charAt(0);

        System.out.println("Nueva Cadena");
        int index = Abecedario.lastIndexOf(Corte);
        if (index >= 0) {
            String nuevaCadena = Abecedario.substring(index);
            System.out.println(nuevaCadena);
        } else {
            System.out.println("La letra no se encuentra en el abecedario.");
        }

        scanner.close();
    }
}

