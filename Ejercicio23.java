/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 * Algoritmo para determinar si eres mayor de edad */
 
import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        int edad;
		// Creacion de objeto
        Scanner orlando = new Scanner(System.in);
		// Entrada de datos
        System.out.print("Edad: ");
        edad = orlando.nextInt();
        if(edad >= 18){
            System.out.println("Eres mayor de edad");
        } 
	    else{
            System.out.println("Eres menor de edad");
        }
    }
}

