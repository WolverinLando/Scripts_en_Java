/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejoi@gmail.com
 *
 * Algoritmo para calcular el descuento de un medicamento */ 

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        String nombre;
        double precio, total = 0;
		// Creacion de objeto
		Scanner orlando = new Scanner(System.in);
		// Datos de entrada
        System.out.print("Nombre: ");
        nombre = orlando.next();
        System.out.print("Precio del Medicamento: ");
        precio = orlando.nextDouble();
        total = precio - (precio * 0.35);
		System.out.println("Cliente: " + nombre + " el total a pagar es: $" + total);
    }
}

