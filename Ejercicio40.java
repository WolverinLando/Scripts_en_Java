/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  28-07-2023
 * Correo: urbanorlando79@gmail.com
 *
 * Ejercicio: Realiza un codigo que imprima los numeros de 5 en 5 hasta donde el usuario digite. */
import java.util.Scanner;

public class Ejercicio40 {
    public static void main(String[] args) {
        Scanner Orlando = new Scanner(System.in);
        int Numero;
        System.out.print("Ingresa un numero: ");
        Numero = Orlando.nextInt();

        for (int i = 1; i <= Numero; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }
}

