/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  28-07-2023
 * Correo: urbanorlando79@gmail.com
 *
 * Ejercicio: Haz un codigo que haga la suma de los primeros diez numeros pares */

public class Ejercicio34 {
    public static void main(String[] args) {
        int Suma = 0;
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                Suma += i;
            }
        }
        System.out.println("Suma: " + Suma);
    }
}

