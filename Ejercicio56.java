/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  28-07-2023
 * Correo: urbanorlando79@gmail.com
 *
 * Ejercicio: Ingresa un numero, calcula e imprime su raiz cuadrada, si el numero es negativo imprimir un mensaje que diga "Tiene raiz imaginaria" */

import java.util.Scanner;

public class Ejercicio56 {
    public static void main(String[] args) {
        int Numero;
		  double Resultado;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        Numero = scanner.nextInt();

        if(Numero > 1){
            Resultado = Math.sqrt(Numero);
            System.out.println("Raiz cuadrada: " + Resultado);
        }
		  else{
            System.out.println("Tiene raiz imaginaria");
        }
    }
}

