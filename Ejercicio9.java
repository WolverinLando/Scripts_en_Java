/* Autor:  Orlando Urbano Trejo @Lando
 * Fecha:  14-07-2023
 * Correo: orlandourbanotrejo@gmail.com
 *
 * Algoritmo para determinar el sueldo semnanal de N trabajadores y aplicar descuentos dependiendo de las horas de aplicara un descuento */

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
    	int trabajadores;
        double horasTrabajadas, sueldoHora, salario = 0, nuevoSalario = 0, total = 0;
        String[] nombres = new String[20];
		// Creacion de objeto
        Scanner orlando = new Scanner(System.in);
		// Datos de entrada
        System.out.print("Numero de trabajadores: ");
        trabajadores = orlando.nextInt();
        for(int i = 0; i < trabajadores; i++){
			// Solcitud de datos de entrada
            System.out.print("Nombre del trabajador: " + (i + 1) + "\n");
         	nombres[i] = orlando.next();
			System.out.print("Horas trabajadas: ");
         	horasTrabajadas = orlando.nextDouble();
			System.out.print("Sueldo por hora: ");
         	sueldoHora = orlando.nextDouble();
			salario = horasTrabajadas * sueldoHora;
         	// Condicionales
			if(salario >= 0 && salario <= 150){
                nuevoSalario = salario * 0.5;
	        } 
	        else if(salario > 150 && salario <= 300){
                nuevoSalario = salario * 0.7;
            } 
	        else if(salario > 300 && salario <= 450){
                nuevoSalario = salario * 0.9;
            } 
	        else{
                nuevoSalario = 0;
            }
   			total = salario - nuevoSalario;
         	System.out.print("Trabajador: " + nombres[i] + "\n");
         	System.out.print("Salario final: " + total + "\n");
        }
    }
}

