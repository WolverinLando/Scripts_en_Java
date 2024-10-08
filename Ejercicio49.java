/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  28-07-2023
 * Correo: urbanorlando79@gmail.com
 *
 * Ejercicio: Define un array de 10 numeros enteros con nombre Num y asigna 5 valores. Muestra el contenido de todos los elementos de el array */

public class Ejercicio49 {
    public static void main(String[] args) {
        int[] Num = new int[12];
        Num[1] = 2;
        Num[3] = 4;
        Num[6] = -2;
        Num[7] = 6;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Posición " + i + ": " + Num[i]);
        }
    }
}

