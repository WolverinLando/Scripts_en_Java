/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  28-07-2023
 * Correo: urbanorlando79@gmail.com
 *
 * Ejercicio: Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayuscula */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letra;
        System.out.print("Ingresa una letra: ");
        letra = scanner.nextLine();

        if(letra.length() == 1 && letra.charAt(0) >= 'A' && letra.charAt(0) <= 'Z'){
            System.out.println("La letra " + letra + " es mayuscula");
        } 
		  else{
            System.out.println("La letra " + letra + " es minuscula");
        }

    }
}

