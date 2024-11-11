/* Autor: Orlando Urbano Trejo @Lando
 * Fecha: 14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 *
 * Algoritmo que calcula el precio total de una persona */

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        float precioKilometro, distancia;

        // Creación de objeto Scanner
        Scanner orlando = new Scanner(System.in);

        // Datos de entrada
        System.out.println("Introduce el precio por kilómetro (en pesos): ");
        precioKilometro = orlando.nextFloat();

        System.out.println("Introduce la cantidad de kilómetros a recorrer: ");
        distancia = orlando.nextFloat();

        // Cálculo y salida
        float precioTotal = precioKilometro * distancia;
        System.out.printf("El precio del boleto es: $%.2f\n", precioTotal);  // Mostrar con 2 decimales
    }
}

