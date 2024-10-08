/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  28-07-2023
 * Correo: urbanorlando79@gmail.com
 *
 * Ejercicio: scribir un programa que:
1) Pida por teclado una letra (dato caracter) del abecedario.
2) Muestre por pantalla:
"ES UNA VOCAL", cuando la letra introducida sea una vocal minuscula (a, e, i, o, u) o una vocal mayuscula (A, E, I, O, U).
"NO ES UNA VOCAL", cuando la letra introducida no sea una vocal minuscula (a, e, i, o, u) ni una vocal mayuscula (A, E, I, O, U) */
import java.util.Scanner;

public class Ejercicio63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una letra del abecedario: ");
        String Letra = scanner.nextLine();
        char letraMin = Character.toLowerCase(Letra.charAt(0));

        if (letraMin == 'a' || letraMin == 'e' || letraMin == 'i' || letraMin == 'o' || letraMin == 'u') {
            System.out.println("Es una vocal");
        } else {
            System.out.println("No es una vocal. Es una letra normal");
        }

        scanner.close();
    }
}

