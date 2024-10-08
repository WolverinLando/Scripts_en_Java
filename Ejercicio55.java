/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  28-07-2023
 * Correo: urbanorlando79@gmail.com
 *
 * Ejercicio: Calcular el mayor de dos numeros leidos del teclado y visualzarlos en pantalla.*/

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
		  int Numero1,Numero2;
        Numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero 1:"));
        Numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero 2:"));
        if(Numero1 > Numero2){
            JOptionPane.showMessageDialog(null, "El numero mayor es: " + Numero1);
        }
		  else if(Numero1 == Numero2){
            JOptionPane.showMessageDialog(null, "Los numeros son iguales");
        }
		  else{
            JOptionPane.showMessageDialog(null, "El numero mayor es: " + Numero2);
        }
    }
}


