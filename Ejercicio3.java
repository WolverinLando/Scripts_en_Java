/* Autor: Orlando Urbano Trejo @Lando
 * Fecha: 14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 *
 * Algoritmo que calcule el total de una caja registradora */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int cantidad;
        double resultado = 0;
        double[] dinero = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.20, 0.10};

        // Creación de objeto Scanner
        Scanner orlando = new Scanner(System.in);

        System.out.println("** Caja Registradora **");
        
        // Iterar sobre los valores de dinero y pedir la cantidad correspondiente
        for (int i = 0; i < dinero.length; i++) {
            System.out.printf("Cantidad de billetes o monedas de $%.2f: ", dinero[i]);
            
            // Verificar que el usuario ingrese un valor entero válido
            while (!orlando.hasNextInt()) {
                System.out.println("Por favor, ingresa un número entero válido.");
                orlando.next(); // Limpiar el buffer
            }
            
            cantidad = orlando.nextInt();
            
            // Sumar el valor al total
            resultado += (cantidad * dinero[i]);
        }

        // Mostrar el total con dos decimales
        System.out.printf("Total almacenado: $%.2f\n", resultado);
    }
}

