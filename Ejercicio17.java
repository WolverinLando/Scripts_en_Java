/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 *
 * Algoritmo que calcula la cantidad total de dinero que tienes */
 
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        double[] cajero = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1, 0.50};
	   	double cantidad = 0, dinero = 0;
		// Creacion de objeto
        Scanner orlando = new Scanner(System.in);
        for(int i = 0; i < 11; i++){
			// Datos de entrada 
            System.out.printf("Cantidad de " + cajero[i] + " que tiene: ");
            dinero = orlando.nextFloat();
            cantidad += (dinero * cajero[i]);
            System.out.println("Total: $" + cantidad + "\n");
        }
    }
}

