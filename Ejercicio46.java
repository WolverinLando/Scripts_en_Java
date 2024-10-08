/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  28-07-2023
 * Correo: urbanorlando79@gmail.com
 *
 * Ejercicio: Escribir un programa que lea los valores de los catetos de un triangulo rectangulo y calcule cual es la hipotenusa, area y el perimetro del triangulo mediante las siguientes expresiones */

import java.util.Scanner;

public class Ejercicio46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Cateto1, Cateto2, Hipotenusa = 0, Area = 0, Perimetro = 0; 
        System.out.print("Valor del cateto 1: ");
        Cateto1 = scanner.nextDouble();
        System.out.print("Valor del cateto 2: ");
        Cateto2 = scanner.nextDouble();

        Hipotenusa = Math.sqrt(Cateto1 * Cateto1 + Cateto2 * Cateto2);
        Area = (Cateto1 * Cateto2) / 2;
        Perimetro = Cateto1 + Cateto2 + Hipotenusa;

        System.out.println("Hipotenusa: " + Hipotenusa);
        System.out.println("Area: " + Area);
        System.out.println("Perimetro: " + Perimetro);
    }
}

