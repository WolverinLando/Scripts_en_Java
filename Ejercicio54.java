/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  28-07-2023
 * Correo: urbanorlando79@gmail.com
 *
 * Ejercicio: Visualizar la tarifa de luz segun el gasto de corriente electrica, para un gasto menor de: 1000 Kw, la tarifa es de 1.2 entre 1000, 1850 Kw la tarifa es 1.0 y mayor de 1850 la tarifa es de 0.9 */

import javax.swing.JOptionPane;

public class Ejercicio54 {
    public static void main(String[] args) {
        int Tarifa;
        Tarifa = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la tarifa de luz eléctrica: "));
        if(Tarifa < 1000){
            System.out.println("Tu tarifa es de 1.2");
        } 
		  else if(Tarifa >= 1000 && Tarifa < 1850){
            System.out.println("Tu tarifa es de 1.0");
        } 
		  else{
            System.out.println("Tu tarifa es de 0.9");
        }
    }
}

